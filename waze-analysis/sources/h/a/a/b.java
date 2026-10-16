package h.a.a;

import h.g.b.x;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b<E> extends h.a.o<E> implements List<E>, RandomAccess, Serializable, h.g.b.a.b {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f47923a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47924b;

    /* renamed from: c, reason: collision with root package name */
    private int f47925c;

    /* renamed from: d, reason: collision with root package name */
    private final b f47926d;

    /* renamed from: e, reason: collision with root package name */
    private final d f47927e;

    public b(Object[] objArr, int i2, int i3, b bVar, d dVar) {
        x.f(objArr, "backing");
        x.f(dVar, "root");
        this.f47923a = objArr;
        this.f47924b = i2;
        this.f47925c = i3;
        this.f47926d = bVar;
        this.f47927e = dVar;
        int i4 = d.f47933a;
        this.modCount = dVar.modCount;
    }

    private final int f(int i2, int i3, Collection collection, boolean z) {
        b bVar = this.f47926d;
        int iF = bVar != null ? bVar.f(i2, i3, collection, z) : this.f47927e.k(i2, i3, collection, z);
        if (iF > 0) {
            l();
        }
        this.f47925c -= iF;
        return iF;
    }

    private final Object g(int i2) {
        l();
        b bVar = this.f47926d;
        this.f47925c--;
        return bVar != null ? bVar.g(i2) : this.f47927e.l(i2);
    }

    private final void h(int i2, Collection collection, int i3) {
        l();
        b bVar = this.f47926d;
        if (bVar != null) {
            bVar.h(i2, collection, i3);
        } else {
            this.f47927e.m(i2, collection, i3);
        }
        this.f47923a = this.f47927e.f47935c;
        this.f47925c += i3;
    }

    private final void i(int i2, Object obj) {
        l();
        b bVar = this.f47926d;
        if (bVar != null) {
            bVar.i(i2, obj);
        } else {
            this.f47927e.n(i2, obj);
        }
        this.f47923a = this.f47927e.f47935c;
        this.f47925c++;
    }

    private final void j() {
        int i2 = d.f47933a;
        if (this.f47927e.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void k() {
        if (n()) {
            throw new UnsupportedOperationException();
        }
    }

    private final void l() {
        this.modCount++;
    }

    private final void m(int i2, int i3) {
        if (i3 > 0) {
            l();
        }
        b bVar = this.f47926d;
        if (bVar != null) {
            bVar.m(i2, i3);
        } else {
            this.f47927e.r(i2, i3);
        }
        this.f47925c -= i3;
    }

    private final boolean n() {
        return this.f47927e.f47937e;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (n()) {
            return new m(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // h.a.o, java.util.AbstractList, java.util.List
    public final void add(int i2, E e2) {
        k();
        j();
        h.a.c.b(i2, this.f47925c);
        i(this.f47924b + i2, e2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        x.f(collection, "elements");
        k();
        j();
        h.a.c.b(i2, this.f47925c);
        int i3 = this.f47924b + i2;
        int size = collection.size();
        h(i3, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        k();
        j();
        m(this.f47924b, this.f47925c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        j();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (h.g.g(this.f47923a, this.f47924b, this.f47925c, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        j();
        h.a.c.a(i2, this.f47925c);
        return (E) this.f47923a[this.f47924b + i2];
    }

    @Override // h.a.o
    public final int getSize() {
        j();
        return this.f47925c;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        j();
        return h.g.c(this.f47923a, this.f47924b, this.f47925c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        j();
        for (int i2 = 0; i2 < this.f47925c; i2++) {
            if (x.n(this.f47923a[this.f47924b + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        j();
        return this.f47925c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        j();
        for (int i2 = this.f47925c - 1; i2 >= 0; i2--) {
            if (x.n(this.f47923a[this.f47924b + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i2) {
        j();
        h.a.c.b(i2, this.f47925c);
        return new c(this, i2, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        k();
        j();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        x.f(collection, "elements");
        k();
        j();
        return f(this.f47924b, this.f47925c, collection, false) > 0;
    }

    @Override // h.a.o
    public final E removeAt(int i2) {
        k();
        j();
        h.a.c.a(i2, this.f47925c);
        return (E) g(this.f47924b + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        x.f(collection, "elements");
        k();
        j();
        return f(this.f47924b, this.f47925c, collection, true) > 0;
    }

    @Override // h.a.o, java.util.AbstractList, java.util.List
    public final E set(int i2, E e2) {
        k();
        j();
        h.a.c.a(i2, this.f47925c);
        int i3 = this.f47924b;
        Object[] objArr = this.f47923a;
        int i4 = i3 + i2;
        E e3 = (E) objArr[i4];
        objArr[i4] = e2;
        return e3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i2, int i3) {
        h.a.c.c(i2, i3, this.f47925c);
        return new b(this.f47923a, this.f47924b + i2, i3 - i2, this, this.f47927e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        x.f(tArr, "array");
        j();
        int length = tArr.length;
        int i2 = this.f47925c;
        Object[] objArr = this.f47923a;
        if (length >= i2) {
            int i3 = this.f47924b;
            h.a.c.at(objArr, tArr, 0, i3, i2 + i3);
            h.a.i.aS(this.f47925c, tArr);
            return tArr;
        }
        int i4 = this.f47924b;
        T[] tArr2 = (T[]) Arrays.copyOfRange(objArr, i4, i2 + i4, tArr.getClass());
        x.e(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        j();
        return h.g.d(this.f47923a, this.f47924b, this.f47925c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        k();
        j();
        i(this.f47924b + this.f47925c, e2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        x.f(collection, "elements");
        k();
        j();
        int size = collection.size();
        h(this.f47924b + this.f47925c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        j();
        Object[] objArr = this.f47923a;
        int i2 = this.f47924b;
        return h.a.c.u(objArr, i2, this.f47925c + i2);
    }
}
