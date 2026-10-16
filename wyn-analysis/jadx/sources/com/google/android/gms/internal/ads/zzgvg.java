package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes3.dex */
class zzgvg extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzgvg zzc;
    final Collection zzd;
    final /* synthetic */ zzgvj zze;

    public zzgvg(zzgvj zzgvjVar, Object obj, Collection collection, zzgvg zzgvgVar) {
        Objects.requireNonNull(zzgvjVar);
        this.zze = zzgvjVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzgvgVar;
        this.zzd = zzgvgVar == null ? null : zzgvgVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zza();
        boolean zIsEmpty = this.zzb.isEmpty();
        boolean zAdd = this.zzb.add(obj);
        if (zAdd) {
            zzgvj zzgvjVar = this.zze;
            zzgvjVar.zzq(zzgvjVar.zzp() + 1);
            if (zIsEmpty) {
                zzc();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.zzb.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        zzgvj zzgvjVar = this.zze;
        zzgvjVar.zzq(zzgvjVar.zzp() + (size2 - size));
        if (size != 0) {
            return zAddAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzgvj zzgvjVar = this.zze;
        zzgvjVar.zzq(zzgvjVar.zzp() - size);
        zzb();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zza();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zza();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zza();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zza();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zza();
        return new zzgvf(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zza();
        boolean zRemove = this.zzb.remove(obj);
        if (zRemove) {
            this.zze.zzq(r0.zzp() - 1);
            zzb();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.zzb.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.zzb.size();
            zzgvj zzgvjVar = this.zze;
            zzgvjVar.zzq(zzgvjVar.zzp() + (size2 - size));
            zzb();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.zzb.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.zzb.size();
            zzgvj zzgvjVar = this.zze;
            zzgvjVar.zzq(zzgvjVar.zzp() + (size2 - size));
            zzb();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zza();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zza();
        return this.zzb.toString();
    }

    public final void zza() {
        zzgvg zzgvgVar = this.zzc;
        if (zzgvgVar != null) {
            zzgvgVar.zza();
            if (zzgvgVar.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            zzgvj zzgvjVar = this.zze;
            Collection collection = (Collection) zzgvjVar.zzo().get(this.zza);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    public final void zzb() {
        zzgvg zzgvgVar = this.zzc;
        if (zzgvgVar != null) {
            zzgvgVar.zzb();
        } else if (this.zzb.isEmpty()) {
            zzgvj zzgvjVar = this.zze;
            zzgvjVar.zzo().remove(this.zza);
        }
    }

    public final void zzc() {
        zzgvg zzgvgVar = this.zzc;
        if (zzgvgVar != null) {
            zzgvgVar.zzc();
            return;
        }
        zzgvj zzgvjVar = this.zze;
        zzgvjVar.zzo().put(this.zza, this.zzb);
    }
}
