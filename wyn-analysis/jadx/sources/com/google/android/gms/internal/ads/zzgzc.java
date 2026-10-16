package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zzgzc extends AbstractSet {
    private zzgzc() {
        throw null;
    }

    public static int zzd(Set set) {
        return set instanceof zzgzc ? ((zzgzc) set).zzc() : set.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        int iZzd;
        int size;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set) || (iZzd = zzd((set = (Set) obj))) < 0) {
            return false;
        }
        if (set instanceof zzgzc) {
            ((zzgzc) set).zzb();
            size = 0;
        } else {
            size = set.size();
        }
        if (zzc() < size) {
            return false;
        }
        zzgzh it = iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
            i5++;
        }
        if (i5 == iZzd) {
            return true;
        }
        if (i5 < size) {
            return false;
        }
        Iterator it2 = set.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            it2.next();
            i10++;
            if (i10 > i5) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract zzgzh iterator();

    public abstract int zzb();

    public abstract int zzc();

    public /* synthetic */ zzgzc(byte[] bArr) {
    }
}
