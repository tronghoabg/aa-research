package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzign extends zzide {
    final zzigp zza;
    zzidg zzb;
    final /* synthetic */ zzigq zzc;

    public zzign(zzigq zzigqVar) {
        Objects.requireNonNull(zzigqVar);
        this.zzc = zzigqVar;
        this.zza = new zzigp(zzigqVar, null);
        this.zzb = zzb();
    }

    private final zzidg zzb() {
        zzigp zzigpVar = this.zza;
        if (zzigpVar.hasNext()) {
            return zzigpVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzidg
    public final byte zza() {
        zzidg zzidgVar = this.zzb;
        if (zzidgVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzidgVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
