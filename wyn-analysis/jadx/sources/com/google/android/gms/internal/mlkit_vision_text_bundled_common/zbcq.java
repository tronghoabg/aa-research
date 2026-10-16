package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import N0.a;
import android.util.Log;

/* loaded from: classes4.dex */
public final class zbcq {
    public static final zbcq zba = new zbcq("VisionKit", 2);
    private final String zbb = "VisionKit";

    public zbcq(String str, int i5) {
    }

    private final boolean zbd(int i5) {
        return Log.isLoggable(this.zbb, i5);
    }

    private static final String zbe(Object obj, String str, Object... objArr) {
        String str2;
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            String name = obj.getClass().getName();
            if (obj instanceof Class) {
                name = ((Class) obj).getName();
            }
            String[] strArrSplit = name.split("\\.");
            int length = strArrSplit.length;
            str2 = length == 0 ? "" : strArrSplit[length - 1];
        }
        return a.h("[", str2, "] ", str);
    }

    public final void zba(Throwable th, String str, Object... objArr) {
        if (zbd(6)) {
            Log.e(this.zbb, "Error in result from JNI layer", th);
        }
    }

    public final void zbb(Object obj, String str, Object... objArr) {
        if (zbd(4)) {
            Log.i(this.zbb, zbe(obj, str, objArr));
        }
    }

    public final void zbc(Object obj, String str, Object... objArr) {
        if (zbd(5)) {
            Log.w(this.zbb, zbe(obj, str, objArr));
        }
    }
}
