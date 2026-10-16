package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzfdx implements zzfcs {
    private final Executor zza;
    private final String zzb;

    public zzfdx(zzcfc zzcfcVar, Executor executor, String str, PackageInfo packageInfo, int i5) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        p8.p pVarZza = zzhcf.zza(this.zzb);
        zzfdw zzfdwVar = zzfdw.zza;
        Executor executor = this.zza;
        return zzhcf.zzh(zzhcf.zzk(pVarZza, zzfdwVar, executor), Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfdv
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 41;
    }

    public final /* synthetic */ p8.p zzc(Throwable th) {
        return zzhcf.zza(new zzfdy(this.zzb));
    }
}
