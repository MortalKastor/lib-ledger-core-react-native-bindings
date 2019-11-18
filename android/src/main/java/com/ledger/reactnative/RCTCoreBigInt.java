// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from big_int.djinni

package com.ledger.reactnative;

import co.ledger.core.BigInt;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.TimeZone;
import java.util.UUID;

/** Immutable class representing a potentially very long number. */
@ReactModule(name = "RCTCoreBigInt")
public class RCTCoreBigInt extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, BigInt> javaObjects;
    public Map<String, BigInt> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreBigInt(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, BigInt>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreBigInt";
    }
    @ReactMethod
    public void release(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            this.javaObjects.remove(uid);
            promise.resolve(0);
        }
        else
        {
            promise.reject("Failed to release instance of RCTCoreBigInt", "First parameter of RCTCoreBigInt::release should be an instance of RCTCoreBigInt");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, BigInt> elem : this.javaObjects.entrySet())
        {
            result.pushString(elem.getKey());
        }
        promise.resolve(result);
    }
    @ReactMethod
    public void flush(Promise promise)
    {
        this.javaObjects.clear();
        promise.resolve(0);
    }
    @ReactMethod
    public void isNull(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (this.javaObjects.get(uid) == null)
            {
                promise.resolve(true);
                return;
            }
            else
            {
                promise.resolve(false);
                return;
            }
        }
        promise.resolve(true);
    }

    /**
     * Adds two BigInt and returns a new BigInt with the result.
     * @params i Value to be added to this BigInt
     * @return The result of this + i
     */
    @ReactMethod
    public void add(ReadableMap currentInstance, ReadableMap i, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BigInt currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBigInt rctParam_i = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            BigInt javaParam_0 = rctParam_i.getJavaObjects().get(i.getString("uid"));
            BigInt javaResult = currentInstanceObj.add(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBigInt rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBigInt");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Subtracts two BigInt and returns a new BigInt with result.
     * @params i Value to be subtracted to this BigInt
     * @return The result of this - i
     */
    @ReactMethod
    public void subtract(ReadableMap currentInstance, ReadableMap i, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BigInt currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBigInt rctParam_i = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            BigInt javaParam_0 = rctParam_i.getJavaObjects().get(i.getString("uid"));
            BigInt javaResult = currentInstanceObj.subtract(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBigInt rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBigInt");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Multiplies two BigInt and returns a new BigInt with result.
     * @params i Value to be multiplied by this BigInt
     * @return The result of this * i
     */
    @ReactMethod
    public void multiply(ReadableMap currentInstance, ReadableMap i, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BigInt currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBigInt rctParam_i = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            BigInt javaParam_0 = rctParam_i.getJavaObjects().get(i.getString("uid"));
            BigInt javaResult = currentInstanceObj.multiply(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBigInt rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBigInt");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Divides two BigInt and returns a new BigInt with result.
     * @params i Value by which this BigInt will be divided
     * @return The result of this / i
     */
    @ReactMethod
    public void divide(ReadableMap currentInstance, ReadableMap i, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BigInt currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBigInt rctParam_i = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            BigInt javaParam_0 = rctParam_i.getJavaObjects().get(i.getString("uid"));
            BigInt javaResult = currentInstanceObj.divide(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBigInt rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBigInt");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Divides two BigInt and returns a new BigInt with result of the division and the remainder.
     * @params i Value by which this BigInteger is to be divided, and the remainder computed
     * @return A tuple of [this / i, this % i]
     */
    @ReactMethod
    public void divideAndRemainder(ReadableMap currentInstance, ReadableMap i, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BigInt currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBigInt rctParam_i = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            BigInt javaParam_0 = rctParam_i.getJavaObjects().get(i.getString("uid"));
            ArrayList<BigInt> javaResult = currentInstanceObj.divideAndRemainder(javaParam_0);

            WritableNativeArray result = new WritableNativeArray();
            for (BigInt javaResult_elem : javaResult)
            {
                String javaResult_elem_uuid = UUID.randomUUID().toString();
                RCTCoreBigInt rctImpl_javaResult_elem = this.reactContext.getNativeModule(RCTCoreBigInt.class);
                rctImpl_javaResult_elem.getJavaObjects().put(javaResult_elem_uuid, javaResult_elem);
                WritableNativeMap result_elem = new WritableNativeMap();
                result_elem.putString("type","RCTCoreBigInt");
                result_elem.putString("uid",javaResult_elem_uuid);
                result.pushMap(result_elem);
            }

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Raises this BigInt with an interger value.
     * @params i The exponent to which thi BigInt is raised
     * @return The result of this ^ exponent
     */
    @ReactMethod
    public void pow(ReadableMap currentInstance, int exponent, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BigInt currentInstanceObj = this.javaObjects.get(sUid);

            BigInt javaResult = currentInstanceObj.pow(exponent);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBigInt rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBigInt");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Formats this BigInt to a decimal string (e.g. BigInt("12345").toDecimalString(1, ".", ",") => "1,234.5").
     * @params precision The power of ten by wich this BigInt is divided
     * @params decimalSeparator The separator to use between the integer part and the decimal part
     * @params thousandSeparator The separator to use between each group of thousand units
     * @return The BigInt formatted as a decimal string
     */
    @ReactMethod
    public void toDecimalString(ReadableMap currentInstance, int precision, String decimalSeparator, String thousandSeparator, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BigInt currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.toDecimalString(precision, decimalSeparator, thousandSeparator);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Formats this BigInt to the interger representation of its internal value.
     * @params radix The radix of the number representation in which to format (right now 10 or 16)
     */
    @ReactMethod
    public void toString(ReadableMap currentInstance, int radix, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BigInt currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.toString(radix);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Returns the int representation of this BigInt. Note that if the BigInt is greater than 4 bytes the returned value
     * will be meaningless.
     * @return The int representation of this BigInt
     */
    @ReactMethod
    public void intValue(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BigInt currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.intValue();
            WritableNativeMap result = new WritableNativeMap();
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Compares two BigInt together.
     * @param i The value to compare with this BigInt
     * @return a positive value if this > i. A negative value if this < i. 0 if the two BigInts are equal
     */
    @ReactMethod
    public void compare(ReadableMap currentInstance, ReadableMap i, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BigInt currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBigInt rctParam_i = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            BigInt javaParam_0 = rctParam_i.getJavaObjects().get(i.getString("uid"));
            int javaResult = currentInstanceObj.compare(javaParam_0);
            WritableNativeMap result = new WritableNativeMap();
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Creates a BigInt with a decimal string (e.g. "1.2000"). Note that every non numeric characters (except the decimal separator)
     * are ignored (e.g. "1ledger000" will be equal to "1000").
     * @param s The string with the decimal representation of the BigInt
     * @param precision The power of ten by which your decimal number must be multiplied in order to get his integer representation
     * @params decimalSeparator The decimal separator used by this string representation
     * @return The created BigInt
     */
    @ReactMethod
    public void fromDecimalString(String s, int precision, String decimalSeparator, Promise promise) {
        try
        {
            BigInt javaResult = BigInt.fromDecimalString(s, precision, decimalSeparator);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBigInt rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBigInt");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Creates a BigInt with an integer string expressed in hexadecimal or decimal radix.
     * @param s The string to parse
     * @param radix The radix of the number representation (right now 10 or 16)
     * @return The created BigInt
     */
    @ReactMethod
    public void fromIntegerString(String s, int radix, Promise promise) {
        try
        {
            BigInt javaResult = BigInt.fromIntegerString(s, radix);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBigInt rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBigInt");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Creates a BigInt from a int64 value.
     * @param l The value to convert
     * @return The created BigInt
     */
    @ReactMethod
    public void fromLong(long l, Promise promise) {
        try
        {
            BigInt javaResult = BigInt.fromLong(l);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBigInt rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBigInt.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBigInt");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
