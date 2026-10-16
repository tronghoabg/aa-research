package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yef<E> extends java.util.AbstractSet<E> implements java.io.Serializable {
    transient java.lang.Object[] a;
    public transient int b;
    private transient java.lang.Object c;
    private transient int[] d;
    private transient int e;

    yef() {
        f(3);
    }

    private final int h() {
        return (1 << (this.b & 31)) - 1;
    }

    private final int i(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        java.lang.Object objAE = defpackage.ysr.aE(i2);
        if (i4 != 0) {
            defpackage.ysr.aG(objAE, i3 & i5, i4 + 1);
        }
        java.lang.Object objJ = j();
        int[] iArrL = l();
        for (int i6 = 0; i6 <= i; i6++) {
            int iAD = defpackage.ysr.aD(objJ, i6);
            while (iAD != 0) {
                int i7 = iAD - 1;
                int i8 = iArrL[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iAD2 = defpackage.ysr.aD(objAE, i10);
                defpackage.ysr.aG(objAE, i10, iAD);
                iArrL[i7] = ((~i5) & i9) | (iAD2 & i5);
                iAD = i8 & i;
            }
        }
        this.c = objAE;
        k(i5);
        return i5;
    }

    private final java.lang.Object j() {
        java.lang.Object obj = this.c;
        obj.getClass();
        return obj;
    }

    private final void k(int i) {
        this.b = ((32 - java.lang.Integer.numberOfLeadingZeros(i)) & 31) | (this.b & (-32));
    }

    private final int[] l() {
        int[] iArr = this.d;
        iArr.getClass();
        return iArr;
    }

    private final java.lang.Object[] m() {
        java.lang.Object[] objArr = this.a;
        objArr.getClass();
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new java.io.InvalidObjectException(defpackage.a.bo(i, "Invalid size: "));
        }
        f(i);
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        java.util.Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    final int a() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int iMin;
        if (g()) {
            defpackage.ysr.bk(g(), "Arrays already allocated");
            int i = this.b;
            int iMax = java.lang.Math.max(4, defpackage.ysr.aB(i + 1));
            this.c = defpackage.ysr.aE(iMax);
            k(iMax - 1);
            this.d = new int[i];
            this.a = new java.lang.Object[i];
        }
        java.util.Set setD = d();
        if (setD != null) {
            return setD.add(e);
        }
        int[] iArrL = l();
        java.lang.Object[] objArrM = m();
        int i2 = this.e;
        int i3 = i2 + 1;
        int iAA = defpackage.ysr.aA(e);
        int iH = h();
        int i4 = iAA & iH;
        int iAD = defpackage.ysr.aD(j(), i4);
        if (iAD != 0) {
            int i5 = ~iH;
            int i6 = iAA & i5;
            boolean z = false;
            int i7 = 0;
            while (true) {
                int i8 = iAD - 1;
                int i9 = iArrL[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && j$.util.Objects.equals(e, objArrM[i8])) {
                    return z;
                }
                int i11 = i9 & iH;
                int i12 = i7 + 1;
                if (i11 == 0) {
                    if (i12 < 9) {
                        if (i3 <= iH) {
                            iArrL[i8] = i10 | (i3 & iH);
                            break;
                        }
                        iH = i(iH, (iH < 32 ? 4 : 2) * (iH + 1), iAA, i2);
                        break;
                    }
                    java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(h() + 1, 1.0f);
                    int iA = a();
                    while (iA >= 0) {
                        linkedHashSet.add(c(iA));
                        iA = b(iA);
                    }
                    this.c = linkedHashSet;
                    this.d = null;
                    this.a = null;
                    e();
                    return linkedHashSet.add(e);
                }
                iAD = i11;
                i7 = i12;
                z = false;
            }
        } else if (i3 > iH) {
            iH = i(iH, (iH >= 32 ? 2 : 4) * (iH + 1), iAA, i2);
        } else {
            defpackage.ysr.aG(j(), i4, i3);
        }
        int length = l().length;
        if (i3 > length && (iMin = java.lang.Math.min(1073741823, (java.lang.Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.d = java.util.Arrays.copyOf(l(), iMin);
            this.a = java.util.Arrays.copyOf(m(), iMin);
        }
        l()[i2] = (~iH) & iAA;
        m()[i2] = e;
        this.e = i3;
        e();
        return true;
    }

    final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.e) {
            return i2;
        }
        return -1;
    }

    public final java.lang.Object c(int i) {
        return m()[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (g()) {
            return;
        }
        e();
        java.util.Set setD = d();
        if (setD != null) {
            this.b = defpackage.ysr.cK(size(), 3, 1073741823);
            setD.clear();
            this.c = null;
            this.e = 0;
            return;
        }
        java.util.Arrays.fill(m(), 0, this.e, (java.lang.Object) null);
        defpackage.ysr.aF(j());
        java.util.Arrays.fill(l(), 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (g()) {
            return false;
        }
        java.util.Set setD = d();
        if (setD != null) {
            return setD.contains(obj);
        }
        int iAA = defpackage.ysr.aA(obj);
        int iH = h();
        int iAD = defpackage.ysr.aD(j(), iAA & iH);
        if (iAD != 0) {
            int i = ~iH;
            int i2 = iAA & i;
            do {
                int i3 = iAD - 1;
                int i4 = l()[i3];
                if ((i4 & i) == i2 && j$.util.Objects.equals(obj, c(i3))) {
                    return true;
                }
                iAD = i4 & iH;
            } while (iAD != 0);
        }
        return false;
    }

    final java.util.Set d() {
        java.lang.Object obj = this.c;
        if (obj instanceof java.util.Set) {
            return (java.util.Set) obj;
        }
        return null;
    }

    final void e() {
        this.b += 32;
    }

    final void f(int i) {
        this.b = java.lang.Math.min(java.lang.Math.max(i, 1), 1073741823);
    }

    final boolean g() {
        return this.c == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<E> iterator() {
        java.util.Set setD = d();
        return setD != null ? setD.iterator() : new defpackage.yee(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int i;
        int i2;
        if (!g()) {
            java.util.Set setD = d();
            if (setD != null) {
                return setD.remove(obj);
            }
            int iH = h();
            int iAC = defpackage.ysr.aC(obj, null, iH, j(), l(), m(), null);
            if (iAC != -1) {
                java.lang.Object objJ = j();
                int[] iArrL = l();
                java.lang.Object[] objArrM = m();
                int size = size();
                int i3 = size - 1;
                if (iAC < i3) {
                    int i4 = iAC + 1;
                    java.lang.Object obj2 = objArrM[i3];
                    objArrM[iAC] = obj2;
                    objArrM[i3] = null;
                    iArrL[iAC] = iArrL[i3];
                    iArrL[i3] = 0;
                    int iAA = defpackage.ysr.aA(obj2) & iH;
                    int iAD = defpackage.ysr.aD(objJ, iAA);
                    if (iAD == size) {
                        defpackage.ysr.aG(objJ, iAA, i4);
                    } else {
                        while (true) {
                            i = iAD - 1;
                            i2 = iArrL[i];
                            int i5 = i2 & iH;
                            if (i5 == size) {
                                break;
                            }
                            iAD = i5;
                        }
                        iArrL[i] = (i2 & (~iH)) | (i4 & iH);
                    }
                } else {
                    objArrM[iAC] = null;
                    iArrL[iAC] = 0;
                }
                this.e--;
                e();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        java.util.Set setD = d();
        return setD != null ? setD.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (g()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        java.util.Set setD = d();
        if (setD != null) {
            return (T[]) setD.toArray(tArr);
        }
        java.lang.Object[] objArrM = m();
        int i = this.e;
        defpackage.ysr.bi(0, i, objArrM.length);
        int length = tArr.length;
        if (length < i) {
            tArr = (T[]) defpackage.ysr.y(tArr, i);
        } else if (length > i) {
            tArr[i] = null;
        }
        java.lang.System.arraycopy(objArrM, 0, tArr, 0, i);
        return tArr;
    }

    public yef(int i) {
        f(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        if (g()) {
            return new java.lang.Object[0];
        }
        java.util.Set setD = d();
        return setD != null ? setD.toArray() : java.util.Arrays.copyOf(m(), this.e);
    }
}
