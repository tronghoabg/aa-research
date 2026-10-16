package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes3.dex */
public final class zzfbf implements zzfcs {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;

    public zzfbf(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    @Override // com.google.android.gms.internal.ads.zzfcs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p8.p zza() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r9 = this;
            android.content.pm.ApplicationInfo r0 = r9.zza
            java.lang.String r2 = r0.packageName
            android.content.pm.PackageInfo r0 = r9.zzb
            r1 = 0
            if (r0 != 0) goto Lb
            r3 = r1
            goto L11
        Lb:
            int r3 = r0.versionCode
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L11:
            if (r0 != 0) goto L15
            r4 = r1
            goto L18
        L15:
            java.lang.String r0 = r0.versionName
            r4 = r0
        L18:
            android.content.Context r0 = r9.zzc     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            G6.M r5 = G6.U.f4562l     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            E0.a r0 = p7.C3773c.a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            android.content.Context r0 = r0.f2782a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            android.content.pm.PackageManager r5 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            r6 = 0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r2, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            java.lang.CharSequence r0 = r5.getApplicationLabel(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            r5 = r0
            goto L3a
        L39:
            r5 = r1
        L3a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 30
            if (r0 < r6) goto L86
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzow
            D6.s r6 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r6 = r6.f2492c
            java.lang.Object r0 = r6.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L86
            android.content.Context r0 = r9.zzc     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L84
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L84
            android.content.pm.InstallSourceInfo r0 = A7.N0.f(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L84
            if (r0 == 0) goto L86
            java.lang.String r6 = A7.N0.z(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L84
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            if (r7 == 0) goto L6e
            java.lang.String r7 = "No installing package name found"
            G6.L.k(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            r6 = r1
        L6e:
            java.lang.String r7 = com.applovin.impl.sdk.z.m(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
            if (r0 == 0) goto L94
            java.lang.String r0 = "No initiating package name found"
            G6.L.k(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7f
        L7d:
            r7 = r1
            goto L94
        L7f:
            r0 = move-exception
            r1 = r7
            goto L8a
        L82:
            r0 = move-exception
            goto L8a
        L84:
            r0 = move-exception
            goto L89
        L86:
            r6 = r1
            r7 = r6
            goto L94
        L89:
            r6 = r1
        L8a:
            C6.n r7 = C6.n.f1857D
            com.google.android.gms.internal.ads.zzcfk r7 = r7.f1868h
            java.lang.String r8 = "PackageInfoSignalSource.getInstallSourceInfo"
            r7.zzh(r0, r8)
            goto L7d
        L94:
            com.google.android.gms.internal.ads.zzfbg r1 = new com.google.android.gms.internal.ads.zzfbg
            r1.<init>(r2, r3, r4, r5, r6, r7)
            p8.p r0 = com.google.android.gms.internal.ads.zzhcf.zza(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbf.zza():p8.p");
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 29;
    }
}
