package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzexi implements zzfcs {
    private final zzhcp zza;

    public zzexi(zzhcp zzhcpVar) {
        this.zza = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzexh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C6.n nVar = C6.n.f1857D;
                nVar.k.getClass();
                return new zzexj(System.currentTimeMillis() - ((G6.O) nVar.f1868h.zzp()).r().zzb());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 55;
    }
}
