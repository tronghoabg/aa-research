package gf;

import X.v;
import ff.AbstractC2651f;
import ff.C2648c;
import ff.m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: gf.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2755b extends ff.h implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final C2755b f35882d;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f35883a;

    /* renamed from: b, reason: collision with root package name */
    public int f35884b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35885c;

    static {
        C2755b c2755b = new C2755b(0);
        c2755b.f35885c = true;
        f35882d = c2755b;
    }

    public C2755b(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f35883a = new Object[i5];
    }

    @Override // ff.h
    public final int a() {
        return this.f35884b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i5 = this.f35884b;
        ((AbstractList) this).modCount++;
        h(i5, 1);
        this.f35883a[i5] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        g();
        int size = elements.size();
        e(this.f35884b, elements, size);
        return size > 0;
    }

    @Override // ff.h
    public final Object c(int i5) {
        g();
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35884b;
        c2648c.getClass();
        C2648c.b(i5, i10);
        return i(i5);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        j(0, this.f35884b);
    }

    public final void e(int i5, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        h(i5, i10);
        Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f35883a[i5 + i11] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (Fe.g.l(this.f35883a, 0, this.f35884b, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i5, Object obj) {
        ((AbstractList) this).modCount++;
        h(i5, 1);
        this.f35883a[i5] = obj;
    }

    public final void g() {
        if (this.f35885c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35884b;
        c2648c.getClass();
        C2648c.b(i5, i10);
        return this.f35883a[i5];
    }

    public final void h(int i5, int i10) {
        int i11 = this.f35884b + i10;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f35883a;
        if (i11 > objArr.length) {
            C2648c c2648c = AbstractC2651f.Companion;
            int length = objArr.length;
            c2648c.getClass();
            int iE = C2648c.e(length, i11);
            Object[] objArr2 = this.f35883a;
            AbstractC3340k.e(objArr2, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, iE);
            AbstractC3340k.d(objArrCopyOf, "copyOf(...)");
            this.f35883a = objArrCopyOf;
        }
        Object[] objArr3 = this.f35883a;
        m.h0(objArr3, i5 + i10, objArr3, i5, this.f35884b);
        this.f35884b += i10;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f35883a;
        int i5 = this.f35884b;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i5; i10++) {
            Object obj = objArr[i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Object i(int i5) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f35883a;
        Object obj = objArr[i5];
        m.h0(objArr, i5, objArr, i5 + 1, this.f35884b);
        Object[] objArr2 = this.f35883a;
        int i10 = this.f35884b - 1;
        AbstractC3340k.e(objArr2, "<this>");
        objArr2[i10] = null;
        this.f35884b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i5 = 0; i5 < this.f35884b; i5++) {
            if (AbstractC3340k.a(this.f35883a[i5], obj)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f35884b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i5, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f35883a;
        m.h0(objArr, i5, objArr, i5 + i10, this.f35884b);
        Object[] objArr2 = this.f35883a;
        int i11 = this.f35884b;
        Fe.g.H(objArr2, i11 - i10, i11);
        this.f35884b -= i10;
    }

    public final int k(int i5, int i10, Collection collection, boolean z2) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i5 + i11;
            if (collection.contains(this.f35883a[i13]) == z2) {
                Object[] objArr = this.f35883a;
                i11++;
                objArr[i12 + i5] = objArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        Object[] objArr2 = this.f35883a;
        m.h0(objArr2, i5 + i12, objArr2, i10 + i5, this.f35884b);
        Object[] objArr3 = this.f35883a;
        int i15 = this.f35884b;
        Fe.g.H(objArr3, i15 - i14, i15);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f35884b -= i14;
        return i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i5 = this.f35884b - 1; i5 >= 0; i5--) {
            if (AbstractC3340k.a(this.f35883a[i5], obj)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        g();
        return k(0, this.f35884b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        g();
        return k(0, this.f35884b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        g();
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35884b;
        c2648c.getClass();
        C2648c.b(i5, i10);
        Object[] objArr = this.f35883a;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i5, int i10) {
        C2648c c2648c = AbstractC2651f.Companion;
        int i11 = this.f35884b;
        c2648c.getClass();
        C2648c.d(i5, i10, i11);
        return new C2754a(this.f35883a, i5, i10 - i5, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        AbstractC3340k.e(array, "array");
        int length = array.length;
        int i5 = this.f35884b;
        if (length < i5) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f35883a, 0, i5, array.getClass());
            AbstractC3340k.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        m.h0(this.f35883a, 0, array, 0, i5);
        int i10 = this.f35884b;
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return Fe.g.m(this.f35883a, 0, this.f35884b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35884b;
        c2648c.getClass();
        C2648c.c(i5, i10);
        return new v(this, i5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection elements) {
        AbstractC3340k.e(elements, "elements");
        g();
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35884b;
        c2648c.getClass();
        C2648c.c(i5, i10);
        int size = elements.size();
        e(i5, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        g();
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35884b;
        c2648c.getClass();
        C2648c.c(i5, i10);
        ((AbstractList) this).modCount++;
        h(i5, 1);
        this.f35883a[i5] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return m.m0(this.f35883a, 0, this.f35884b);
    }
}
