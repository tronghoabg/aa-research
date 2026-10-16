package com.google.android.gms.common.d;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f4933a;

    public b(Context context) {
        this.f4933a = context;
    }

    public final ApplicationInfo a(String str, int i2) {
        return this.f4933a.getPackageManager().getApplicationInfo(str, i2);
    }

    public final PackageInfo b(String str, int i2) {
        return this.f4933a.getPackageManager().getPackageInfo(str, i2);
    }

    public final CharSequence c(String str) {
        Context context = this.f4933a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public final int d() {
        return this.f4933a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms");
    }

    public final boolean e(int i2) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f4933a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i2, "com.google.android.gms");
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
