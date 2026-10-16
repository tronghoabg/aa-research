package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfah implements zzfcs {
    private final zzhcp zza;
    private final zzecz zzb;

    public zzfah(zzhcp zzhcpVar, zzecz zzeczVar) {
        this.zza = zzhcpVar;
        this.zzb = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfag
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 23;
    }

    public final zzfai zzc() {
        zzecz zzeczVar = this.zzb;
        return new zzfai(zzeczVar.zzg(), zzeczVar.zzd(), C6.n.f1857D.f1874o.g(), zzeczVar.zzq(), zzeczVar.zzm());
    }
}
