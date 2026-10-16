package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class afbt<E> extends afau<E> implements List<E>, RandomAccess, Serializable, afgd {
    public static final /* synthetic */ int d = 0;
    private static final afbt e;
    public Object[] a;
    public int b;
    public boolean c;

    static {
        afbt afbtVar = new afbt(0);
        afbtVar.c = true;
        e = afbtVar;
    }

    public afbt(int i) {
        this.a = new Object[i];
    }

    private final void j() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    private final void k(int i, int i2) {
        int i3 = this.b + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArrCopyOf = this.a;
        int length = objArrCopyOf.length;
        if (i3 > length) {
            objArrCopyOf.getClass();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, woy.dC(length, i3));
            objArrCopyOf.getClass();
            this.a = objArrCopyOf;
        }
        int i4 = this.b;
        objArrCopyOf.getClass();
        objArrCopyOf.getClass();
        System.arraycopy(objArrCopyOf, i, objArrCopyOf, i + i2, i4 - i);
        this.b += i2;
    }

    private final void l() {
        this.modCount++;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.c) {
            return new afcc(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e2) {
        j();
        a.aH(i, this.b);
        h(i, e2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        collection.getClass();
        j();
        a.aH(i, this.b);
        int size = collection.size();
        g(i, collection, size);
        return size > 0;
    }

    @Override // defpackage.afau
    public final int b() {
        return this.b;
    }

    public final int c(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.a;
            if (i3 >= i2) {
                break;
            }
            int i5 = i3 + 1;
            int i6 = i3 + i;
            if (collection.contains(objArr[i6]) == z) {
                Object[] objArr2 = this.a;
                objArr2[i + i4] = objArr2[i6];
                i4++;
            }
            i3 = i5;
        }
        int i7 = i2 - i4;
        woy.dq(objArr, objArr, i + i4, i + i2, this.b);
        Object[] objArr3 = this.a;
        int i8 = this.b;
        woy.aL(objArr3, i8 - i7, i8);
        if (i7 > 0) {
            l();
        }
        this.b -= i7;
        return i7;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        i(0, this.b);
    }

    @Override // defpackage.afau
    public final Object d(int i) {
        j();
        a.aG(i, this.b);
        return e(i);
    }

    public final Object e(int i) {
        l();
        Object[] objArr = this.a;
        Object obj = objArr[i];
        woy.dq(objArr, objArr, i, i + 1, this.b);
        woy.aK(this.a, this.b - 1);
        this.b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (woy.aM(this.a, 0, this.b, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final List f() {
        j();
        this.c = true;
        return this.b > 0 ? this : e;
    }

    public final void g(int i, Collection collection, int i2) {
        l();
        k(i, i2);
        Iterator<E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.a[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        a.aG(i, this.b);
        return (E) this.a[i];
    }

    public final void h(int i, Object obj) {
        l();
        k(i, 1);
        this.a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return woy.aI(this.a, 0, this.b);
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            l();
        }
        Object[] objArr = this.a;
        woy.dq(objArr, objArr, i, i + i2, this.b);
        Object[] objArr2 = this.a;
        int i3 = this.b;
        woy.aL(objArr2, i3 - i2, i3);
        this.b -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.b; i++) {
            if (affa.f(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (affa.f(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        a.aH(i, this.b);
        return new afbs(this, i, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        j();
        return c(0, this.b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        j();
        return c(0, this.b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e2) {
        j();
        a.aG(i, this.b);
        Object[] objArr = this.a;
        E e3 = (E) objArr[i];
        objArr[i] = e2;
        return e3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        a.aI(i, i2, this.b);
        return new afbr(this.a, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        int i = this.b;
        Object[] objArr = this.a;
        if (length < i) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(objArr, 0, i, tArr.getClass());
            tArr2.getClass();
            return tArr2;
        }
        woy.dq(objArr, tArr, 0, 0, i);
        woy.cx(this.b, tArr);
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return woy.aJ(this.a, 0, this.b, this);
    }

    public afbt() {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        j();
        h(this.b, e2);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        j();
        int size = collection.size();
        g(this.b, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return woy.cI(this.a, 0, this.b);
    }
}
