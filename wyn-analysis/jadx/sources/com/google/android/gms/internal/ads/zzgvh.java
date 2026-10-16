package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class zzgvh extends zzgvf implements ListIterator {
    final /* synthetic */ zzgvi zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgvh(zzgvi zzgviVar) {
        super(zzgviVar);
        Objects.requireNonNull(zzgviVar);
        this.zzd = zzgviVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        zzgvi zzgviVar = this.zzd;
        boolean zIsEmpty = zzgviVar.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzgvj zzgvjVar = zzgviVar.zzf;
        zzgvjVar.zzq(zzgvjVar.zzp() + 1);
        if (zIsEmpty) {
            zzgviVar.zzc();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgvh(zzgvi zzgviVar, int i5) {
        super(zzgviVar, ((List) zzgviVar.zzb).listIterator(i5));
        Objects.requireNonNull(zzgviVar);
        this.zzd = zzgviVar;
    }
}
