package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class zzicf implements Iterator {
    zzicg zza;
    zzicg zzb;
    int zzc;
    final /* synthetic */ zzich zzd;

    public zzicf(zzich zzichVar) {
        Objects.requireNonNull(zzichVar);
        this.zzd = zzichVar;
        this.zza = zzichVar.zzd.zzd;
        this.zzb = null;
        this.zzc = zzichVar.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza != this.zzd.zzd;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzicg zzicgVar = this.zzb;
        if (zzicgVar == null) {
            throw new IllegalStateException();
        }
        zzich zzichVar = this.zzd;
        zzichVar.zzd(zzicgVar, true);
        this.zzb = null;
        this.zzc = zzichVar.zzc;
    }

    public final zzicg zza() {
        zzich zzichVar = this.zzd;
        zzicg zzicgVar = this.zza;
        if (zzicgVar == zzichVar.zzd) {
            throw new NoSuchElementException();
        }
        if (zzichVar.zzc != this.zzc) {
            throw new ConcurrentModificationException();
        }
        this.zza = zzicgVar.zzd;
        this.zzb = zzicgVar;
        return zzicgVar;
    }
}
