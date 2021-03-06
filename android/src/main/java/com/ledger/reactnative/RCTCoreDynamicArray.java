// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from dynamic.djinni

package com.ledger.reactnative;

import co.ledger.core.DynamicArray;
import co.ledger.core.DynamicObject;
import co.ledger.core.DynamicType;
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

/** A collection of dynamic values in an array. Values can be retrieved via their indexes. */
@ReactModule(name = "RCTCoreDynamicArray")
public class RCTCoreDynamicArray extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, DynamicArray> javaObjects;
    public Map<String, DynamicArray> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreDynamicArray(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, DynamicArray>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreDynamicArray";
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
            promise.reject("Failed to release instance of RCTCoreDynamicArray", "First parameter of RCTCoreDynamicArray::release should be an instance of RCTCoreDynamicArray");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, DynamicArray> elem : this.javaObjects.entrySet())
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
    public static byte[] hexStringToByteArray(String hexString)
    {
        int hexStringLength = hexString.length();
        byte[] data = new byte[hexStringLength / 2];
        for (int i = 0; i < hexStringLength; i += 2)
        {
            data[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4) + Character.digit(hexString.charAt(i+1), 16));
        }
        return data;
    }
    static final String HEXES = "0123456789ABCDEF";
    public static String byteArrayToHexString( byte [] data)
    {
        if (data == null)
        {
            return null;
        }
        final StringBuilder hexStringBuilder = new StringBuilder( 2 * data.length );
        for ( final byte b : data )
        {
            hexStringBuilder.append(HEXES.charAt((b & 0xF0) >> 4)).append(HEXES.charAt((b & 0x0F)));
        }
        return hexStringBuilder.toString();
    }

    /**
     * Get count of values.
     * @return 64-bit integer
     */
    @ReactMethod
    public void size(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            long javaResult = currentInstanceObj.size();
            WritableNativeMap result = new WritableNativeMap();
            result.putDouble("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Push a 32-bit integer.
     * @param value, 32-bit integer
     * @return DynamicArray with value stored in it
     */
    @ReactMethod
    public void pushInt(ReadableMap currentInstance, int value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            DynamicArray javaResult = currentInstanceObj.pushInt(value);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDynamicArray rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDynamicArray.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDynamicArray");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Push a 64-bit integer.
     * @param value, 64-bit integer
     * @return DynamicArray with value stored in it
     */
    @ReactMethod
    public void pushLong(ReadableMap currentInstance, long value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            DynamicArray javaResult = currentInstanceObj.pushLong(value);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDynamicArray rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDynamicArray.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDynamicArray");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Push a string.
     * @param value, string
     * @return DynamicArray with value stored in it
     */
    @ReactMethod
    public void pushString(ReadableMap currentInstance, String value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            DynamicArray javaResult = currentInstanceObj.pushString(value);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDynamicArray rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDynamicArray.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDynamicArray");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Push a double.
     * @param value, double
     * @return DynamicArray with value stored in it
     */
    @ReactMethod
    public void pushDouble(ReadableMap currentInstance, double value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            DynamicArray javaResult = currentInstanceObj.pushDouble(value);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDynamicArray rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDynamicArray.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDynamicArray");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Push a binary.
     * @param value, binary
     * @return DynamicArray with value stored in it
     */
    @ReactMethod
    public void pushData(ReadableMap currentInstance, String value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            byte [] javaParam_0 = hexStringToByteArray(value);

            DynamicArray javaResult = currentInstanceObj.pushData(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDynamicArray rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDynamicArray.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDynamicArray");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Push a bool.
     * @param value, bool
     * @return DynamicArray with value stored in it
     */
    @ReactMethod
    public void pushBoolean(ReadableMap currentInstance, boolean value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            DynamicArray javaResult = currentInstanceObj.pushBoolean(value);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDynamicArray rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDynamicArray.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDynamicArray");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Push a dynamic object.
     * @param value, DynamicObject
     * @return DynamicArray with value stored in it
     */
    @ReactMethod
    public void pushObject(ReadableMap currentInstance, ReadableMap value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreDynamicObject rctParam_value = this.reactContext.getNativeModule(RCTCoreDynamicObject.class);
            DynamicObject javaParam_0 = rctParam_value.getJavaObjects().get(value.getString("uid"));
            DynamicArray javaResult = currentInstanceObj.pushObject(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDynamicArray rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDynamicArray.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDynamicArray");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Push a dynamic array.
     * @param value, DynamicArray
     * @return DynamicArray with value stored in it
     */
    @ReactMethod
    public void pushArray(ReadableMap currentInstance, ReadableMap value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreDynamicArray rctParam_value = this.reactContext.getNativeModule(RCTCoreDynamicArray.class);
            DynamicArray javaParam_0 = rctParam_value.getJavaObjects().get(value.getString("uid"));
            DynamicArray javaResult = currentInstanceObj.pushArray(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDynamicArray rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDynamicArray.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDynamicArray");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get a string at a given index.
     * @param index, 64-bit integer
     * @return Optional string
     */
    @ReactMethod
    public void getString(ReadableMap currentInstance, long index, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getString(index);
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
     * Get 32-bit integer at a given index.
     * @param index, 64-bit integer
     * @return Optional 32-bit integer
     */
    @ReactMethod
    public void getInt(ReadableMap currentInstance, long index, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            Integer javaResult = currentInstanceObj.getInt(index);
            WritableNativeMap result = new WritableNativeMap();
            if (javaResult == null)
            {
                promise.resolve(javaResult);
                return;
            }
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get 64-bit integer at a given index.
     * @param index, 64-bit integer
     * @return Optional 64-bit integer
     */
    @ReactMethod
    public void getLong(ReadableMap currentInstance, long index, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            Long javaResult = currentInstanceObj.getLong(index);
            WritableNativeMap result = new WritableNativeMap();
            if (javaResult == null)
            {
                promise.resolve(javaResult);
                return;
            }
            result.putDouble("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get double at a given index.
     * @param index, 64-bit integer
     * @return Optional double
     */
    @ReactMethod
    public void getDouble(ReadableMap currentInstance, long index, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            Double javaResult = currentInstanceObj.getDouble(index);
            WritableNativeMap result = new WritableNativeMap();
            if (javaResult == null)
            {
                promise.resolve(javaResult);
                return;
            }
            result.putDouble("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get binary at a given index.
     * @param index, 64-bit integer
     * @return Optional binary
     */
    @ReactMethod
    public void getData(ReadableMap currentInstance, long index, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            byte[] javaResult = currentInstanceObj.getData(index);
            WritableNativeMap result = new WritableNativeMap();
            String finalJavaResult = byteArrayToHexString(javaResult);
            result.putString("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get bool at a given index.
     * @param index, 64-bit integer
     * @return Optional bool
     */
    @ReactMethod
    public void getBoolean(ReadableMap currentInstance, long index, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            Boolean javaResult = currentInstanceObj.getBoolean(index);
            WritableNativeMap result = new WritableNativeMap();
            if (javaResult == null)
            {
                promise.resolve(javaResult);
                return;
            }
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get DynamicObject object at a given index.
     * @param index, 64-bit integer
     * @return Optional DynamicObject
     */
    @ReactMethod
    public void getObject(ReadableMap currentInstance, long index, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            DynamicObject javaResult = currentInstanceObj.getObject(index);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDynamicObject rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDynamicObject.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDynamicObject");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get DynamicArray object at a given index.
     * @param index, 64-bit integer
     * @return Optional DynamicArray
     */
    @ReactMethod
    public void getArray(ReadableMap currentInstance, long index, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            DynamicArray javaResult = currentInstanceObj.getArray(index);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDynamicArray rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDynamicArray.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDynamicArray");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Concatenate current DynamicArray with another one.
     * @param array, DynamicArray object to concatenate with
     * @return DynamicArray object, concatenated DynamicArray
     */
    @ReactMethod
    public void concat(ReadableMap currentInstance, ReadableMap array, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreDynamicArray rctParam_array = this.reactContext.getNativeModule(RCTCoreDynamicArray.class);
            DynamicArray javaParam_0 = rctParam_array.getJavaObjects().get(array.getString("uid"));
            DynamicArray javaResult = currentInstanceObj.concat(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDynamicArray rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDynamicArray.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDynamicArray");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get type of value stored at a given index.
     * @param index, 64 bits integer
     * @return Optional DynamicType enum entry
     */
    @ReactMethod
    public void getType(ReadableMap currentInstance, long index, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            DynamicType javaResult = currentInstanceObj.getType(index);
            WritableNativeMap result = new WritableNativeMap();
            int finalJavaResult = javaResult.ordinal();
            result.putInt("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Delete value stored at given index.
     * @param index, 64 bits integer
     * @return bool, true if deletion succeeded
     */
    @ReactMethod
    public void remove(ReadableMap currentInstance, long index, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.remove(index);
            WritableNativeMap result = new WritableNativeMap();
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Dump whole object's content as string.
     * @return string, the string representation of the array
     */
    @ReactMethod
    public void dump(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.dump();
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
     * Serialize whole object to a binary.
     * @return binary, the serialized array
     */
    @ReactMethod
    public void serialize(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            byte[] javaResult = currentInstanceObj.serialize();
            WritableNativeMap result = new WritableNativeMap();
            String finalJavaResult = byteArrayToHexString(javaResult);
            result.putString("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get readonly status of object.
     * @return bool, whether the array is in read-only mode
     */
    @ReactMethod
    public void isReadOnly(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DynamicArray currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isReadOnly();
            WritableNativeMap result = new WritableNativeMap();
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Create a new instance of DynamicArray class.
     * @return DynamicArray, a brand new instance of a dynamic array
     */
    @ReactMethod
    public void newInstance(Promise promise) {
        try
        {
            DynamicArray javaResult = DynamicArray.newInstance();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDynamicArray rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDynamicArray.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDynamicArray");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Parse a binary to a DynamicArray.
     * @param serialized, binary to parse
     * @return Optional, the unserialized dynamic array
     */
    @ReactMethod
    public void load(String serialized, Promise promise) {
        try
        {
            byte [] javaParam_0 = hexStringToByteArray(serialized);

            DynamicArray javaResult = DynamicArray.load(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDynamicArray rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDynamicArray.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDynamicArray");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
