package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afbz<E> extends defpackage.afbu<E> {
    private static final java.lang.Object[] b = new java.lang.Object[0];
    public int a;
    private int c;
    private java.lang.Object[] d;

    public afbz(int i) {
        java.lang.Object[] objArr;
        if (i == 0) {
            objArr = b;
        } else {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Illegal Capacity: "));
            }
            objArr = new java.lang.Object[i];
        }
        this.d = objArr;
    }

    private final int h(int i) {
        if (i != 0) {
            return i - 1;
        }
        java.lang.Object[] objArr = this.d;
        objArr.getClass();
        return objArr.length - 1;
    }

    private final int i(int i) {
        java.lang.Object[] objArr = this.d;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    private final int j(int i) {
        return i < 0 ? i + this.d.length : i;
    }

    private final int k(int i) {
        int length = this.d.length;
        return i >= length ? i - length : i;
    }

    private final void l(int i, java.util.Collection collection) {
        java.util.Iterator<E> it = collection.iterator();
        int length = this.d.length;
        while (i < length && it.hasNext()) {
            this.d[i] = it.next();
            i++;
        }
        int i2 = this.c;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.d[i3] = it.next();
        }
        this.a += collection.size();
    }

    private final void m(int i) {
        if (i < 0) {
            throw new java.lang.IllegalStateException("Deque is too big.");
        }
        java.lang.Object[] objArr = this.d;
        int length = objArr.length;
        if (i <= length) {
            return;
        }
        if (objArr == b) {
            if (i < 10) {
                i = 10;
            }
            this.d = new java.lang.Object[i];
            return;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[defpackage.afga.cw(length, i)];
        int i2 = this.c;
        objArr.getClass();
        java.lang.System.arraycopy(objArr, i2, objArr2, 0, length - i2);
        java.lang.Object[] objArr3 = this.d;
        int length2 = objArr3.length;
        int i3 = this.c;
        objArr3.getClass();
        java.lang.System.arraycopy(objArr3, 0, objArr2, length2 - i3, i3);
        this.c = 0;
        this.d = objArr2;
    }

    private final void n(int i, int i2) {
        java.lang.Object[] objArr = this.d;
        if (i < i2) {
            defpackage.afga.by(objArr, null, i, i2);
        } else {
            defpackage.afga.by(objArr, null, i, objArr.length);
            defpackage.afga.by(this.d, null, 0, i2);
        }
    }

    private final void o() {
        this.modCount++;
    }

    public final java.lang.Object a() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        return this.d[this.c];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        defpackage.a.aG(i, this.a);
        if (i == this.a) {
            addLast(e);
            return;
        }
        if (i == 0) {
            addFirst(e);
            return;
        }
        o();
        m(this.a + 1);
        int iK = k(this.c + i);
        int i2 = this.a;
        if (i < ((i2 + 1) >> 1)) {
            int iH = h(iK);
            int iH2 = h(this.c);
            int i3 = this.c;
            java.lang.Object[] objArr = this.d;
            if (iH >= i3) {
                objArr[iH2] = objArr[i3];
                defpackage.afga.ck(objArr, objArr, i3, i3 + 1, iH + 1);
            } else {
                defpackage.afga.ck(objArr, objArr, i3 - 1, i3, objArr.length);
                java.lang.Object[] objArr2 = this.d;
                objArr2[objArr2.length - 1] = objArr2[0];
                defpackage.afga.ck(objArr2, objArr2, 0, 1, iH + 1);
            }
            this.d[iH] = e;
            this.c = iH2;
        } else {
            int iK2 = k(this.c + i2);
            java.lang.Object[] objArr3 = this.d;
            if (iK < iK2) {
                defpackage.afga.ck(objArr3, objArr3, iK + 1, iK, iK2);
            } else {
                defpackage.afga.ck(objArr3, objArr3, 1, 0, iK2);
                java.lang.Object[] objArr4 = this.d;
                int length = objArr4.length - 1;
                objArr4[0] = objArr4[length];
                defpackage.afga.ck(objArr4, objArr4, iK + 1, iK, length);
            }
            this.d[iK] = e;
        }
        this.a++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends E> collection) {
        collection.getClass();
        defpackage.a.aG(i, this.a);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.a) {
            return addAll(collection);
        }
        o();
        m(this.a + collection.size());
        int iK = k(this.c + this.a);
        int iK2 = k(this.c + i);
        int size = collection.size();
        if (i < ((this.a + 1) >> 1)) {
            int i2 = this.c;
            int i3 = i2 - size;
            if (iK2 >= i2) {
                java.lang.Object[] objArr = this.d;
                if (i3 >= 0) {
                    defpackage.afga.ck(objArr, objArr, i3, i2, iK2);
                } else {
                    int length = objArr.length;
                    i3 += length;
                    int i4 = length - i3;
                    if (i4 >= iK2 - i2) {
                        defpackage.afga.ck(objArr, objArr, i3, i2, iK2);
                    } else {
                        defpackage.afga.ck(objArr, objArr, i3, i2, i2 + i4);
                        java.lang.Object[] objArr2 = this.d;
                        defpackage.afga.ck(objArr2, objArr2, 0, this.c + i4, iK2);
                    }
                }
            } else {
                java.lang.Object[] objArr3 = this.d;
                defpackage.afga.ck(objArr3, objArr3, i3, i2, objArr3.length);
                java.lang.Object[] objArr4 = this.d;
                if (size >= iK2) {
                    defpackage.afga.ck(objArr4, objArr4, objArr4.length - size, 0, iK2);
                } else {
                    defpackage.afga.ck(objArr4, objArr4, objArr4.length - size, 0, size);
                    java.lang.Object[] objArr5 = this.d;
                    defpackage.afga.ck(objArr5, objArr5, 0, size, iK2);
                }
            }
            this.c = i3;
            l(j(iK2 - size), collection);
        } else {
            int i5 = iK2 + size;
            java.lang.Object[] objArr6 = this.d;
            if (iK2 < iK) {
                int i6 = size + iK;
                int length2 = objArr6.length;
                if (i6 <= length2) {
                    defpackage.afga.ck(objArr6, objArr6, i5, iK2, iK);
                } else if (i5 >= length2) {
                    defpackage.afga.ck(objArr6, objArr6, i5 - length2, iK2, iK);
                } else {
                    int i7 = iK - (i6 - length2);
                    defpackage.afga.ck(objArr6, objArr6, 0, i7, iK);
                    java.lang.Object[] objArr7 = this.d;
                    defpackage.afga.ck(objArr7, objArr7, i5, iK2, i7);
                }
            } else {
                defpackage.afga.ck(objArr6, objArr6, size, 0, iK);
                java.lang.Object[] objArr8 = this.d;
                int length3 = objArr8.length;
                if (i5 >= length3) {
                    defpackage.afga.ck(objArr8, objArr8, i5 - length3, iK2, length3);
                } else {
                    defpackage.afga.ck(objArr8, objArr8, 0, length3 - size, length3);
                    java.lang.Object[] objArr9 = this.d;
                    defpackage.afga.ck(objArr9, objArr9, i5, iK2, objArr9.length - size);
                }
            }
            l(iK2, collection);
        }
        return true;
    }

    public final void addFirst(java.lang.Object obj) {
        o();
        m(this.a + 1);
        int iH = h(this.c);
        this.c = iH;
        this.d[iH] = obj;
        this.a++;
    }

    public final void addLast(java.lang.Object obj) {
        o();
        m(this.a + 1);
        this.d[k(this.c + this.a)] = obj;
        this.a++;
    }

    @Override // defpackage.afbu
    public final int b() {
        return this.a;
    }

    public final java.lang.Object c() {
        if (isEmpty()) {
            return null;
        }
        return this.d[this.c];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            o();
            n(this.c, k(this.c + this.a));
        }
        this.c = 0;
        this.a = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.afbu
    public final java.lang.Object d(int i) {
        defpackage.a.aF(i, this.a);
        if (i == this.a - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        o();
        int iK = k(this.c + i);
        java.lang.Object[] objArr = this.d;
        java.lang.Object obj = objArr[iK];
        int i2 = this.a;
        int i3 = i2 >> 1;
        int i4 = this.c;
        if (i < i3) {
            if (iK >= i4) {
                objArr.getClass();
                objArr.getClass();
                java.lang.System.arraycopy(objArr, i4, objArr, i4 + 1, iK - i4);
            } else {
                objArr.getClass();
                objArr.getClass();
                java.lang.System.arraycopy(objArr, 0, objArr, 1, iK);
                java.lang.Object[] objArr2 = this.d;
                int length = objArr2.length - 1;
                objArr2[0] = objArr2[length];
                int i5 = this.c;
                objArr2.getClass();
                objArr2.getClass();
                java.lang.System.arraycopy(objArr2, i5, objArr2, i5 + 1, length - i5);
            }
            java.lang.Object[] objArr3 = this.d;
            int i6 = this.c;
            objArr3[i6] = null;
            this.c = i(i6);
        } else {
            int iK2 = k(i4 + (i2 - 1));
            java.lang.Object[] objArr4 = this.d;
            if (iK <= iK2) {
                int i7 = iK + 1;
                objArr4.getClass();
                objArr4.getClass();
                java.lang.System.arraycopy(objArr4, i7, objArr4, iK, (iK2 + 1) - i7);
            } else {
                int i8 = iK + 1;
                int length2 = objArr4.length;
                objArr4.getClass();
                objArr4.getClass();
                java.lang.System.arraycopy(objArr4, i8, objArr4, iK, length2 - i8);
                java.lang.Object[] objArr5 = this.d;
                objArr5[objArr5.length - 1] = objArr5[0];
                objArr5.getClass();
                objArr5.getClass();
                java.lang.System.arraycopy(objArr5, 1, objArr5, 0, iK2);
            }
            this.d[iK2] = null;
        }
        this.a--;
        return obj;
    }

    public final java.lang.Object e() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        return this.d[k(this.c + defpackage.afga.ab(this))];
    }

    public final java.lang.Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.d[k(this.c + defpackage.afga.ab(this))];
    }

    public final java.lang.Object g() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        defpackage.a.aF(i, this.a);
        return (E) this.d[k(this.c + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        int i;
        int iK = k(this.c + this.a);
        int length = this.c;
        if (length < iK) {
            while (length < iK) {
                if (!defpackage.afga.f(obj, this.d[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || length < iK) {
            return -1;
        }
        int length2 = this.d.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iK; i2++) {
                    if (defpackage.afga.f(obj, this.d[i2])) {
                        length = i2 + this.d.length;
                        i = this.c;
                        break;
                    }
                }
                return -1;
            }
            if (!defpackage.afga.f(obj, this.d[length])) {
                length++;
            }
        }
        return length - i;
        i = this.c;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int iBH;
        int i;
        int iK = k(this.c + this.a);
        int i2 = this.c;
        if (i2 < iK) {
            iBH = iK - 1;
            if (i2 <= iBH) {
                while (!defpackage.afga.f(obj, this.d[iBH])) {
                    if (iBH != i2) {
                        iBH--;
                    }
                }
                i = this.c;
            }
            return -1;
        }
        if (!isEmpty() && i2 >= iK) {
            int i3 = iK - 1;
            while (true) {
                java.lang.Object[] objArr = this.d;
                if (i3 < 0) {
                    iBH = defpackage.afga.bH(objArr);
                    int i4 = this.c;
                    if (i4 <= iBH) {
                        while (!defpackage.afga.f(obj, this.d[iBH])) {
                            if (iBH != i4) {
                                iBH--;
                            }
                        }
                        break;
                    }
                } else if (defpackage.afga.f(obj, objArr[i3])) {
                    iBH = i3 + this.d.length;
                    i = this.c;
                } else {
                    i3--;
                }
            }
            i = this.c;
        }
        return -1;
        return iBH - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        int iK;
        java.lang.Object[] objArr;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.d.length == 0) {
            return false;
        }
        int iK2 = k(this.c + this.a);
        int i = this.c;
        if (i < iK2) {
            iK = i;
            while (true) {
                objArr = this.d;
                if (i >= iK2) {
                    break;
                }
                java.lang.Object obj = objArr[i];
                if (collection.contains(obj)) {
                    z = true;
                } else {
                    this.d[iK] = obj;
                    iK++;
                }
                i++;
            }
            defpackage.afga.by(objArr, null, iK, iK2);
        } else {
            int length = this.d.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                java.lang.Object[] objArr2 = this.d;
                java.lang.Object obj2 = objArr2[i];
                objArr2[i] = null;
                if (collection.contains(obj2)) {
                    z2 = true;
                } else {
                    this.d[i2] = obj2;
                    i2++;
                }
                i++;
            }
            iK = k(i2);
            for (int i3 = 0; i3 < iK2; i3++) {
                java.lang.Object[] objArr3 = this.d;
                java.lang.Object obj3 = objArr3[i3];
                objArr3[i3] = null;
                if (collection.contains(obj3)) {
                    z2 = true;
                } else {
                    this.d[iK] = obj3;
                    iK = i(iK);
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        o();
        this.a = j(iK - this.c);
        return true;
    }

    public final java.lang.Object removeFirst() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        java.lang.Object[] objArr = this.d;
        int i = this.c;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        this.c = i(i);
        this.a--;
        return obj;
    }

    public final java.lang.Object removeLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        int iK = k(this.c + (this.a - 1));
        java.lang.Object[] objArr = this.d;
        java.lang.Object obj = objArr[iK];
        objArr[iK] = null;
        this.a--;
        return obj;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        defpackage.a.aH(i, i2, this.a);
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == this.a) {
                clear();
                return;
            }
            if (i3 == 1) {
                d(i);
                return;
            }
            o();
            int i4 = this.a - i2;
            int i5 = this.c;
            if (i < i4) {
                int iK = k(i5 + (i - 1));
                int iK2 = k(this.c + (i2 - 1));
                while (i > 0) {
                    int i6 = iK + 1;
                    int iMin = java.lang.Math.min(i, java.lang.Math.min(i6, iK2 + 1));
                    java.lang.Object[] objArr = this.d;
                    int i7 = iK2 - iMin;
                    int i8 = iK - iMin;
                    defpackage.afga.ck(objArr, objArr, i7 + 1, i8 + 1, i6);
                    iK = j(i8);
                    iK2 = j(i7);
                    i -= iMin;
                }
                int iK3 = k(this.c + i3);
                n(this.c, iK3);
                this.c = iK3;
            } else {
                int iK4 = k(i5 + i2);
                int iK5 = k(this.c + i);
                int i9 = this.a;
                while (true) {
                    i9 -= i2;
                    if (i9 <= 0) {
                        break;
                    }
                    int length = this.d.length;
                    i2 = java.lang.Math.min(i9, java.lang.Math.min(length - iK4, length - iK5));
                    java.lang.Object[] objArr2 = this.d;
                    int i10 = iK4 + i2;
                    defpackage.afga.ck(objArr2, objArr2, iK5, iK4, i10);
                    iK4 = k(i10);
                    iK5 = k(iK5 + i2);
                }
                int iK6 = k(this.c + this.a);
                n(j(iK6 - i3), iK6);
            }
            this.a -= i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        int iK;
        java.lang.Object[] objArr;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.d.length == 0) {
            return false;
        }
        int iK2 = k(this.c + this.a);
        int i = this.c;
        if (i < iK2) {
            iK = i;
            while (true) {
                objArr = this.d;
                if (i >= iK2) {
                    break;
                }
                java.lang.Object obj = objArr[i];
                if (collection.contains(obj)) {
                    this.d[iK] = obj;
                    iK++;
                } else {
                    z = true;
                }
                i++;
            }
            defpackage.afga.by(objArr, null, iK, iK2);
        } else {
            int length = this.d.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                java.lang.Object[] objArr2 = this.d;
                java.lang.Object obj2 = objArr2[i];
                objArr2[i] = null;
                if (collection.contains(obj2)) {
                    this.d[i2] = obj2;
                    i2++;
                } else {
                    z2 = true;
                }
                i++;
            }
            iK = k(i2);
            for (int i3 = 0; i3 < iK2; i3++) {
                java.lang.Object[] objArr3 = this.d;
                java.lang.Object obj3 = objArr3[i3];
                objArr3[i3] = null;
                if (collection.contains(obj3)) {
                    this.d[iK] = obj3;
                    iK = i(iK);
                } else {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        o();
        this.a = j(iK - this.c);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        defpackage.a.aF(i, this.a);
        int iK = k(this.c + i);
        java.lang.Object[] objArr = this.d;
        E e2 = (E) objArr[iK];
        objArr[iK] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        int i = this.a;
        if (length < i) {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            tArr = (T[]) ((java.lang.Object[]) objNewInstance);
        }
        int iK = k(this.c + this.a);
        int i2 = this.c;
        if (i2 < iK) {
            defpackage.afga.cv(this.d, tArr, i2, iK, 2);
        } else if (!isEmpty()) {
            java.lang.Object[] objArr = this.d;
            defpackage.afga.ck(objArr, tArr, 0, i2, objArr.length);
            java.lang.Object[] objArr2 = this.d;
            defpackage.afga.ck(objArr2, tArr, objArr2.length - this.c, 0, iK);
        }
        defpackage.afga.br(this.a, tArr);
        return tArr;
    }

    public afbz() {
        this.d = b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[this.a]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        o();
        m(this.a + collection.size());
        l(k(this.c + this.a), collection);
        return true;
    }
}
