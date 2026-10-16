package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
class zzgvi extends zzgvg implements List {
    final /* synthetic */ zzgvj zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgvi(zzgvj zzgvjVar, Object obj, List list, zzgvg zzgvgVar) {
        super(zzgvjVar, obj, list, zzgvgVar);
        Objects.requireNonNull(zzgvjVar);
        this.zzf = zzgvjVar;
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        zza();
        boolean zIsEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i5, obj);
        zzgvj zzgvjVar = this.zzf;
        zzgvjVar.zzq(zzgvjVar.zzp() + 1);
        if (zIsEmpty) {
            zzc();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i5, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.zzb).addAll(i5, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        zzgvj zzgvjVar = this.zzf;
        zzgvjVar.zzq(zzgvjVar.zzp() + (size2 - size));
        if (size != 0) {
            return zAddAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zza();
        return ((List) this.zzb).get(i5);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zza();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zza();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zza();
        return new zzgvh(this);
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        zza();
        Object objRemove = ((List) this.zzb).remove(i5);
        this.zzf.zzq(r0.zzp() - 1);
        zzb();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        zza();
        return ((List) this.zzb).set(i5, obj);
    }

    @Override // java.util.List
    public final List subList(int i5, int i10) {
        zza();
        List listSubList = ((List) this.zzb).subList(i5, i10);
        zzgvg zzgvgVar = this.zzc;
        if (zzgvgVar == null) {
            zzgvgVar = this;
        }
        return this.zzf.zzg(this.zza, listSubList, zzgvgVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i5) {
        zza();
        return new zzgvh(this, i5);
    }
}
