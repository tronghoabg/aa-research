package com.waze.system;

import android.content.Context;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class SystemNativeManager extends b {
    public static final int $stable = 8;
    private final Context applicationContext;
    private int deviceId;
    private String systemLanguage;
    private String systemLocale;

    public SystemNativeManager(Context context) {
        x.f(context, "applicationContext");
        this.applicationContext = context;
    }

    public final native int fetchDeviceIdNTV();

    public final native String fetchSystemLanguageNTV();

    public final native String fetchSystemLocaleNTV();

    public final int getDeviceId() {
        return this.deviceId;
    }

    public final String getPackageName$third_party_waze_client_android_project_waze_src_main_waze() {
        String packageName = this.applicationContext.getPackageName();
        x.e(packageName, "getPackageName(...)");
        return packageName;
    }

    public String getSystemLanguage() {
        return this.systemLanguage;
    }

    public String getSystemLocale() {
        return this.systemLocale;
    }

    public final void init() {
        this.deviceId = fetchDeviceId();
        setSystemLanguage(fetchSystemLanguage());
        setSystemLocale(fetchSystemLocale());
    }

    public final native void initNativeLayerNTV();

    public void setSystemLanguage(String str) {
        this.systemLanguage = str;
    }

    public void setSystemLocale(String str) {
        this.systemLocale = str;
    }
}
