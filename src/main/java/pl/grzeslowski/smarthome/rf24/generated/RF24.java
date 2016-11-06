/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package pl.grzeslowski.smarthome.rf24.generated;

public class RF24 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RF24(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RF24 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        rf24bcmjavaJNI.delete_RF24(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RF24(short _cepin, short _cspin) {
    this(rf24bcmjavaJNI.new_RF24__SWIG_0(_cepin, _cspin), true);
  }

  public RF24(short _cepin, short _cspin, long spispeed) {
    this(rf24bcmjavaJNI.new_RF24__SWIG_1(_cepin, _cspin, spispeed), true);
  }

  public boolean begin() {
    return rf24bcmjavaJNI.RF24_begin(swigCPtr, this);
  }

  public void startListening() {
    rf24bcmjavaJNI.RF24_startListening(swigCPtr, this);
  }

  public void stopListening() {
    rf24bcmjavaJNI.RF24_stopListening(swigCPtr, this);
  }

  public boolean available() {
    return rf24bcmjavaJNI.RF24_available__SWIG_0(swigCPtr, this);
  }

  public void read(byte[] buf, short len) {
    rf24bcmjavaJNI.RF24_read(swigCPtr, this, buf, len);
  }

  public boolean write(byte[] buf, short len) {
    return rf24bcmjavaJNI.RF24_write__SWIG_0(swigCPtr, this, buf, len);
  }

  public void openWritingPipe(byte[] address) {
    rf24bcmjavaJNI.RF24_openWritingPipe__SWIG_0(swigCPtr, this, address);
  }

  public void openReadingPipe(short number, byte[] address) {
    rf24bcmjavaJNI.RF24_openReadingPipe__SWIG_0(swigCPtr, this, number, address);
  }

  public void printDetails() {
    rf24bcmjavaJNI.RF24_printDetails(swigCPtr, this);
  }

  public boolean available(short[] pipe_num) {
    return rf24bcmjavaJNI.RF24_available__SWIG_1(swigCPtr, this, pipe_num);
  }

  public boolean rxFifoFull() {
    return rf24bcmjavaJNI.RF24_rxFifoFull(swigCPtr, this);
  }

  public void powerDown() {
    rf24bcmjavaJNI.RF24_powerDown(swigCPtr, this);
  }

  public void powerUp() {
    rf24bcmjavaJNI.RF24_powerUp(swigCPtr, this);
  }

  public boolean write(byte[] buf, short len, boolean multicast) {
    return rf24bcmjavaJNI.RF24_write__SWIG_1(swigCPtr, this, buf, len, multicast);
  }

  public boolean writeFast(byte[] buf, short len) {
    return rf24bcmjavaJNI.RF24_writeFast__SWIG_0(swigCPtr, this, buf, len);
  }

  public boolean writeFast(byte[] buf, short len, boolean multicast) {
    return rf24bcmjavaJNI.RF24_writeFast__SWIG_1(swigCPtr, this, buf, len, multicast);
  }

  public boolean writeBlocking(byte[] buf, short len, long timeout) {
    return rf24bcmjavaJNI.RF24_writeBlocking(swigCPtr, this, buf, len, timeout);
  }

  public boolean txStandBy() {
    return rf24bcmjavaJNI.RF24_txStandBy__SWIG_0(swigCPtr, this);
  }

  public boolean txStandBy(long timeout, boolean startTx) {
    return rf24bcmjavaJNI.RF24_txStandBy__SWIG_1(swigCPtr, this, timeout, startTx);
  }

  public boolean txStandBy(long timeout) {
    return rf24bcmjavaJNI.RF24_txStandBy__SWIG_2(swigCPtr, this, timeout);
  }

  public void writeAckPayload(short pipe, byte[] buf, short len) {
    rf24bcmjavaJNI.RF24_writeAckPayload(swigCPtr, this, pipe, buf, len);
  }

  public boolean isAckPayloadAvailable() {
    return rf24bcmjavaJNI.RF24_isAckPayloadAvailable(swigCPtr, this);
  }

  public void whatHappened(boolean[] tx_ok, boolean[] tx_fail, boolean[] rx_ready) {
    rf24bcmjavaJNI.RF24_whatHappened(swigCPtr, this, tx_ok, tx_fail, rx_ready);
  }

  public void startFastWrite(byte[] buf, short len, boolean multicast, boolean startTx) {
    rf24bcmjavaJNI.RF24_startFastWrite__SWIG_0(swigCPtr, this, buf, len, multicast, startTx);
  }

  public void startFastWrite(byte[] buf, short len, boolean multicast) {
    rf24bcmjavaJNI.RF24_startFastWrite__SWIG_1(swigCPtr, this, buf, len, multicast);
  }

  public void startWrite(byte[] buf, short len, boolean multicast) {
    rf24bcmjavaJNI.RF24_startWrite(swigCPtr, this, buf, len, multicast);
  }

  public void reUseTX() {
    rf24bcmjavaJNI.RF24_reUseTX(swigCPtr, this);
  }

  public short flush_tx() {
    return rf24bcmjavaJNI.RF24_flush_tx(swigCPtr, this);
  }

  public boolean testCarrier() {
    return rf24bcmjavaJNI.RF24_testCarrier(swigCPtr, this);
  }

  public boolean testRPD() {
    return rf24bcmjavaJNI.RF24_testRPD(swigCPtr, this);
  }

  public boolean isValid() {
    return rf24bcmjavaJNI.RF24_isValid(swigCPtr, this);
  }

  public void closeReadingPipe(short pipe) {
    rf24bcmjavaJNI.RF24_closeReadingPipe(swigCPtr, this, pipe);
  }

  public void setFailureDetected(boolean value) {
    rf24bcmjavaJNI.RF24_failureDetected_set(swigCPtr, this, value);
  }

  public boolean getFailureDetected() {
    return rf24bcmjavaJNI.RF24_failureDetected_get(swigCPtr, this);
  }

  public void setAddressWidth(short a_width) {
    rf24bcmjavaJNI.RF24_setAddressWidth(swigCPtr, this, a_width);
  }

  public void setRetries(short delay, short count) {
    rf24bcmjavaJNI.RF24_setRetries(swigCPtr, this, delay, count);
  }

  public void setChannel(short channel) {
    rf24bcmjavaJNI.RF24_setChannel(swigCPtr, this, channel);
  }

  public short getChannel() {
    return rf24bcmjavaJNI.RF24_getChannel(swigCPtr, this);
  }

  public void setPayloadSize(short size) {
    rf24bcmjavaJNI.RF24_setPayloadSize(swigCPtr, this, size);
  }

  public short getPayloadSize() {
    return rf24bcmjavaJNI.RF24_getPayloadSize(swigCPtr, this);
  }

  public short getDynamicPayloadSize() {
    return rf24bcmjavaJNI.RF24_getDynamicPayloadSize(swigCPtr, this);
  }

  public void enableAckPayload() {
    rf24bcmjavaJNI.RF24_enableAckPayload(swigCPtr, this);
  }

  public void enableDynamicPayloads() {
    rf24bcmjavaJNI.RF24_enableDynamicPayloads(swigCPtr, this);
  }

  public void enableDynamicAck() {
    rf24bcmjavaJNI.RF24_enableDynamicAck(swigCPtr, this);
  }

  public boolean isPVariant() {
    return rf24bcmjavaJNI.RF24_isPVariant(swigCPtr, this);
  }

  public void setAutoAck(boolean enable) {
    rf24bcmjavaJNI.RF24_setAutoAck__SWIG_0(swigCPtr, this, enable);
  }

  public void setAutoAck(short pipe, boolean enable) {
    rf24bcmjavaJNI.RF24_setAutoAck__SWIG_1(swigCPtr, this, pipe, enable);
  }

  public void setPALevel(short level) {
    rf24bcmjavaJNI.RF24_setPALevel(swigCPtr, this, level);
  }

  public short getPALevel() {
    return rf24bcmjavaJNI.RF24_getPALevel(swigCPtr, this);
  }

  public boolean setDataRate(rf24_datarate_e speed) {
    return rf24bcmjavaJNI.RF24_setDataRate(swigCPtr, this, speed.swigValue());
  }

  public rf24_datarate_e getDataRate() {
    return rf24_datarate_e.swigToEnum(rf24bcmjavaJNI.RF24_getDataRate(swigCPtr, this));
  }

  public void setCRCLength(rf24_crclength_e length) {
    rf24bcmjavaJNI.RF24_setCRCLength(swigCPtr, this, length.swigValue());
  }

  public rf24_crclength_e getCRCLength() {
    return rf24_crclength_e.swigToEnum(rf24bcmjavaJNI.RF24_getCRCLength(swigCPtr, this));
  }

  public void disableCRC() {
    rf24bcmjavaJNI.RF24_disableCRC(swigCPtr, this);
  }

  public void maskIRQ(boolean tx_ok, boolean tx_fail, boolean rx_ready) {
    rf24bcmjavaJNI.RF24_maskIRQ(swigCPtr, this, tx_ok, tx_fail, rx_ready);
  }

  public void openReadingPipe(short number, java.math.BigInteger address) {
    rf24bcmjavaJNI.RF24_openReadingPipe__SWIG_1(swigCPtr, this, number, address);
  }

  public void openWritingPipe(java.math.BigInteger address) {
    rf24bcmjavaJNI.RF24_openWritingPipe__SWIG_1(swigCPtr, this, address);
  }

}
