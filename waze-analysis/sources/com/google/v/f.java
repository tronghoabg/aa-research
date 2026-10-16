package com.google.v;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
abstract class f<E> extends AbstractList<E> implements eo<E> {

    /* renamed from: a, reason: collision with root package name */
    private boolean f12933a;

    f(boolean z) {
        this.f12933a = z;
    }

    private void d() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        bp();
        return super.add(e2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        bp();
        return super.addAll(i2, collection);
    }

    @Override // com.google.v.eo
    public final void b() {
        if (this.f12933a) {
            this.f12933a = false;
        }
    }

    protected final void bp() {
        if (this.f12933a) {
            return;
        }
        d();
    }

    @Override // com.google.v.eo
    public final boolean c() {
        return this.f12933a;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        bp();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!get(i2).equals(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode = (iHashCode * 31) + get(i2).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        bp();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        bp();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        bp();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        bp();
        return (E) super.set(i2, e2);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        bp();
        super.add(i2, e2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        bp();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i2) {
        bp();
        return (E) super.remove(i2);
    }
}
