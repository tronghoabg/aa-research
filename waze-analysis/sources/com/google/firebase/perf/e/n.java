package com.google.firebase.perf.e;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.collection.SieveCacheKt;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f10415a;

    public static int a(long j2) {
        if (j2 > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        if (j2 < SieveCacheKt.NodeMetaAndPreviousMask) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public static void b(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean c(Context context) {
        Boolean bool = f10415a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f10415a = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            com.google.firebase.perf.c.a.a().b("No perf logcat meta data found ".concat(String.valueOf(e2.getMessage())));
            return false;
        }
    }
}
