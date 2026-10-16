package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class yed<K, V> implements java.util.Map<K, V>, java.io.Serializable {
    public static final java.lang.Object a = new java.lang.Object();
    transient int[] b;
    transient java.lang.Object[] c;
    transient java.lang.Object[] d;
    public transient int e;
    public transient int f;
    private transient java.lang.Object g;

    public yed() {
        p(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new java.io.InvalidObjectException(defpackage.a.bo(i, "Invalid size: "));
        }
        p(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        java.util.Iterator itK = k();
        while (itK.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) itK.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private final int y(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        java.lang.Object objAE = defpackage.ysr.aE(i2);
        if (i4 != 0) {
            defpackage.ysr.aG(objAE, i3 & i5, i4 + 1);
        }
        java.lang.Object objI = i();
        int[] iArrV = v();
        for (int i6 = 0; i6 <= i; i6++) {
            int iAD = defpackage.ysr.aD(objI, i6);
            while (iAD != 0) {
                int i7 = iAD - 1;
                int i8 = iArrV[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iAD2 = defpackage.ysr.aD(objAE, i10);
                defpackage.ysr.aG(objAE, i10, iAD);
                iArrV[i7] = ((~i5) & i9) | (iAD2 & i5);
                iAD = i8 & i;
            }
        }
        this.g = objAE;
        z(i5);
        return i5;
    }

    private final void z(int i) {
        this.e = ((32 - java.lang.Integer.numberOfLeadingZeros(i)) & 31) | (this.e & (-32));
    }

    public int a(int i, int i2) {
        return i - 1;
    }

    public int b() {
        defpackage.ysr.bk(u(), "Arrays already allocated");
        int i = this.e;
        int iMax = java.lang.Math.max(4, defpackage.ysr.aB(i + 1));
        this.g = defpackage.ysr.aE(iMax);
        z(iMax - 1);
        this.b = new int[i];
        this.c = new java.lang.Object[i];
        this.d = new java.lang.Object[i];
        return i;
    }

    public int c() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.Map
    public void clear() {
        if (u()) {
            return;
        }
        o();
        java.util.Map mapN = n();
        if (mapN != null) {
            this.e = java.lang.Math.min(java.lang.Math.max(size(), 3), 1073741823);
            mapN.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        java.util.Arrays.fill(w(), 0, this.f, (java.lang.Object) null);
        java.util.Arrays.fill(x(), 0, this.f, (java.lang.Object) null);
        defpackage.ysr.aF(i());
        java.util.Arrays.fill(v(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.util.Map mapN = n();
        if (mapN != null) {
            return mapN.containsKey(obj);
        }
        return f(obj) != -1;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        java.util.Map mapN = n();
        if (mapN != null) {
            return mapN.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (j$.util.Objects.equals(obj, j(i))) {
                return true;
            }
        }
        return false;
    }

    public int d(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    public final int e() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return new defpackage.ydy(this);
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return defpackage.ysr.N(this, obj);
    }

    public final int f(java.lang.Object obj) {
        if (u()) {
            return -1;
        }
        int iAA = defpackage.ysr.aA(obj);
        int iE = e();
        int iAD = defpackage.ysr.aD(i(), iAA & iE);
        if (iAD != 0) {
            int i = ~iE;
            int i2 = iAA & i;
            do {
                int i3 = iAD - 1;
                int i4 = v()[i3];
                if ((i4 & i) == i2 && j$.util.Objects.equals(obj, g(i3))) {
                    return i3;
                }
                iAD = i4 & iE;
            } while (iAD != 0);
        }
        return -1;
    }

    public final java.lang.Object g(int i) {
        return w()[i];
    }

    @Override // java.util.Map
    public final V get(java.lang.Object obj) {
        java.util.Map mapN = n();
        if (mapN != null) {
            return (V) mapN.get(obj);
        }
        int iF = f(obj);
        if (iF == -1) {
            return null;
        }
        return (V) j(iF);
    }

    public final java.lang.Object h(java.lang.Object obj) {
        int iE;
        int iAC;
        if (u() || (iAC = defpackage.ysr.aC(obj, null, (iE = e()), i(), v(), w(), null)) == -1) {
            return a;
        }
        java.lang.Object objJ = j(iAC);
        r(iAC, iE);
        this.f--;
        o();
        return objJ;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return new defpackage.ydy(this).hashCode();
    }

    public final java.lang.Object i() {
        java.lang.Object obj = this.g;
        obj.getClass();
        return obj;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final java.lang.Object j(int i) {
        return x()[i];
    }

    final java.util.Iterator k() {
        java.util.Map mapN = n();
        return mapN != null ? mapN.entrySet().iterator() : new defpackage.ydw(this);
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        return new yea(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.util.Map l() {
        java.util.Map mapM = m(e() + 1);
        int iC = c();
        while (iC >= 0) {
            mapM.put(g(iC), j(iC));
            iC = d(iC);
        }
        this.g = mapM;
        this.b = null;
        this.c = null;
        this.d = null;
        o();
        return mapM;
    }

    public java.util.Map m(int i) {
        return new java.util.LinkedHashMap(i, 1.0f);
    }

    final java.util.Map n() {
        java.lang.Object obj = this.g;
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        return null;
    }

    final void o() {
        this.e += 32;
    }

    public void p(int i) {
        defpackage.ysr.aY(i >= 0, "Expected size must be >= 0");
        this.e = java.lang.Math.min(java.lang.Math.max(i, 1), 1073741823);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    @Override // java.util.Map
    public final V put(K k, V v) {
        int i;
        int iY;
        int length;
        int iMin;
        K k2 = k;
        V v2 = v;
        if (u()) {
            b();
        }
        java.util.Map mapN = n();
        if (mapN != null) {
            return (V) mapN.put(k2, v2);
        }
        int[] iArrV = v();
        java.lang.Object[] objArrW = w();
        java.lang.Object[] objArrX = x();
        int i2 = this.f;
        int i3 = i2 + 1;
        int iAA = defpackage.ysr.aA(k2);
        int iE = e();
        int i4 = iAA & iE;
        int iAD = defpackage.ysr.aD(i(), i4);
        if (iAD == 0) {
            if (i3 > iE) {
                iY = y(iE, (iE < 32 ? 4 : 2) * (iE + 1), iAA, i2);
                i = 1;
            } else {
                defpackage.ysr.aG(i(), i4, i3);
                i = 1;
            }
            length = v().length;
            if (i3 > length) {
                int i5 = i;
                iMin = java.lang.Math.min(1073741823, (java.lang.Math.max(i5, length >>> 1) + length) | i5);
                if (iMin != length) {
                    s(iMin);
                }
            }
            q(i2, k2, v2, iAA, iY);
            this.f = i3;
            o();
            return null;
        }
        int i6 = ~iE;
        int i7 = iAA & i6;
        int i8 = 0;
        while (true) {
            int i9 = iAD - 1;
            int i10 = iArrV[i9];
            int i11 = i10 & i6;
            i = 1;
            if (i11 == i7 && j$.util.Objects.equals(k2, objArrW[i9])) {
                V v3 = (V) objArrX[i9];
                objArrX[i9] = v2;
                return v3;
            }
            int i12 = i10 & iE;
            int i13 = i8 + 1;
            if (i12 == 0) {
                if (i13 < 9) {
                    if (i3 <= iE) {
                        iArrV[i9] = (i3 & iE) | i11;
                        break;
                    }
                    iE = y(iE, (iE < 32 ? 4 : 2) * (iE + 1), iAA, i2);
                    break;
                }
                return (V) l().put(k2, v2);
            }
            k2 = k;
            v2 = v;
            i8 = i13;
            iAD = i12;
        }
        iY = iE;
        length = v().length;
        if (i3 > length) {
            int i14 = i;
            iMin = java.lang.Math.min(1073741823, (java.lang.Math.max(i14, length >>> 1) + length) | i14);
            if (iMin != length) {
                s(iMin);
            }
        }
        q(i2, k2, v2, iAA, iY);
        this.f = i3;
        o();
        return null;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public void q(int i, java.lang.Object obj, java.lang.Object obj2, int i2, int i3) {
        v()[i] = i2 & (~i3);
        w()[i] = obj;
        t(i, obj2);
    }

    public void r(int i, int i2) {
        java.lang.Object objI = i();
        int[] iArrV = v();
        java.lang.Object[] objArrW = w();
        java.lang.Object[] objArrX = x();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrW[i] = null;
            objArrX[i] = null;
            iArrV[i] = 0;
            return;
        }
        int i4 = i + 1;
        java.lang.Object obj = objArrW[i3];
        objArrW[i] = obj;
        objArrX[i] = objArrX[i3];
        objArrW[i3] = null;
        objArrX[i3] = null;
        iArrV[i] = iArrV[i3];
        iArrV[i3] = 0;
        int iAA = defpackage.ysr.aA(obj) & i2;
        int iAD = defpackage.ysr.aD(objI, iAA);
        if (iAD == size) {
            defpackage.ysr.aG(objI, iAA, i4);
            return;
        }
        while (true) {
            int i5 = iAD - 1;
            int i6 = iArrV[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrV[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            iAD = i7;
        }
    }

    @Override // java.util.Map
    public final V remove(java.lang.Object obj) {
        java.util.Map mapN = n();
        if (mapN != null) {
            return (V) mapN.remove(obj);
        }
        V v = (V) h(obj);
        if (v == a) {
            return null;
        }
        return v;
    }

    public void s(int i) {
        this.b = java.util.Arrays.copyOf(v(), i);
        this.c = java.util.Arrays.copyOf(w(), i);
        this.d = java.util.Arrays.copyOf(x(), i);
    }

    @Override // java.util.Map
    public final int size() {
        java.util.Map mapN = n();
        return mapN != null ? mapN.size() : this.f;
    }

    public final void t(int i, java.lang.Object obj) {
        x()[i] = obj;
    }

    public final java.lang.String toString() {
        return defpackage.ysr.K(this);
    }

    final boolean u() {
        return this.g == null;
    }

    public final int[] v() {
        int[] iArr = this.b;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.Map
    public final java.util.Collection<V> values() {
        return new defpackage.yec(this);
    }

    public final java.lang.Object[] w() {
        java.lang.Object[] objArr = this.c;
        objArr.getClass();
        return objArr;
    }

    public final java.lang.Object[] x() {
        java.lang.Object[] objArr = this.d;
        objArr.getClass();
        return objArr;
    }

    public yed(int i) {
        p(i);
    }
}
