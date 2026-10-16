package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzgxq extends AbstractList implements RandomAccess, Serializable {
    final List zza;
    final zzgti zzb;

    public zzgxq(List list, zzgti zzgtiVar) {
        list.getClass();
        this.zza = list;
        this.zzb = zzgtiVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        return this.zzb.apply(this.zza.get(i5));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        return new zzgxp(this, this.zza.listIterator(i5));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        return this.zzb.apply(this.zza.remove(i5));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        this.zza.subList(i5, i10).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
