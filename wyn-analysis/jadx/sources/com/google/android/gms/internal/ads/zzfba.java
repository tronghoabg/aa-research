package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfba implements zzfcs {
    private final zzhcp zza;
    private final zzeaw zzb;

    public zzfba(zzhcp zzhcpVar, zzeaw zzeawVar) {
        this.zza = zzhcpVar;
        this.zzb = zzeawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfaz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 62;
    }

    public final /* synthetic */ zzfbb zzc() {
        return new zzfbb(this.zzb.zzb());
    }
}
