package com.google.android.gms.internal.ads;

import D6.InterfaceC0358a;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzdme implements F6.o, InterfaceC0358a {
    private final zzdxc zza;
    private final zzfkq zzb;
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzdme(zzdxc zzdxcVar, zzfkq zzfkqVar) {
        this.zza = zzdxcVar;
        this.zzb = zzfkqVar;
    }

    private final void zzl() {
        if (this.zzc.getAndSet(true)) {
            return;
        }
        this.zza.zzd();
    }

    @Override // D6.InterfaceC0358a
    public final void onAdClicked() {
        this.zza.zzc();
    }

    @Override // F6.o
    public final void zzdT() {
        zzl();
    }

    @Override // F6.o
    public final void zzdU(int i5) {
        zzl();
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
        this.zza.zzb(this.zzb.zzb);
    }
}
