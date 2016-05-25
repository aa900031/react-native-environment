package com.github.aa900031;

import android.content.Intent;
import android.content.ActivityNotFoundException;
import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Callback;

import java.util.Properties;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class RNEnvironmentModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNEnvironmentModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNEnvironment";
    }

    @Override
    public Map<String, Object> getConstants() {
        return getProperties();
    }

    private Map<String, Object> getProperties() {
        final Map<String, Object> constants = new HashMap<>();
        Properties properties = new Properties();
        try {
            properties.load(reactContext.getAssets().open("env.properties"));
            for (final String name: properties.stringPropertyNames()){
                constants.put(name, properties.getProperty(name));
            }
            Log.v("RNEnvironmentLOG", "env.properties is readed");
        } catch (IOException e) {
            Log.e("RNEnvironmentLOG", "env.properties IO Exception", e);
        }
        return constants;
    }
}
