package pl.grzeslowski.smarthome.rf24.examples;

import org.apache.commons.lang3.time.DurationFormatUtils;
import pl.grzeslowski.smarthome.rf24.Rf24Adapter;
import pl.grzeslowski.smarthome.rf24.examples.ping_pong.Rf24PingPongAbstract;
import pl.grzeslowski.smarthome.rf24.exceptions.ReadRf24Exception;
import pl.grzeslowski.smarthome.rf24.exceptions.WriteRf24Exception;
import pl.grzeslowski.smarthome.rf24.helpers.Pipe;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Rf24PingPongServerExample extends Rf24PingPongAbstract {
    static {
        Rf24Adapter.loadLibrary();
    }

    public static final Pipe WRITE_PIPE = new Pipe("1Node");
    public static final Pipe READ_PIPE = new Pipe("2Node");

    private static final long WAITING_FOR_RESPONSE_TIME = TimeUnit.SECONDS.toMillis(1);
    private static final long TIME_TO_SLEEP = TimeUnit.SECONDS.toMillis(1);

    private final long numberOfSends;

    public static void main(String[] args) throws Exception {
        runExample(new Rf24PingPongServerExample(args));
    }

    public Rf24PingPongServerExample(String[] args) {
        super(args, WRITE_PIPE, READ_PIPE);
        numberOfSends = argsReader.readNumberOfSends(args);
    }

    @Override
    public void run() throws InterruptedException {
        for (long counter = 1; counter <= numberOfSends; counter++) {
            logger.info("Iteration #{}", counter);

            // send
            send();

            // read
            read();

            // Sleep
            Thread.sleep(TIME_TO_SLEEP);
        }
    }

    private void send() {
        long time = new Date().getTime();
        logger.info("Now sending {}...", time);
        sendBuffer.clear();
        sendBuffer.putLong(time);
        try {
            final boolean wrote = rf24.write(WRITE_PIPE, sendBuffer.array());
            if (!wrote) {
                logger.error("Failed sending {}!", time);
            }
        } catch (WriteRf24Exception ex) {
            logger.error("Failed sending " + time + "!", ex);
        }
    }

    private void read() {
        readBuffer.clear();
        final long startedAt = new Date().getTime();
        boolean wasRead = false;
        try {
            while (!wasRead && System.currentTimeMillis() <= startedAt + WAITING_FOR_RESPONSE_TIME) {
                wasRead = rf24.read(READ_PIPE, readBuffer);
            }
        } catch (ReadRf24Exception ex) {
            logger.error("Error while reading!", ex);
        }

        if (wasRead) {
            final long response = readBuffer.getLong();
            final long now = new Date().getTime();
            final long roundTripTime = now - response;
            logger.info("Got {}, Round trip time {} [s].", response, DurationFormatUtils.formatDuration(roundTripTime, "ss.SS", true));
        } else {
            logger.error("Timeout!");
        }
    }
}
