package com.waze.config;

import com.waze.NativeManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class PreferencesConfigNativeManager extends dn {
    private static final String LOG_TAG = "PreferencesConfigNativeManager: ";
    private static PreferencesConfigNativeManager instance;
    private boolean configSynced;
    private final List<Runnable> runOnConfigSynced = new ArrayList();

    private PreferencesConfigNativeManager() {
    }

    public static synchronized PreferencesConfigNativeManager getInstance() {
        PreferencesConfigNativeManager preferencesConfigNativeManager;
        preferencesConfigNativeManager = instance;
        if (preferencesConfigNativeManager == null) {
            preferencesConfigNativeManager = new PreferencesConfigNativeManager();
            instance = preferencesConfigNativeManager;
        }
        return preferencesConfigNativeManager;
    }

    static /* synthetic */ void lambda$runOnPreferencesConfigSynced$1(Runnable runnable) {
        if (getInstance().configSynced) {
            runnable.run();
        } else {
            getInstance().runOnConfigSynced.add(runnable);
        }
    }

    public static void runOnPreferencesConfigSynced(Runnable runnable) {
        NativeManager.runOnNativeManagerReady(new dk(runnable, 0));
    }

    protected native byte[] getAndroidAutoAvailableReportCategoriesNTV();

    protected native byte[] getAvailableReportCategoriesNTV();

    protected native byte[] getWebUrlWhiteListNTV();

    public native void initNativeLayerNTV();

    public boolean isPreferencesConfigSynced() {
        return this.configSynced;
    }

    void onPreferencesConfigSynced() {
        this.configSynced = true;
        Iterator<Runnable> it = this.runOnConfigSynced.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.runOnConfigSynced.clear();
    }
}
