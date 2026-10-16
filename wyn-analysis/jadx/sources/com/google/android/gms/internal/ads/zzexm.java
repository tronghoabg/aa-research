package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzexm implements zzfcs {
    private final zzhcp zza;
    private final zzdxp zzb;
    private final String zzc;
    private final zzflg zzd;

    public zzexm(zzhcp zzhcpVar, zzdxp zzdxpVar, zzflg zzflgVar, String str) {
        this.zza = zzhcpVar;
        this.zzb = zzdxpVar;
        this.zzd = zzflgVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzexl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 17;
    }

    public final /* synthetic */ zzexn zzc() {
        zzflg zzflgVar = this.zzd;
        zzdxp zzdxpVar = this.zzb;
        return new zzexn(zzdxpVar.zzb(zzflgVar.zzg, this.zzc), zzdxpVar.zzc());
    }
}
