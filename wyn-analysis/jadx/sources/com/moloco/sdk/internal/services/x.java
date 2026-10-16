package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import ef.C2529m;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29736a;

    /* renamed from: b, reason: collision with root package name */
    public w f29737b;

    public x(Context context) {
        this.f29736a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final w a() {
        C2529m c2529mZ;
        PackageInfo packageInfo;
        Context context = this.f29736a;
        w wVar = this.f29737b;
        if (wVar != null) {
            return wVar;
        }
        try {
            String string = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
            if (Build.VERSION.SDK_INT >= 33) {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                AbstractC3340k.b(packageInfo);
            } else {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                AbstractC3340k.b(packageInfo);
            }
            String packageName = packageInfo.packageName;
            AbstractC3340k.d(packageName, "packageName");
            String versionName = packageInfo.versionName;
            AbstractC3340k.d(versionName, "versionName");
            w wVar2 = new w(string, packageName, versionName);
            this.f29737b = wVar2;
            c2529mZ = wVar2;
        } catch (Throwable th) {
            c2529mZ = Fe.e.z(th);
        }
        boolean z2 = c2529mZ instanceof C2529m;
        Object obj = c2529mZ;
        if (z2) {
            obj = null;
        }
        w wVar3 = (w) obj;
        return wVar3 == null ? new w("", "", "") : wVar3;
    }
}
