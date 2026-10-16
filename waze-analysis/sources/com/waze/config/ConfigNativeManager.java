package com.waze.config;

import com.waze.ConfigManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ConfigNativeManager extends m {
    private static final String TAG = "ConfigNativeManager: ";
    private static ConfigNativeManager sInstance;

    private ConfigNativeManager() {
    }

    public static synchronized ConfigNativeManager getInstance() {
        ConfigNativeManager configNativeManager;
        configNativeManager = sInstance;
        if (configNativeManager == null) {
            configNativeManager = new ConfigNativeManager();
            sInstance = configNativeManager;
        }
        return configNativeManager;
    }

    static void setTestInstance(ConfigNativeManager configNativeManager) {
        sInstance = configNativeManager;
    }

    public native void initNativeLayerNTV();

    void onBooleanConfigUpdated(int i2, boolean z, boolean z2) {
        ConfigManager.getInstance().onConfigUpdated(i2, Boolean.valueOf(z), z2);
    }

    void onLongConfigUpdated(int i2, long j2, boolean z) {
        ConfigManager.getInstance().onConfigUpdated(i2, Long.valueOf(j2), z);
    }

    void onStringConfigUpdated(int i2, String str, boolean z) {
        ConfigManager.getInstance().onConfigUpdated(i2, str, z);
    }

    protected native void registerConfigUpdateNTV(int i2);

    protected native boolean serverConfigurationReadyNTV();

    void showDebugConfigList() {
        ConfigManager.getInstance().showDebugConfigList();
    }
}
