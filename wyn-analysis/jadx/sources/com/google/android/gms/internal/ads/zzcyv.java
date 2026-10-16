package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzcyv implements F6.o {
    private final zzdeg zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcyv(zzdeg zzdegVar) {
        this.zza = zzdegVar;
    }

    private final void zzm() {
        AtomicBoolean atomicBoolean = this.zzc;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.zza.zza();
    }

    @Override // F6.o
    public final void zzdT() {
        zzm();
    }

    @Override // F6.o
    public final void zzdU(int i5) {
        this.zzb.set(true);
        zzm();
    }

    @Override // F6.o
    public final void zzdo() {
    }

    @Override // F6.o
    public final void zzdp() {
    }

    @Override // F6.o
    public final void zzdq() {
    }

    @Override // F6.o
    public final void zzdv() {
    }

    @Override // F6.o
    public final void zzdw() {
    }

    @Override // F6.o
    public final void zzdx() {
    }

    @Override // F6.o
    public final void zzdy() {
    }

    @Override // F6.o
    public final void zzdz() {
    }

    @Override // F6.o
    public final void zzh() {
        this.zza.zzc();
    }

    public final boolean zzl() {
        return this.zzb.get();
    }
}
