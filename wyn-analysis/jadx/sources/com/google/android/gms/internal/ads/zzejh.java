package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzejh {
    private final zzejd zza;
    private final zzhcp zzb;

    public zzejh(zzejd zzejdVar, zzhcp zzhcpVar) {
        this.zza = zzejdVar;
        this.zzb = zzhcpVar;
    }

    public final void zza(zzfos zzfosVar) {
        final zzejd zzejdVar = this.zza;
        Objects.requireNonNull(zzejdVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzejg
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzejdVar.getWritableDatabase();
            }
        };
        zzhcp zzhcpVar = this.zzb;
        zzhcf.zzr(zzhcpVar.zzc(callable), new zzejf(this, zzfosVar), zzhcpVar);
    }
}
