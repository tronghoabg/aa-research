package com.waze;

import android.content.Intent;
import android.util.SparseArray;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.waze.config.ConfigNativeManager;
import com.waze.config.DebugConfigListActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ConfigManager extends bc {
    private static final String CACHED_STRING_CONFIG_NOT_FOUND = "CACHED_STRING_CONFIG_NOT_FOUND";
    private static ConfigManager mInstance;
    private boolean mConfigSynced;
    private final SparseArray<Object> configsPendingChanges = new SparseArray<>();
    private final List<Runnable> mRunOnConfigSynced = new ArrayList();
    private final SparseArray<az<?>> configIndexMap = new SparseArray<>();

    private native void InitNativeLayerNTV();

    private native int checkConfigDisplayCounterNTV(int i2, boolean z);

    public static ConfigManager getInstance() {
        ConfigManager configManager = mInstance;
        if (configManager != null) {
            return configManager;
        }
        ConfigManager configManager2 = new ConfigManager();
        mInstance = configManager2;
        return configManager2;
    }

    public static boolean isReady() {
        return mInstance != null;
    }

    static /* synthetic */ void lambda$runOnConfigSynced$1(Runnable runnable) {
        if (getInstance().mConfigSynced) {
            runnable.run();
        } else {
            getInstance().mRunOnConfigSynced.add(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setConfigValueBool$0(com.waze.config.b bVar, boolean z) {
        setConfigValueBoolNTV(bVar.e(), z);
        synchronized (this.configsPendingChanges) {
            this.configsPendingChanges.remove(bVar.e());
        }
        int i2 = com.waze.config.dj.f22618a;
        ni.c().h(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setConfigValueInt$0(com.waze.config.c cVar, int i2) {
        setConfigValueIntNTV(cVar.e(), i2);
        synchronized (this.configsPendingChanges) {
            this.configsPendingChanges.remove(cVar.e());
        }
        int i3 = com.waze.config.dj.f22618a;
        ni.c().h(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setConfigValueLong$0(com.waze.config.c cVar, long j2) {
        setConfigValueLongNTV(cVar.e(), j2);
        synchronized (this.configsPendingChanges) {
            this.configsPendingChanges.remove(cVar.e());
        }
        int i2 = com.waze.config.dj.f22618a;
        ni.c().h(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setConfigValueString$0(com.waze.config.d dVar, String str) {
        setConfigValueStringNTV(dVar.e(), str);
        synchronized (this.configsPendingChanges) {
            this.configsPendingChanges.remove(dVar.e());
        }
        int i2 = com.waze.config.dj.f22618a;
        ni.c().h(dVar);
    }

    public static void runOnConfigSynced(Runnable runnable) {
        NativeManager.runOnNativeManagerReady(new ay(runnable, 1));
    }

    public static void setTestInstance(ConfigManager configManager) {
        mInstance = configManager;
    }

    public static native void testCounterConfigEnum();

    protected native void aboutClickNTV();

    public int checkConfigDisplayCounter(int i2, boolean z) {
        return checkConfigDisplayCounterNTV(i2, z);
    }

    public boolean getConfigValueBool(com.waze.config.b bVar) {
        Boolean bool;
        synchronized (this.configsPendingChanges) {
            bool = (Boolean) this.configsPendingChanges.get(bVar.e());
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        if (NativeManager.isAppStarted()) {
            return getConfigValueBoolNTV(bVar.e());
        }
        int i2 = com.waze.config.dj.f22618a;
        return ni.c().c(bVar);
    }

    public native boolean getConfigValueBoolNTV(int i2);

    public int getConfigValueInt(com.waze.config.c cVar) {
        Integer num;
        synchronized (this.configsPendingChanges) {
            num = (Integer) this.configsPendingChanges.get(cVar.e());
        }
        if (num != null) {
            return num.intValue();
        }
        if (NativeManager.isAppStarted()) {
            return getConfigValueIntNTV(cVar.e());
        }
        int i2 = com.waze.config.dj.f22618a;
        return (int) ni.c().a(cVar);
    }

    public native int getConfigValueIntNTV(int i2);

    public long getConfigValueLong(com.waze.config.c cVar) {
        Long l2;
        synchronized (this.configsPendingChanges) {
            l2 = (Long) this.configsPendingChanges.get(cVar.e());
        }
        if (l2 != null) {
            return l2.longValue();
        }
        if (NativeManager.isAppStarted()) {
            return getConfigValueLongNTV(cVar.e());
        }
        int i2 = com.waze.config.dj.f22618a;
        return ni.c().a(cVar);
    }

    public native long getConfigValueLongNTV(int i2);

    public String getConfigValueModifiedValue(int i2) {
        return !NativeManager.isAppStarted() ? "" : getConfigValueModifiedValueNTV(i2);
    }

    public native String getConfigValueModifiedValueNTV(int i2);

    public String getConfigValueString(com.waze.config.d dVar) {
        String str;
        synchronized (this.configsPendingChanges) {
            str = (String) this.configsPendingChanges.get(dVar.e(), CACHED_STRING_CONFIG_NOT_FOUND);
        }
        if (!CACHED_STRING_CONFIG_NOT_FOUND.equals(str)) {
            return str;
        }
        if (NativeManager.isAppStarted()) {
            return getConfigValueStringNTV(dVar.e());
        }
        int i2 = com.waze.config.dj.f22618a;
        return ni.c().b(dVar);
    }

    public native String getConfigValueStringNTV(int i2);

    public void initNativeLayer() {
        InitNativeLayerNTV();
    }

    public boolean isBeta() {
        return isBetaNTV();
    }

    public native boolean isBetaNTV();

    public boolean isConfigSynced() {
        return this.mConfigSynced;
    }

    public native boolean isConfigValueLockedNTV(int i2);

    public boolean isConfigValueSticky(int i2) {
        if (NativeManager.isAppStarted()) {
            return isConfigValueStickyNTV(i2);
        }
        return false;
    }

    public native boolean isConfigValueStickyNTV(int i2);

    void onConfigSyncedFromServer() {
        int i2 = com.waze.config.dj.f22618a;
        ni.c().f();
    }

    void onConfigSyncedToServer() {
        this.mConfigSynced = true;
        int i2 = com.waze.config.dj.f22618a;
        ni.c().g();
        Iterator<Runnable> it = this.mRunOnConfigSynced.iterator();
        while (it.hasNext()) {
            NativeManager.runMainThreadTask(it.next());
        }
        this.mRunOnConfigSynced.clear();
    }

    public <T> void onConfigUpdated(int i2, T t, boolean z) {
        az<?> azVar;
        synchronized (this.configIndexMap) {
            azVar = this.configIndexMap.get(i2);
        }
        if (azVar != null) {
            azVar.a(t, z);
            return;
        }
        com.waze.shared_infra.i.h.j("Get config update for non-registered config, index: " + i2);
    }

    public <T> void registerConfigUpdate(com.waze.config.f<T> fVar, az<T> azVar) {
        synchronized (this.configIndexMap) {
            if (this.configIndexMap.get(fVar.e()) == null) {
                ConfigNativeManager.getInstance().registerConfigUpdate(fVar.e(), null);
                this.configIndexMap.put(fVar.e(), azVar);
            }
        }
    }

    public <T> void registerOnConfigSyncOrUpdated(com.waze.config.f<T> fVar, LifecycleOwner lifecycleOwner, Observer<T> observer) {
        runOnConfigSynced(new bl(observer, fVar, 1));
        if (lifecycleOwner != null) {
            com.b.b.d.c.c(fVar).observe(lifecycleOwner, observer);
        } else {
            com.b.b.d.c.c(fVar).observeForever(observer);
        }
    }

    protected native void sendLogsAutoConfirmNTV();

    protected native void sendLogsClickNTV();

    public void setConfigValueBool(com.waze.config.b bVar, boolean z) {
        synchronized (this.configsPendingChanges) {
            this.configsPendingChanges.append(bVar.e(), Boolean.valueOf(z));
        }
        NativeManager.Post(new com.google.firebase.messaging.w(this, bVar, z, 1));
    }

    public native void setConfigValueBoolNTV(int i2, boolean z);

    public void setConfigValueInt(com.waze.config.c cVar, int i2) {
        synchronized (this.configsPendingChanges) {
            this.configsPendingChanges.append(cVar.e(), Integer.valueOf(i2));
        }
        NativeManager.Post(new com.google.android.gms.common.api.internal.z(this, cVar, i2, 1));
    }

    public native void setConfigValueIntNTV(int i2, int i3);

    public native void setConfigValueLockedNTV(int i2, boolean z);

    public void setConfigValueLong(com.waze.config.c cVar, long j2) {
        synchronized (this.configsPendingChanges) {
            this.configsPendingChanges.append(cVar.e(), Long.valueOf(j2));
        }
        NativeManager.Post(new com.waze.navbar.i(this, cVar, j2, 1));
    }

    public native void setConfigValueLongNTV(int i2, long j2);

    public void setConfigValueString(com.waze.config.d dVar, String str) {
        synchronized (this.configsPendingChanges) {
            this.configsPendingChanges.append(dVar.e(), str);
        }
        NativeManager.Post(new android.support.v4.app.n(this, dVar, str, 9, (char[]) null));
    }

    public native void setConfigValueStringNTV(int i2, String str);

    protected native void setMapSkinNTV(String str);

    public void showDebugConfigList() {
        if (NativeManager.getInstance().isDebug()) {
            lm.d().l(new Intent(mg.a(), (Class<?>) DebugConfigListActivity.class));
        }
    }
}
