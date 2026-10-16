package defpackage;

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

/* loaded from: classes3.dex */
public final class afbr<E> extends afau<E> implements List<E>, RandomAccess, Serializable, afgd {
    public Object[] a;
    public final int b;
    public int c;
    public final afbt d;
    private final afbr e;

    public afbr(Object[] objArr, int i, int i2, afbr afbrVar, afbt afbtVar) {
        objArr.getClass();
        afbtVar.getClass();
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.e = afbrVar;
        this.d = afbtVar;
        this.modCount = afbtVar.modCount;
    }

    private final int c(int i, int i2, Collection collection, boolean z) {
        int iC;
        afbr afbrVar = this.e;
        if (afbrVar != null) {
            iC = afbrVar.c(i, i2, collection, z);
        } else {
            afbt afbtVar = this.d;
            int i3 = afbt.d;
            iC = afbtVar.c(i, i2, collection, z);
        }
        if (iC > 0) {
            j();
        }
        this.c -= iC;
        return iC;
    }

    private final Object e(int i) {
        Object objE;
        j();
        afbr afbrVar = this.e;
        if (afbrVar != null) {
            objE = afbrVar.e(i);
        } else {
            afbt afbtVar = this.d;
            int i2 = afbt.d;
            objE = afbtVar.e(i);
        }
        this.c--;
        return objE;
    }

    private final void f(int i, Collection collection, int i2) {
        j();
        afbr afbrVar = this.e;
        if (afbrVar != null) {
            afbrVar.f(i, collection, i2);
        } else {
            afbt afbtVar = this.d;
            int i3 = afbt.d;
            afbtVar.g(i, collection, i2);
        }
        afbt afbtVar2 = this.d;
        int i4 = afbt.d;
        this.a = afbtVar2.a;
        this.c += i2;
    }

    private final void g(int i, Object obj) {
        j();
        afbr afbrVar = this.e;
        if (afbrVar != null) {
            afbrVar.g(i, obj);
        } else {
            afbt afbtVar = this.d;
            int i2 = afbt.d;
            afbtVar.h(i, obj);
        }
        afbt afbtVar2 = this.d;
        int i3 = afbt.d;
        this.a = afbtVar2.a;
        this.c++;
    }

    private final void h() {
        int i = afbt.d;
        if (this.d.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (l()) {
            throw new UnsupportedOperationException();
        }
    }

    private final void j() {
        this.modCount++;
    }

    private final void k(int i, int i2) {
        if (i2 > 0) {
            j();
        }
        afbr afbrVar = this.e;
        if (afbrVar != null) {
            afbrVar.k(i, i2);
        } else {
            afbt afbtVar = this.d;
            int i3 = afbt.d;
            afbtVar.i(i, i2);
        }
        this.c -= i2;
    }

    private final boolean l() {
        int i = afbt.d;
        return this.d.c;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (l()) {
            return new afcc(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        i();
        h();
        a.aH(i, this.c);
        g(this.b + i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        collection.getClass();
        i();
        h();
        a.aH(i, this.c);
        int size = collection.size();
        f(this.b + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.afau
    public final int b() {
        h();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        k(this.b, this.c);
    }

    @Override // defpackage.afau
    public final Object d(int i) {
        i();
        h();
        a.aG(i, this.c);
        return e(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (woy.aM(this.a, this.b, this.c, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        h();
        a.aG(i, this.c);
        return (E) this.a[this.b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        return woy.aI(this.a, this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i = 0; i < this.c; i++) {
            if (affa.f(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i = this.c - 1; i >= 0; i--) {
            if (affa.f(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        h();
        a.aH(i, this.c);
        return new afbs(this, i, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return c(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return c(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        i();
        h();
        a.aG(i, this.c);
        Object[] objArr = this.a;
        int i2 = this.b + i;
        E e2 = (E) objArr[i2];
        objArr[i2] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        a.aI(i, i2, this.c);
        return new afbr(this.a, this.b + i, i2 - i, this, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        h();
        int length = tArr.length;
        int i = this.c;
        Object[] objArr = this.a;
        if (length >= i) {
            int i2 = this.b;
            woy.dq(objArr, tArr, 0, i2, i + i2);
            woy.cx(this.c, tArr);
            return tArr;
        }
        int i3 = this.b;
        T[] tArr2 = (T[]) Arrays.copyOfRange(objArr, i3, i + i3, tArr.getClass());
        tArr2.getClass();
        return tArr2;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return woy.aJ(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        i();
        h();
        g(this.b + this.c, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        i();
        h();
        int size = collection.size();
        f(this.b + this.c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.a;
        int i = this.b;
        return woy.cI(objArr, i, this.c + i);
    }
}
