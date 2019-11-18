// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from database.djinni

package com.ledger.reactnative;

import co.ledger.core.DatabaseBlob;
import co.ledger.core.DatabaseColumn;
import co.ledger.core.DatabaseResultSet;
import co.ledger.core.DatabaseStatement;
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

/**
 * A wrapper object around prepared SQL statements. lib-ledger-core will use placeholders when it needs to pass
 * parameters to a query. It will then  bind each parameter at a given position to a given value.
 */
@ReactModule(name = "RCTCoreDatabaseStatement")
public class RCTCoreDatabaseStatement extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, DatabaseStatementImpl> javaObjects;
    public Map<String, DatabaseStatementImpl> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreDatabaseStatement(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, DatabaseStatementImpl>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreDatabaseStatement";
    }
    @ReactMethod
    public void newInstance(Promise promise)
    {
        DatabaseStatementImpl newInstance = new DatabaseStatementImpl(this.reactContext);
        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, newInstance);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreDatabaseStatement");
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
            promise.reject("Failed to release instance of RCTCoreDatabaseStatement", "First parameter of RCTCoreDatabaseStatement::release should be an instance of RCTCoreDatabaseStatement");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, DatabaseStatementImpl> elem : this.javaObjects.entrySet())
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
     * Bind the designated parameter to the given 16bit integer value.
     * @param pos The position of the parameter in the query
     * @param value The value to bind
     */
    @ReactMethod
    public void bindShort(ReadableMap currentInstance, int pos, short value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseStatementImpl currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.bindShort(pos, value);
            promise.resolve(0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Bind the designated parameter to the given 32bit integer value.
     * @param pos The position of the parameter in the query
     * @param value The value to bind
     */
    @ReactMethod
    public void bindInt(ReadableMap currentInstance, int pos, int value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseStatementImpl currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.bindInt(pos, value);
            promise.resolve(0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Bind the designated parameter to the given 64bit integer value.
     * @param pos The position of the parameter in the query
     * @param value The value to bind
     */
    @ReactMethod
    public void bindLong(ReadableMap currentInstance, int pos, long value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseStatementImpl currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.bindLong(pos, value);
            promise.resolve(0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Bind the designated parameter to the given 32bit floating point number value.
     * @param pos The position of the parameter in the query
     * @param value The value to bind
     */
    @ReactMethod
    public void bindFloat(ReadableMap currentInstance, int pos, float value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseStatementImpl currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.bindFloat(pos, value);
            promise.resolve(0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Bind the designated parameter to the given 64bit floating point number value.
     * @param pos The position of the parameter in the query
     * @param value The value to bind
     */
    @ReactMethod
    public void bindDouble(ReadableMap currentInstance, int pos, double value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseStatementImpl currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.bindDouble(pos, value);
            promise.resolve(0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Bind the designated parameter to the given string.
     * @param pos The position of the parameter in the query
     * @param value The value to bind
     */
    @ReactMethod
    public void bindString(ReadableMap currentInstance, int pos, String value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseStatementImpl currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.bindString(pos, value);
            promise.resolve(0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Bind the designated parameter to the given BLOB.
     * @param pos The position of the parameter in the query
     * @param value The value to bind
     */
    @ReactMethod
    public void bindBlob(ReadableMap currentInstance, int pos, ReadableMap value, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseStatementImpl currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreDatabaseBlob rctParam_value = this.reactContext.getNativeModule(RCTCoreDatabaseBlob.class);
            DatabaseBlob javaParam_1 = rctParam_value.getJavaObjects().get(value.getString("uid"));
            DatabaseBlobImpl javaParam_1_java = (DatabaseBlobImpl)javaParam_1;
            javaParam_1_java.setPromise(promise);
            currentInstanceObj.bindBlob(pos, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Bind the designated parameter to the NULL value in SQL.
     * @param pos The position of the parameter in the query
     * @param value The value to bind
     */
    @ReactMethod
    public void bindNull(ReadableMap currentInstance, int pos, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseStatementImpl currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.bindNull(pos);
            promise.resolve(0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Describe the metadata attached to the designated column (e.g. data type, column name...)
     * @return Column metadata descriptor
     */
    @ReactMethod
    public void describeColumn(ReadableMap currentInstance, int colNum, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseStatementImpl currentInstanceObj = this.javaObjects.get(sUid);

            DatabaseColumn javaResult = currentInstanceObj.describeColumn(colNum);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseColumn rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseColumn.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, (DatabaseColumnImpl)javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDatabaseColumn");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get the number of column that will be available into the result row (e.g. "SELECT name, age FROM USERS"
     * would return 2).
     * @return The number of the columns available in the result
     */
    @ReactMethod
    public void getColumnCount(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseStatementImpl currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.getColumnCount();
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
     * Execute the statement with the past bound values.
     * @return The result of the execution of the statement on the database.
     */
    @ReactMethod
    public void execute(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseStatementImpl currentInstanceObj = this.javaObjects.get(sUid);

            DatabaseResultSet javaResult = currentInstanceObj.execute();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseResultSet rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseResultSet.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, (DatabaseResultSetImpl)javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDatabaseResultSet");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Reset all bindings. This call is used before reusing a statement instance in order to repeat it multiple time. */
    @ReactMethod
    public void reset(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseStatementImpl currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.reset();
            promise.resolve(0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Close the statement and release all allocated resources. The statement shouldn't be used after this call. */
    @ReactMethod
    public void close(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DatabaseStatementImpl currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.close();
            promise.resolve(0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
