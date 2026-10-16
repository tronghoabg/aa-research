package com.google.android.gms.f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5255a;

    /* renamed from: b, reason: collision with root package name */
    private int f5256b;

    /* renamed from: c, reason: collision with root package name */
    private int f5257c = 0;

    public u(Context context) {
        this.f5255a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfoB;
        if (this.f5256b == 0) {
            try {
                packageInfoB = com.google.android.gms.common.d.c.b(this.f5255a).b("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("Metadata", "Failed to find package ".concat(e2.toString()));
                packageInfoB = null;
            }
            if (packageInfoB != null) {
                this.f5256b = packageInfoB.versionCode;
            }
        }
        return this.f5256b;
    }

    public final synchronized int b() {
        int i2 = this.f5257c;
        if (i2 != 0) {
            return i2;
        }
        Context context = this.f5255a;
        PackageManager packageManager = context.getPackageManager();
        if (com.google.android.gms.common.d.c.b(context).d() == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
            this.f5257c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.f5257c = 2;
        return 2;
    }
}
