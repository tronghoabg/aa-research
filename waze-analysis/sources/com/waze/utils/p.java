package com.waze.utils;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final com.waze.shared_infra.i.e f44898a = com.waze.shared_infra.i.a.d("PackageUtils");

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            f44898a.f("PackageUtils: Could not get package name: ".concat(e2.toString()));
            throw new IllegalStateException("PackageUtils: Could not get package name", e2);
        }
    }
}
