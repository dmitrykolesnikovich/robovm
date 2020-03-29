/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.robovm.libimobiledevice.binding;

public class DebugServerClientRefOut {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DebugServerClientRefOut(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DebugServerClientRefOut obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LibIMobileDeviceJNI.delete_DebugServerClientRefOut(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DebugServerClientRef getValue() {
    long cPtr = LibIMobileDeviceJNI.DebugServerClientRefOut_value_get(swigCPtr, this);
    return (cPtr == 0) ? null : new DebugServerClientRef(cPtr, false);
  }

  public DebugServerClientRefOut() {
    this(LibIMobileDeviceJNI.new_DebugServerClientRefOut(), true);
  }

}