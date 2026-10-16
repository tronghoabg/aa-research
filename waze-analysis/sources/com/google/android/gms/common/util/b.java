package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f5144a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f5145b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f5146c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f5147d;

    public static boolean a(Context context) {
        return b(context.getPackageManager());
    }

    public static boolean b(PackageManager packageManager) {
        Boolean boolValueOf = f5147d;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            f5147d = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean c(Context context) {
        Boolean boolValueOf = f5146c;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            f5146c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean d(Context context) {
        return e(context.getPackageManager());
    }

    public static boolean e(PackageManager packageManager) {
        Boolean boolValueOf = f5144a;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            f5144a = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean f(Context context) {
        Boolean boolValueOf = f5145b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            f5145b = boolValueOf;
        }
        return boolValueOf.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }
}
