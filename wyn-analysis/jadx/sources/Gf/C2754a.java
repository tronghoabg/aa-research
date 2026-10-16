package gf;

import X.v;
import ff.AbstractC2651f;
import ff.C2648c;
import ff.m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: gf.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2754a extends ff.h implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f35877a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35878b;

    /* renamed from: c, reason: collision with root package name */
    public int f35879c;

    /* renamed from: d, reason: collision with root package name */
    public final C2754a f35880d;

    /* renamed from: e, reason: collision with root package name */
    public final C2755b f35881e;

    public C2754a(Object[] backing, int i5, int i10, C2754a c2754a, C2755b root) {
        AbstractC3340k.e(backing, "backing");
        AbstractC3340k.e(root, "root");
        this.f35877a = backing;
        this.f35878b = i5;
        this.f35879c = i10;
        this.f35880d = c2754a;
        this.f35881e = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    @Override // ff.h
    public final int a() {
        g();
        return this.f35879c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.f35878b + this.f35879c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        h();
        g();
        int size = elements.size();
        e(this.f35878b + this.f35879c, elements, size);
        return size > 0;
    }

    @Override // ff.h
    public final Object c(int i5) {
        h();
        g();
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35879c;
        c2648c.getClass();
        C2648c.b(i5, i10);
        return i(this.f35878b + i5);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.f35878b, this.f35879c);
    }

    public final void e(int i5, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        C2755b c2755b = this.f35881e;
        C2754a c2754a = this.f35880d;
        if (c2754a != null) {
            c2754a.e(i5, collection, i10);
        } else {
            C2755b c2755b2 = C2755b.f35882d;
            c2755b.e(i5, collection, i10);
        }
        this.f35877a = c2755b.f35883a;
        this.f35879c += i10;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Fe.g.l(this.f35877a, this.f35878b, this.f35879c, (List) obj);
        }
        return false;
    }

    public final void f(int i5, Object obj) {
        ((AbstractList) this).modCount++;
        C2755b c2755b = this.f35881e;
        C2754a c2754a = this.f35880d;
        if (c2754a != null) {
            c2754a.f(i5, obj);
        } else {
            C2755b c2755b2 = C2755b.f35882d;
            c2755b.f(i5, obj);
        }
        this.f35877a = c2755b.f35883a;
        this.f35879c++;
    }

    public final void g() {
        if (((AbstractList) this.f35881e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        g();
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35879c;
        c2648c.getClass();
        C2648c.b(i5, i10);
        return this.f35877a[this.f35878b + i5];
    }

    public final void h() {
        if (this.f35881e.f35885c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.f35877a;
        int i5 = this.f35879c;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i5; i10++) {
            Object obj = objArr[this.f35878b + i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Object i(int i5) {
        Object objI;
        ((AbstractList) this).modCount++;
        C2754a c2754a = this.f35880d;
        if (c2754a != null) {
            objI = c2754a.i(i5);
        } else {
            C2755b c2755b = C2755b.f35882d;
            objI = this.f35881e.i(i5);
        }
        this.f35879c--;
        return objI;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i5 = 0; i5 < this.f35879c; i5++) {
            if (AbstractC3340k.a(this.f35877a[this.f35878b + i5], obj)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.f35879c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i5, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        C2754a c2754a = this.f35880d;
        if (c2754a != null) {
            c2754a.j(i5, i10);
        } else {
            C2755b c2755b = C2755b.f35882d;
            this.f35881e.j(i5, i10);
        }
        this.f35879c -= i10;
    }

    public final int k(int i5, int i10, Collection collection, boolean z2) {
        int iK;
        C2754a c2754a = this.f35880d;
        if (c2754a != null) {
            iK = c2754a.k(i5, i10, collection, z2);
        } else {
            C2755b c2755b = C2755b.f35882d;
            iK = this.f35881e.k(i5, i10, collection, z2);
        }
        if (iK > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f35879c -= iK;
        return iK;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i5 = this.f35879c - 1; i5 >= 0; i5--) {
            if (AbstractC3340k.a(this.f35877a[this.f35878b + i5], obj)) {
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
        h();
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
        h();
        g();
        return k(this.f35878b, this.f35879c, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        h();
        g();
        return k(this.f35878b, this.f35879c, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        h();
        g();
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35879c;
        c2648c.getClass();
        C2648c.b(i5, i10);
        Object[] objArr = this.f35877a;
        int i11 = this.f35878b + i5;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i5, int i10) {
        C2648c c2648c = AbstractC2651f.Companion;
        int i11 = this.f35879c;
        c2648c.getClass();
        C2648c.d(i5, i10, i11);
        return new C2754a(this.f35877a, this.f35878b + i5, i10 - i5, this, this.f35881e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        AbstractC3340k.e(array, "array");
        g();
        int length = array.length;
        int i5 = this.f35879c;
        int i10 = this.f35878b;
        if (length < i5) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f35877a, i10, i5 + i10, array.getClass());
            AbstractC3340k.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        m.h0(this.f35877a, 0, array, i10, i5 + i10);
        int i11 = this.f35879c;
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return Fe.g.m(this.f35877a, this.f35878b, this.f35879c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        g();
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35879c;
        c2648c.getClass();
        C2648c.c(i5, i10);
        return new v(this, i5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        h();
        g();
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35879c;
        c2648c.getClass();
        C2648c.c(i5, i10);
        f(this.f35878b + i5, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection elements) {
        AbstractC3340k.e(elements, "elements");
        h();
        g();
        C2648c c2648c = AbstractC2651f.Companion;
        int i10 = this.f35879c;
        c2648c.getClass();
        C2648c.c(i5, i10);
        int size = elements.size();
        e(this.f35878b + i5, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.f35877a;
        int i5 = this.f35879c;
        int i10 = this.f35878b;
        return m.m0(objArr, i10, i5 + i10);
    }
}
