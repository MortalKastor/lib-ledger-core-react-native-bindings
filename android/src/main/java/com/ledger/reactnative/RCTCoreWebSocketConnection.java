// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from websocket_client.djinni

package com.ledger.reactnative;

import co.ledger.core.ErrorCode;
import co.ledger.core.WebSocketConnection;
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

/** A connection to a Web Socket. */
@ReactModule(name = "RCTCoreWebSocketConnection")
public class RCTCoreWebSocketConnection extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, WebSocketConnection> javaObjects;
    public Map<String, WebSocketConnection> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreWebSocketConnection(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, WebSocketConnection>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreWebSocketConnection";
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
            promise.reject("Failed to release instance of RCTCoreWebSocketConnection", "First parameter of RCTCoreWebSocketConnection::release should be an instance of RCTCoreWebSocketConnection");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, WebSocketConnection> elem : this.javaObjects.entrySet())
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
     * Callback to call upon successful connection.
     * @param connectionId, the ID of the Web Socket connection
     */
    @ReactMethod
    public void onConnect(ReadableMap currentInstance, int connectionId, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            WebSocketConnection currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.onConnect(connectionId);
            promise.resolve(0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Callback to call upon successful disconnection. */
    @ReactMethod
    public void onClose(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            WebSocketConnection currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.onClose();
            promise.resolve(0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Callback to call upon each incoming message.
     * @param data, the attached data to the input message
     */
    @ReactMethod
    public void onMessage(ReadableMap currentInstance, String data, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            WebSocketConnection currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.onMessage(data);
            promise.resolve(0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Callback to call when a Web Socket error occurs.
     * @param code, the error code
     * @param message, a description of the reason of the error
     */
    @ReactMethod
    public void onError(ReadableMap currentInstance, int code, String message, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            WebSocketConnection currentInstanceObj = this.javaObjects.get(sUid);

            if (code < 0 || ErrorCode.values().length <= code)
            {
                promise.reject("Enum error", "Failed to get enum ErrorCode");
                return;
            }
            ErrorCode javaParam_0 = ErrorCode.values()[code];
            currentInstanceObj.onError(javaParam_0, message);
            promise.resolve(0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void getConnectionId(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            WebSocketConnection currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.getConnectionId();
            WritableNativeMap result = new WritableNativeMap();
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
