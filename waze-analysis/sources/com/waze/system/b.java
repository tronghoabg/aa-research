package com.waze.system;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class b {
    public static final int $stable = 0;

    public int fetchDeviceId() {
        return ((SystemNativeManager) this).fetchDeviceIdNTV();
    }

    public String fetchSystemLanguage() {
        return ((SystemNativeManager) this).fetchSystemLanguageNTV();
    }

    public String fetchSystemLocale() {
        return ((SystemNativeManager) this).fetchSystemLocaleNTV();
    }

    protected final String getPackageNameJNI() {
        return ((SystemNativeManager) this).getPackageName$third_party_waze_client_android_project_waze_src_main_waze();
    }
}
