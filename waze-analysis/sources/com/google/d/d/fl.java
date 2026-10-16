package com.google.d.d;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class fl<E> extends AbstractSet<E> {
    /* synthetic */ fl(byte[] bArr) {
    }

    static int d(Set set) {
        return set instanceof fl ? ((fl) set).a() : set.size();
    }

    abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract fu iterator();

    abstract void c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        int iD;
        int size;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set) || (iD = d((set = (Set) obj))) < 0) {
            return false;
        }
        if (set instanceof fl) {
            ((fl) set).c();
            size = 0;
        } else {
            size = set.size();
        }
        if (a() < size) {
            return false;
        }
        fu it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
            i2++;
        }
        if (i2 == iD) {
            return true;
        }
        if (i2 < size) {
            return false;
        }
        Iterator<E> it2 = set.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            it2.next();
            i3++;
            if (i3 > i2) {
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
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    private fl() {
        throw null;
    }
}
