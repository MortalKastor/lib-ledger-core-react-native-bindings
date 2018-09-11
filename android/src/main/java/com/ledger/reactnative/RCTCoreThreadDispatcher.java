// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from thread_dispatcher.djinni

package com.ledger.reactnative;

import co.ledger.core.ExecutionContext;
import co.ledger.core.Lock;
import co.ledger.core.ThreadDispatcher;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**Class representing a thread dispatcher */
public class RCTCoreThreadDispatcher extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, ThreadDispatcherImpl> javaObjects;
    public Map<String, ThreadDispatcherImpl> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreThreadDispatcher(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, ThreadDispatcherImpl>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreThreadDispatcher";
    }
    @ReactMethod
    public void newInstance(Promise promise)
    {
        ThreadDispatcherImpl newInstance = new ThreadDispatcherImpl(this.reactContext);
        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, newInstance);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreThreadDispatcher");
        finalResult.putString("uid",uuid);
        promise.resolve(finalResult);
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
            promise.reject("Failed to release instance of RCTCoreThreadDispatcher", "First parameter of RCTCoreThreadDispatcher::release should be an instance of RCTCoreThreadDispatcher");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, ThreadDispatcherImpl> elem : this.javaObjects.entrySet())
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

    /**
     *Get an execution context where tasks are executed sequentially
     *@param name, string, name of execution context to retrieve
     *@return ExecutionContext object
     */
    @ReactMethod
    public void getSerialExecutionContext(ReadableMap currentInstance, String name, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            ThreadDispatcherImpl currentInstanceObj = this.javaObjects.get(sUid);

            ExecutionContext javaResult = currentInstanceObj.getSerialExecutionContext(name);

            String uuid = UUID.randomUUID().toString();
            RCTCoreExecutionContext rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreExecutionContext.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, (ExecutionContextImpl)javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreExecutionContext");
            result.putString("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get an execution context where tasks are executed in parallel thanks to a thread pool
     *where a system of inter-thread communication was designed
     *@param name, string, name of execution context to retrieve
     *@return ExecutionContext object
     */
    @ReactMethod
    public void getThreadPoolExecutionContext(ReadableMap currentInstance, String name, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            ThreadDispatcherImpl currentInstanceObj = this.javaObjects.get(sUid);

            ExecutionContext javaResult = currentInstanceObj.getThreadPoolExecutionContext(name);

            String uuid = UUID.randomUUID().toString();
            RCTCoreExecutionContext rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreExecutionContext.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, (ExecutionContextImpl)javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreExecutionContext");
            result.putString("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get main execution context (generally where tasks that should never get blocked are executed)
     *@return ExecutionContext object
     */
    @ReactMethod
    public void getMainExecutionContext(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            ThreadDispatcherImpl currentInstanceObj = this.javaObjects.get(sUid);

            ExecutionContext javaResult = currentInstanceObj.getMainExecutionContext();

            String uuid = UUID.randomUUID().toString();
            RCTCoreExecutionContext rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreExecutionContext.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, (ExecutionContextImpl)javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreExecutionContext");
            result.putString("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get lock to handle multithreading
     *@return Lock object
     */
    @ReactMethod
    public void newLock(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            ThreadDispatcherImpl currentInstanceObj = this.javaObjects.get(sUid);

            Lock javaResult = currentInstanceObj.newLock();

            String uuid = UUID.randomUUID().toString();
            RCTCoreLock rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreLock.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, (LockImpl)javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreLock");
            result.putString("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}