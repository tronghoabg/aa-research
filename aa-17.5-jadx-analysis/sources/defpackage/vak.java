package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* loaded from: classes3.dex */
public final class vak {
    private static xxh a = xvy.a;

    public static int a(Context context) {
        Integer numValueOf = (Integer) a.e();
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion);
            a = xxh.h(numValueOf);
        }
        return numValueOf.intValue();
    }
}
