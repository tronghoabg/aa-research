package h.a.a;

import h.g.b.x;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d<E> extends h.a.o<E> implements List<E>, RandomAccess, Serializable, h.g.b.a.b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f47933a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final d f47934b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f47935c;

    /* renamed from: d, reason: collision with root package name */
    private int f47936d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f47937e;

    static {
        d dVar = new d(0);
        dVar.f47937e = true;
        f47934b = dVar;
    }

    public d(int i2) {
        this.f47935c = h.g.h(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int k(int i2, int i3, Collection collection, boolean z) {
        Object[] objArr;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr = this.f47935c;
            if (i4 >= i3) {
                break;
            }
            int i6 = i4 + 1;
            int i7 = i4 + i2;
            if (collection.contains(objArr[i7]) == z) {
                Object[] objArr2 = this.f47935c;
                objArr2[i2 + i5] = objArr2[i7];
                i5++;
            }
            i4 = i6;
        }
        int i8 = i3 - i5;
        h.a.c.at(objArr, objArr, i2 + i5, i2 + i3, this.f47936d);
        Object[] objArr3 = this.f47935c;
        int i9 = this.f47936d;
        h.g.f(objArr3, i9 - i8, i9);
        if (i8 > 0) {
            q();
        }
        this.f47936d -= i8;
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(int i2) {
        q();
        Object[] objArr = this.f47935c;
        Object obj = objArr[i2];
        h.a.c.at(objArr, objArr, i2, i2 + 1, this.f47936d);
        h.g.e(this.f47935c, this.f47936d - 1);
        this.f47936d--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(int i2, Collection collection, int i3) {
        q();
        p(i2, i3);
        Iterator<E> it = collection.iterator();
        for (int i4 = 0; i4 < i3; i4++) {
            this.f47935c[i2 + i4] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(int i2, Object obj) {
        q();
        p(i2, 1);
        this.f47935c[i2] = obj;
    }

    private final void o() {
        if (this.f47937e) {
            throw new UnsupportedOperationException();
        }
    }

    private final void p(int i2, int i3) {
        int i4 = this.f47936d + i3;
        if (i4 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArrI = this.f47935c;
        int length = objArrI.length;
        if (i4 > length) {
            objArrI = h.g.i(objArrI, h.a.c.d(length, i4));
            this.f47935c = objArrI;
        }
        h.a.c.at(objArrI, objArrI, i2 + i3, i2, this.f47936d);
        this.f47936d += i3;
    }

    private final void q() {
        this.modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(int i2, int i3) {
        if (i3 > 0) {
            q();
        }
        Object[] objArr = this.f47935c;
        h.a.c.at(objArr, objArr, i2, i2 + i3, this.f47936d);
        Object[] objArr2 = this.f47935c;
        int i4 = this.f47936d;
        h.g.f(objArr2, i4 - i3, i4);
        this.f47936d -= i3;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f47937e) {
            return new m(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // h.a.o, java.util.AbstractList, java.util.List
    public final void add(int i2, E e2) {
        o();
        h.a.c.b(i2, this.f47936d);
        n(i2, e2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        x.f(collection, "elements");
        o();
        h.a.c.b(i2, this.f47936d);
        int size = collection.size();
        m(i2, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        o();
        r(0, this.f47936d);
    }

    public final List e() {
        o();
        this.f47937e = true;
        return this.f47936d > 0 ? this : f47934b;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (h.g.g(this.f47935c, 0, this.f47936d, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        h.a.c.a(i2, this.f47936d);
        return (E) this.f47935c[i2];
    }

    @Override // h.a.o
    public final int getSize() {
        return this.f47936d;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return h.g.c(this.f47935c, 0, this.f47936d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.f47936d; i2++) {
            if (x.n(this.f47935c[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f47936d == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i2 = this.f47936d - 1; i2 >= 0; i2--) {
            if (x.n(this.f47935c[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i2) {
        h.a.c.b(i2, this.f47936d);
        return new c(this, i2, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        o();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        x.f(collection, "elements");
        o();
        return k(0, this.f47936d, collection, false) > 0;
    }

    @Override // h.a.o
    public final E removeAt(int i2) {
        o();
        h.a.c.a(i2, this.f47936d);
        return (E) l(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        x.f(collection, "elements");
        o();
        return k(0, this.f47936d, collection, true) > 0;
    }

    @Override // h.a.o, java.util.AbstractList, java.util.List
    public final E set(int i2, E e2) {
        o();
        h.a.c.a(i2, this.f47936d);
        Object[] objArr = this.f47935c;
        E e3 = (E) objArr[i2];
        objArr[i2] = e2;
        return e3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i2, int i3) {
        h.a.c.c(i2, i3, this.f47936d);
        return new b(this.f47935c, i2, i3 - i2, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        x.f(tArr, "array");
        int length = tArr.length;
        int i2 = this.f47936d;
        Object[] objArr = this.f47935c;
        if (length < i2) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(objArr, 0, i2, tArr.getClass());
            x.e(tArr2, "copyOfRange(...)");
            return tArr2;
        }
        h.a.c.at(objArr, tArr, 0, 0, i2);
        h.a.i.aS(this.f47936d, tArr);
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return h.g.d(this.f47935c, 0, this.f47936d, this);
    }

    public d() {
        this((byte[]) null);
    }

    public /* synthetic */ d(byte[] bArr) {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        o();
        n(this.f47936d, e2);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        x.f(collection, "elements");
        o();
        int size = collection.size();
        m(this.f47936d, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return h.a.c.u(this.f47935c, 0, this.f47936d);
    }
}
