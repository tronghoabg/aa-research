package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10237a;

    /* renamed from: b, reason: collision with root package name */
    private String f10238b;

    /* renamed from: c, reason: collision with root package name */
    private String f10239c;

    /* renamed from: d, reason: collision with root package name */
    private int f10240d;

    /* renamed from: e, reason: collision with root package name */
    private int f10241e = 0;

    u(Context context) {
        this.f10237a = context;
    }

    private final PackageInfo f(String str) {
        try {
            return this.f10237a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("FirebaseMessaging", "Failed to find package ".concat(e2.toString()));
            return null;
        }
    }

    private final synchronized void g() {
        PackageInfo packageInfoF = f(this.f10237a.getPackageName());
        if (packageInfoF != null) {
            this.f10238b = Integer.toString(packageInfoF.versionCode);
            this.f10239c = packageInfoF.versionName;
        }
    }

    final synchronized int a() {
        PackageInfo packageInfoF;
        if (this.f10240d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
            this.f10240d = packageInfoF.versionCode;
        }
        return this.f10240d;
    }

    final synchronized int b() {
        int i2 = this.f10241e;
        if (i2 != 0) {
            return i2;
        }
        PackageManager packageManager = this.f10237a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f10241e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        this.f10241e = 2;
        return 2;
    }

    final synchronized String c() {
        if (this.f10238b == null) {
            g();
        }
        return this.f10238b;
    }

    final synchronized String d() {
        if (this.f10239c == null) {
            g();
        }
        return this.f10239c;
    }

    final boolean e() {
        return b() != 0;
    }
}
