package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9944a;

    /* renamed from: b, reason: collision with root package name */
    private String f9945b;

    /* renamed from: c, reason: collision with root package name */
    private String f9946c;

    /* renamed from: d, reason: collision with root package name */
    private int f9947d;

    /* renamed from: e, reason: collision with root package name */
    private int f9948e = 0;

    public g(Context context) {
        this.f9944a = context;
    }

    private final PackageInfo e(String str) {
        try {
            return this.f9944a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("FirebaseInstanceId", "Failed to find package ".concat(e2.toString()));
            return null;
        }
    }

    private final synchronized void f() {
        PackageInfo packageInfoE = e(this.f9944a.getPackageName());
        if (packageInfoE != null) {
            this.f9945b = Integer.toString(packageInfoE.versionCode);
            this.f9946c = packageInfoE.versionName;
        }
    }

    public final synchronized int a() {
        PackageInfo packageInfoE;
        if (this.f9947d == 0 && (packageInfoE = e("com.google.android.gms")) != null) {
            this.f9947d = packageInfoE.versionCode;
        }
        return this.f9947d;
    }

    public final synchronized int b() {
        int i2 = this.f9948e;
        if (i2 != 0) {
            return i2;
        }
        PackageManager packageManager = this.f9944a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f9948e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        this.f9948e = 2;
        return 2;
    }

    public final synchronized String c() {
        if (this.f9945b == null) {
            f();
        }
        return this.f9945b;
    }

    public final synchronized String d() {
        if (this.f9946c == null) {
            f();
        }
        return this.f9946c;
    }
}
