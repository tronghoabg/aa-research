package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class zzgvf implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzgvg zzc;

    public zzgvf(zzgvg zzgvgVar) {
        Objects.requireNonNull(zzgvgVar);
        this.zzc = zzgvgVar;
        Collection collection = zzgvgVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzgvg zzgvgVar = this.zzc;
        zzgvgVar.zze.zzq(r1.zzp() - 1);
        zzgvgVar.zzb();
    }

    public final void zza() {
        zzgvg zzgvgVar = this.zzc;
        zzgvgVar.zza();
        if (zzgvgVar.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public zzgvf(zzgvg zzgvgVar, Iterator it) {
        Objects.requireNonNull(zzgvgVar);
        this.zzc = zzgvgVar;
        this.zzb = zzgvgVar.zzb;
        this.zza = it;
    }
}
