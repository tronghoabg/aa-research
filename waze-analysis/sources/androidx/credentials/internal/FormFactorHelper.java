package androidx.credentials.internal;

import android.content.Context;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FormFactorHelper {
    public static final FormFactorHelper INSTANCE = new FormFactorHelper();

    private FormFactorHelper() {
    }

    public static final boolean isAuto(Context context) {
        x.f(context, "ctx");
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static final boolean isTV(Context context) {
        x.f(context, "ctx");
        return context.getPackageManager().hasSystemFeature("android.software.leanback");
    }

    public static final boolean isWear(Context context) {
        x.f(context, "ctx");
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }
}
