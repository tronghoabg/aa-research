package androidx.camera.core.impl;

import android.os.Build;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class DeviceProperties {
    public static DeviceProperties create() {
        return create(Build.MANUFACTURER, Build.MODEL, Build.VERSION.SDK_INT);
    }

    public abstract String manufacturer();

    public abstract String model();

    public abstract int sdkVersion();

    public static DeviceProperties create(String str, String str2, int i2) {
        return new AutoValue_DeviceProperties(str, str2, i2);
    }
}
