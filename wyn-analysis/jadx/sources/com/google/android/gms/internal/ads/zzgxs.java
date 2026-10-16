package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class zzgxs extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzgti zzb;

    public zzgxs(List list, zzgti zzgtiVar) {
        list.getClass();
        this.zza = list;
        this.zzb = zzgtiVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        return new zzgxr(this, this.zza.listIterator(i5));
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
