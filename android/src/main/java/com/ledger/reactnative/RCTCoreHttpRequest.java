// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from http_client.djinni

package com.ledger.reactnative;

import co.ledger.core.Error;
import co.ledger.core.HttpMethod;
import co.ledger.core.HttpRequest;
import co.ledger.core.HttpUrlConnection;
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

/** Class representing an Http request. */
@ReactModule(name = "RCTCoreHttpRequest")
public class RCTCoreHttpRequest extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, HttpRequest> javaObjects;
    public Map<String, HttpRequest> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreHttpRequest(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, HttpRequest>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreHttpRequest";
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
            promise.reject("Failed to release instance of RCTCoreHttpRequest", "First parameter of RCTCoreHttpRequest::release should be an instance of RCTCoreHttpRequest");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, HttpRequest> elem : this.javaObjects.entrySet())
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
     * Get method of request.
     * @return HttpMethod enum entry
     */
    @ReactMethod
    public void getMethod(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            HttpRequest currentInstanceObj = this.javaObjects.get(sUid);

            HttpMethod javaResult = currentInstanceObj.getMethod();
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
     * Get headers set in the request.
     * @return Map with key and value of type string
     */
    @ReactMethod
    public void getHeaders(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            HttpRequest currentInstanceObj = this.javaObjects.get(sUid);

            HashMap<String, String> javaResult = currentInstanceObj.getHeaders();
            WritableNativeMap result = new WritableNativeMap();
            WritableNativeMap javaResult_map = new WritableNativeMap();
            for(String javaResult_key : javaResult.keySet())
            {
                String javaResult_elem_value = javaResult.get(javaResult_key);
                javaResult_map.putString(javaResult_key, javaResult_elem_value);
            }
            result.putMap("value", javaResult_map);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get body of request.
     * @return binary
     */
    @ReactMethod
    public void getBody(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            HttpRequest currentInstanceObj = this.javaObjects.get(sUid);

            byte[] javaResult = currentInstanceObj.getBody();
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
     * Get Url of request.
     * @return string
     */
    @ReactMethod
    public void getUrl(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            HttpRequest currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getUrl();
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
     * Method called when reauest is completed.
     * @param response, Optional HttpUrlConnection object, response of request if succeed
     * @param error, optional Error structure, error returned in case of request failure
     */
    @ReactMethod
    public void complete(ReadableMap currentInstance, Optional<ReadableMap> response, Optional<ReadableMap> error, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            HttpRequest currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreHttpUrlConnection rctParam_response = this.reactContext.getNativeModule(RCTCoreHttpUrlConnection.class);
            HttpUrlConnection javaParam_0 = rctParam_response.getJavaObjects().get(response.get().getString("uid"));
            HttpUrlConnectionImpl javaParam_0_java = (HttpUrlConnectionImpl)javaParam_0;
            javaParam_0_java.setPromise(promise);
            RCTCoreError rctParam_error = this.reactContext.getNativeModule(RCTCoreError.class);
            Error javaParam_1 = rctParam_error.getJavaObjects().get(error.get().getString("uid"));
            currentInstanceObj.complete(javaParam_0, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
