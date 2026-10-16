package com.google.d.d;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class ae<E> extends AbstractCollection<E> {

    /* renamed from: a, reason: collision with root package name */
    final Collection f7407a;

    /* renamed from: b, reason: collision with root package name */
    final com.google.d.b.ab f7408b;

    ae(Collection collection, com.google.d.b.ab abVar) {
        this.f7407a = collection;
        this.f7408b = abVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e2) {
        com.google.d.b.an.l(this.f7408b.apply(e2));
        return this.f7407a.add(e2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            com.google.d.b.an.l(this.f7408b.apply(it.next()));
        }
        return this.f7407a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        fo.U(this.f7407a, this.f7408b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (fo.ai(this.f7407a, obj)) {
            return this.f7408b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        com.google.d.b.ab abVar = this.f7408b;
        Iterator it = this.f7407a.iterator();
        com.google.d.b.an.C(abVar, "predicate");
        int i2 = 0;
        while (it.hasNext()) {
            if (abVar.apply(it.next())) {
                return i2 == -1;
            }
            i2++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.f7407a.iterator();
        com.google.d.b.an.B(it);
        com.google.d.b.ab abVar = this.f7408b;
        com.google.d.b.an.B(abVar);
        return new cv(it, abVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f7407a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.f7407a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f7408b.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.f7407a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f7408b.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.f7407a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (this.f7408b.apply(it.next())) {
                i2++;
            }
        }
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return fo.D(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) fo.D(iterator()).toArray(tArr);
    }
}
