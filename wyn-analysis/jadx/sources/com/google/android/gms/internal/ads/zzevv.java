package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzevv implements zzfcs {
    private final zzhcp zza;
    private final zzflg zzb;
    private final zzcfp zzc;

    public zzevv(zzhcp zzhcpVar, zzflg zzflgVar, zzcfp zzcfpVar) {
        this.zza = zzhcpVar;
        this.zzb = zzflgVar;
        this.zzc = zzcfpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzevu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 9;
    }

    public final /* synthetic */ zzevw zzc() {
        return new zzevw(this.zzb.zzk, this.zzc.zzl());
    }
}
