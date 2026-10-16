package androidx.car.app.utils;

import android.content.Context;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CommonUtils {
    private CommonUtils() {
    }

    public static boolean isAutomotiveOS(Context context) {
        return ((Context) Objects.requireNonNull(context)).getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }
}
