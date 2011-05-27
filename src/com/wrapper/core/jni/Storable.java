/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.wrapper.core.jni;

public class Storable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Storable(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Storable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_Storable(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static Storable Create(int eType, int thePackType) {
    long cPtr = otapiJNI.Storable_Create(eType, thePackType);
    return (cPtr == 0) ? null : new Storable(cPtr, false);
  }

  public static Storable ot_dynamic_cast(Storable pObject) {
    long cPtr = otapiJNI.Storable_ot_dynamic_cast(Storable.getCPtr(pObject), pObject);
    return (cPtr == 0) ? null : new Storable(cPtr, false);
  }

}