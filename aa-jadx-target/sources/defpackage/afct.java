package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afct<E> extends defpackage.afbu<E> implements java.util.List<E>, java.util.RandomAccess, java.io.Serializable, defpackage.afhd {
    public static final /* synthetic */ int d = 0;
    private static final defpackage.afct e;
    public java.lang.Object[] a;
    public int b;
    public boolean c;

    static {
        defpackage.afct afctVar = new defpackage.afct(0);
        afctVar.c = true;
        e = afctVar;
    }

    public afct(int i) {
        this.a = new java.lang.Object[i];
    }

    private final void j() {
        if (this.c) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final void k(int i, int i2) {
        int i3 = this.b + i2;
        if (i3 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.Object[] objArrCopyOf = this.a;
        int length = objArrCopyOf.length;
        if (i3 > length) {
            objArrCopyOf.getClass();
            objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, defpackage.afga.cw(length, i3));
            objArrCopyOf.getClass();
            this.a = objArrCopyOf;
        }
        int i4 = this.b;
        objArrCopyOf.getClass();
        objArrCopyOf.getClass();
        java.lang.System.arraycopy(objArrCopyOf, i, objArrCopyOf, i + i2, i4 - i);
        this.b += i2;
    }

    private final void l() {
        this.modCount++;
    }

    private final java.lang.Object writeReplace() throws java.io.NotSerializableException {
        if (this.c) {
            return new afdc(this, 0);
        }
        throw new java.io.NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e2) {
        j();
        defpackage.a.aG(i, this.b);
        h(i, e2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends E> collection) {
        collection.getClass();
        j();
        defpackage.a.aG(i, this.b);
        int size = collection.size();
        g(i, collection, size);
        return size > 0;
    }

    @Override // defpackage.afbu
    public final int b() {
        return this.b;
    }

    public final int c(int i, int i2, java.util.Collection collection, boolean z) {
        java.lang.Object[] objArr;
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
                java.lang.Object[] objArr2 = this.a;
                objArr2[i + i4] = objArr2[i6];
                i4++;
            }
            i3 = i5;
        }
        int i7 = i2 - i4;
        defpackage.afga.ck(objArr, objArr, i + i4, i + i2, this.b);
        java.lang.Object[] objArr3 = this.a;
        int i8 = this.b;
        defpackage.afga.F(objArr3, i8 - i7, i8);
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

    @Override // defpackage.afbu
    public final java.lang.Object d(int i) {
        j();
        defpackage.a.aF(i, this.b);
        return e(i);
    }

    public final java.lang.Object e(int i) {
        l();
        java.lang.Object[] objArr = this.a;
        java.lang.Object obj = objArr[i];
        defpackage.afga.ck(objArr, objArr, i, i + 1, this.b);
        defpackage.afga.E(this.a, this.b - 1);
        this.b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            if (defpackage.afga.G(this.a, 0, this.b, (java.util.List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final java.util.List f() {
        j();
        this.c = true;
        return this.b > 0 ? this : e;
    }

    public final void g(int i, java.util.Collection collection, int i2) {
        l();
        k(i, i2);
        java.util.Iterator<E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.a[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        defpackage.a.aF(i, this.b);
        return (E) this.a[i];
    }

    public final void h(int i, java.lang.Object obj) {
        l();
        k(i, 1);
        this.a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return defpackage.afga.C(this.a, 0, this.b);
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            l();
        }
        java.lang.Object[] objArr = this.a;
        defpackage.afga.ck(objArr, objArr, i, i + i2, this.b);
        java.lang.Object[] objArr2 = this.a;
        int i3 = this.b;
        defpackage.afga.F(objArr2, i3 - i2, i3);
        this.b -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        for (int i = 0; i < this.b; i++) {
            if (defpackage.afga.f(this.a[i], obj)) {
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
    public final java.util.Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (defpackage.afga.f(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<E> listIterator(int i) {
        defpackage.a.aG(i, this.b);
        return new defpackage.afcs(this, i, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        j();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        j();
        return c(0, this.b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        j();
        return c(0, this.b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e2) {
        j();
        defpackage.a.aF(i, this.b);
        java.lang.Object[] objArr = this.a;
        E e3 = (E) objArr[i];
        objArr[i] = e2;
        return e3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i, int i2) {
        defpackage.a.aH(i, i2, this.b);
        return new afcr(this.a, i, i2 - i, (afcr) null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        int i = this.b;
        java.lang.Object[] objArr = this.a;
        if (length < i) {
            T[] tArr2 = (T[]) java.util.Arrays.copyOfRange(objArr, 0, i, tArr.getClass());
            tArr2.getClass();
            return tArr2;
        }
        defpackage.afga.ck(objArr, tArr, 0, 0, i);
        defpackage.afga.br(this.b, tArr);
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return defpackage.afga.D(this.a, 0, this.b, this);
    }

    public afct() {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        j();
        h(this.b, e2);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        collection.getClass();
        j();
        int size = collection.size();
        g(this.b, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        return defpackage.afga.bC(this.a, 0, this.b);
    }
}
