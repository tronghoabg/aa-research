package com.google.android.gms.common.util;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.identitycredentials.a.j;
import com.google.android.gms.identitycredentials.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static Context f5153a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f5154b;

    public static StrictMode.VmPolicy a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(f.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }

    public static void b(Context context) {
        try {
            av.m(context);
        } catch (Exception e2) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e2);
        }
    }

    public static final p c(Context context) {
        x.f(context, "context");
        return new j(context);
    }

    public static synchronized boolean d(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f5153a;
        if (context2 != null && (bool = f5154b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f5154b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f5154b = boolValueOf;
        f5153a = applicationContext;
        return boolValueOf.booleanValue();
    }
}
