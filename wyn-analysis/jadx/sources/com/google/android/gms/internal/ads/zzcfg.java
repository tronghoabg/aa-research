package com.google.android.gms.internal.ads;

import G6.AbstractC0552p;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzcfg extends AbstractC0552p {
    final /* synthetic */ zzcfk zza;

    public zzcfg(zzcfk zzcfkVar) {
        Objects.requireNonNull(zzcfkVar);
        this.zza = zzcfkVar;
    }

    @Override // G6.AbstractC0552p
    public final void zza() {
        zzcfk zzcfkVar = this.zza;
        zzbja zzbjaVar = new zzbja(zzcfkVar.zzA(), zzcfkVar.zzB().f4927a);
        synchronized (zzcfkVar.zzz()) {
            try {
                zzbjd zzbjdVar = C6.n.f1857D.f1872m;
                zzbjd.zza(zzcfkVar.zzC(), zzbjaVar);
            } catch (IllegalArgumentException e7) {
                int i5 = G6.L.f4523b;
                H6.l.g("Cannot config CSI reporter.", e7);
            }
        }
    }
}
