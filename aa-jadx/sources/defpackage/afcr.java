package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afcr<E> extends defpackage.afbu<E> implements java.util.List<E>, java.util.RandomAccess, java.io.Serializable, defpackage.afhd {
    public java.lang.Object[] a;
    public final int b;
    public int c;
    public final defpackage.afct d;
    private final defpackage.afcr e;

    public afcr(java.lang.Object[] objArr, int i, int i2, defpackage.afcr afcrVar, defpackage.afct afctVar) {
        objArr.getClass();
        afctVar.getClass();
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.e = afcrVar;
        this.d = afctVar;
        this.modCount = afctVar.modCount;
    }

    private final int c(int i, int i2, java.util.Collection collection, boolean z) {
        int iC;
        defpackage.afcr afcrVar = this.e;
        if (afcrVar != null) {
            iC = afcrVar.c(i, i2, collection, z);
        } else {
            defpackage.afct afctVar = this.d;
            int i3 = defpackage.afct.d;
            iC = afctVar.c(i, i2, collection, z);
        }
        if (iC > 0) {
            j();
        }
        this.c -= iC;
        return iC;
    }

    private final java.lang.Object e(int i) {
        java.lang.Object objE;
        j();
        defpackage.afcr afcrVar = this.e;
        if (afcrVar != null) {
            objE = afcrVar.e(i);
        } else {
            defpackage.afct afctVar = this.d;
            int i2 = defpackage.afct.d;
            objE = afctVar.e(i);
        }
        this.c--;
        return objE;
    }

    private final void f(int i, java.util.Collection collection, int i2) {
        j();
        defpackage.afcr afcrVar = this.e;
        if (afcrVar != null) {
            afcrVar.f(i, collection, i2);
        } else {
            defpackage.afct afctVar = this.d;
            int i3 = defpackage.afct.d;
            afctVar.g(i, collection, i2);
        }
        defpackage.afct afctVar2 = this.d;
        int i4 = defpackage.afct.d;
        this.a = afctVar2.a;
        this.c += i2;
    }

    private final void g(int i, java.lang.Object obj) {
        j();
        defpackage.afcr afcrVar = this.e;
        if (afcrVar != null) {
            afcrVar.g(i, obj);
        } else {
            defpackage.afct afctVar = this.d;
            int i2 = defpackage.afct.d;
            afctVar.h(i, obj);
        }
        defpackage.afct afctVar2 = this.d;
        int i3 = defpackage.afct.d;
        this.a = afctVar2.a;
        this.c++;
    }

    private final void h() {
        int i = defpackage.afct.d;
        if (this.d.modCount != this.modCount) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    private final void i() {
        if (l()) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final void j() {
        this.modCount++;
    }

    private final void k(int i, int i2) {
        if (i2 > 0) {
            j();
        }
        defpackage.afcr afcrVar = this.e;
        if (afcrVar != null) {
            afcrVar.k(i, i2);
        } else {
            defpackage.afct afctVar = this.d;
            int i3 = defpackage.afct.d;
            afctVar.i(i, i2);
        }
        this.c -= i2;
    }

    private final boolean l() {
        int i = defpackage.afct.d;
        return this.d.c;
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() throws java.io.NotSerializableException {
        if (l()) {
            return new defpackage.afdc(this, 0);
        }
        throw new java.io.NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        i();
        h();
        defpackage.a.aG(i, this.c);
        g(this.b + i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends E> collection) {
        collection.getClass();
        i();
        h();
        defpackage.a.aG(i, this.c);
        int size = collection.size();
        f(this.b + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.afbu
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

    @Override // defpackage.afbu
    public final java.lang.Object d(int i) {
        i();
        h();
        defpackage.a.aF(i, this.c);
        return e(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            if (defpackage.afga.G(this.a, this.b, this.c, (java.util.List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        h();
        defpackage.a.aF(i, this.c);
        return (E) this.a[this.b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        return defpackage.afga.C(this.a, this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        h();
        for (int i = 0; i < this.c; i++) {
            if (defpackage.afga.f(this.a[this.b + i], obj)) {
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
    public final java.util.Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        h();
        for (int i = this.c - 1; i >= 0; i--) {
            if (defpackage.afga.f(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<E> listIterator(int i) {
        h();
        defpackage.a.aG(i, this.c);
        return new defpackage.afcs(this, i, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        i();
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        i();
        h();
        return c(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        i();
        h();
        return c(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        i();
        h();
        defpackage.a.aF(i, this.c);
        java.lang.Object[] objArr = this.a;
        int i2 = this.b + i;
        E e2 = (E) objArr[i2];
        objArr[i2] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i, int i2) {
        defpackage.a.aH(i, i2, this.c);
        return new defpackage.afcr(this.a, this.b + i, i2 - i, this, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        h();
        int length = tArr.length;
        int i = this.c;
        java.lang.Object[] objArr = this.a;
        if (length >= i) {
            int i2 = this.b;
            defpackage.afga.ck(objArr, tArr, 0, i2, i + i2);
            defpackage.afga.br(this.c, tArr);
            return tArr;
        }
        int i3 = this.b;
        T[] tArr2 = (T[]) java.util.Arrays.copyOfRange(objArr, i3, i + i3, tArr.getClass());
        tArr2.getClass();
        return tArr2;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        h();
        return defpackage.afga.D(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
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
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        collection.getClass();
        i();
        h();
        int size = collection.size();
        f(this.b + this.c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        h();
        java.lang.Object[] objArr = this.a;
        int i = this.b;
        return defpackage.afga.bC(objArr, i, this.c + i);
    }
}
