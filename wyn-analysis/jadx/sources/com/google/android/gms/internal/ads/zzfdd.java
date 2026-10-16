package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzfdd implements zzfcs {
    private final zzhcp zza;
    private final Context zzb;
    private final zzeej zzc;
    private final String zzd;

    public zzfdd(zzhcp zzhcpVar, Context context, zzeej zzeejVar, String str) {
        this.zza = zzhcpVar;
        this.zzb = context;
        this.zzc = zzeejVar;
        this.zzd = str;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfdc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 38;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0134 A[PHI: r1
  0x0134: PHI (r1v17 java.lang.String) = (r1v7 java.lang.String), (r1v7 java.lang.String), (r1v7 java.lang.String), (r1v8 java.lang.String) binds: [B:36:0x0132, B:39:0x0150, B:40:0x0152, B:79:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzfdb zzc() {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdd.zzc():com.google.android.gms.internal.ads.zzfdb");
    }
}
