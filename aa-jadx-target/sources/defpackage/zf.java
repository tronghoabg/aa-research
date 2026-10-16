package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zf<E> implements java.util.Collection<E>, java.util.Set<E>, defpackage.afhd, defpackage.afhh {
    public int[] a;
    public java.lang.Object[] b;
    public int c;

    public zf(int i) {
        this.a = defpackage.abg.a;
        this.b = defpackage.abg.c;
        if (i > 0) {
            this.a = new int[i];
            this.b = new java.lang.Object[i];
        }
    }

    public final int a(java.lang.Object obj) {
        return obj == null ? defpackage.ca.ae(this, null, 0) : defpackage.ca.ae(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int i;
        int iAe;
        int i2 = this.c;
        if (e == null) {
            iAe = defpackage.ca.ae(this, null, 0);
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iAe = defpackage.ca.ae(this, e, iHashCode);
        }
        if (iAe >= 0) {
            return false;
        }
        int i3 = ~iAe;
        int[] iArr = this.a;
        int length = iArr.length;
        if (i2 >= length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            java.lang.Object[] objArr = this.b;
            int[] iArr2 = new int[i4];
            this.a = iArr2;
            this.b = new java.lang.Object[i4];
            if (i2 != this.c) {
                throw new java.util.ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                defpackage.afga.cm(iArr, iArr2, 0, length, 6);
                defpackage.afga.cv(objArr, this.b, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.a;
            int i5 = i3 + 1;
            iArr3.getClass();
            iArr3.getClass();
            int i6 = i2 - i3;
            java.lang.System.arraycopy(iArr3, i3, iArr3, i5, i6);
            java.lang.Object[] objArr2 = this.b;
            objArr2.getClass();
            objArr2.getClass();
            java.lang.System.arraycopy(objArr2, i3, objArr2, i5, i6);
        }
        int i7 = this.c;
        if (i2 == i7) {
            int[] iArr4 = this.a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.b[i3] = e;
                this.c = i7 + 1;
                return true;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        collection.getClass();
        int size = this.c + collection.size();
        int i = this.c;
        int[] iArr = this.a;
        boolean zAdd = false;
        if (iArr.length < size) {
            java.lang.Object[] objArr = this.b;
            int[] iArr2 = new int[size];
            this.a = iArr2;
            this.b = new java.lang.Object[size];
            if (i > 0) {
                defpackage.afga.cm(iArr, iArr2, 0, i, 6);
                defpackage.afga.cv(objArr, this.b, 0, this.c, 6);
            }
        }
        if (this.c != i) {
            throw new java.util.ConcurrentModificationException();
        }
        java.util.Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final java.lang.Object b(int i) {
        return this.b[i];
    }

    public final void c(int i) {
        int i2 = this.c;
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.a;
        int length = iArr.length;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                iArr.getClass();
                iArr.getClass();
                int i5 = i2 - i4;
                java.lang.System.arraycopy(iArr, i4, iArr, i, i5);
                java.lang.Object[] objArr2 = this.b;
                objArr2.getClass();
                objArr2.getClass();
                java.lang.System.arraycopy(objArr2, i4, objArr2, i, i5);
            }
            this.b[i3] = null;
        } else {
            int i6 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i6];
            this.a = iArr2;
            this.b = new java.lang.Object[i6];
            if (i > 0) {
                defpackage.afga.cm(iArr, iArr2, 0, i, 6);
                defpackage.afga.cv(objArr, this.b, 0, i, 6);
            }
            if (i < i3) {
                int[] iArr3 = this.a;
                int i7 = i + 1;
                iArr.getClass();
                iArr3.getClass();
                int i8 = i2 - i7;
                java.lang.System.arraycopy(iArr, i7, iArr3, i, i8);
                java.lang.Object[] objArr3 = this.b;
                objArr.getClass();
                objArr3.getClass();
                java.lang.System.arraycopy(objArr, i7, objArr3, i, i8);
            }
        }
        if (i2 != this.c) {
            throw new java.util.ConcurrentModificationException();
        }
        this.c = i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.c != 0) {
            this.a = defpackage.abg.a;
            this.b = defpackage.abg.c;
            this.c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return a(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        collection.getClass();
        java.util.Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Set) || this.c != ((java.util.Set) obj).size()) {
            return false;
        }
        try {
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((java.util.Set) obj).contains(b(i2))) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<E> iterator() {
        return new defpackage.ze(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int iA = a(obj);
        if (iA < 0) {
            return false;
        }
        c(iA);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        java.util.Iterator<E> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.c - 1; i >= 0; i--) {
            if (!defpackage.afga.bh(collection, this.b[i])) {
                c(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int i = this.c;
        int length = tArr.length;
        if (length < i) {
            tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), i));
        } else if (length > i) {
            tArr[i] = null;
        }
        java.lang.Object[] objArr = this.b;
        int i2 = this.c;
        objArr.getClass();
        tArr.getClass();
        java.lang.System.arraycopy(objArr, 0, tArr, 0, i2);
        return tArr;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.c * 14);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            java.lang.Object objB = b(i2);
            if (objB != this) {
                sb.append(objB);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        java.lang.Object[] objArr = this.b;
        int i = this.c;
        objArr.getClass();
        defpackage.afga.bv(i, objArr.length);
        java.lang.Object[] objArrCopyOfRange = java.util.Arrays.copyOfRange(objArr, 0, i);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }
}
