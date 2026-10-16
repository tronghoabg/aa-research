package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yge<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable, defpackage.ydi {
    public transient java.lang.Object[] a;
    public transient java.lang.Object[] b;
    public transient int c;
    public transient int d;
    public transient int e;
    public transient int[] f;
    public transient defpackage.ydi g;
    private transient int[] h;
    private transient int[] i;
    private transient int[] j;
    private transient int[] k;
    private transient int l;
    private transient int[] m;
    private transient java.util.Set n;
    private transient java.util.Set o;
    private transient java.util.Set p;

    public yge() {
        i();
    }

    private final int n(int i) {
        return (this.h.length - 1) & i;
    }

    private final int o(java.lang.Object obj, int i, int[] iArr, int[] iArr2, java.lang.Object[] objArr) {
        int i2 = iArr[n(i)];
        while (i2 != -1) {
            if (j$.util.Objects.equals(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    private final void p(int i, int i2) {
        defpackage.ysr.aX(i != -1);
        int iN = n(i2);
        int[] iArr = this.h;
        int i3 = iArr[iN];
        int[] iArr2 = this.j;
        if (i3 == i) {
            iArr[iN] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = iArr2[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new java.lang.AssertionError("Expected to find entry with key ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.a[i]))));
            }
            int[] iArr3 = this.j;
            if (i3 == i) {
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = iArr3[i3];
        }
    }

    private final void q(int i, int i2) {
        defpackage.ysr.aX(i != -1);
        int iN = n(i2);
        int[] iArr = this.i;
        int i3 = iArr[iN];
        int[] iArr2 = this.k;
        if (i3 == i) {
            iArr[iN] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = iArr2[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new java.lang.AssertionError("Expected to find entry with value ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.b[i]))));
            }
            int[] iArr3 = this.k;
            if (i3 == i) {
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = iArr3[i3];
        }
    }

    private final void r(int i) {
        int length = this.j.length;
        if (length < i) {
            int iF = defpackage.ygl.f(length, i);
            this.a = java.util.Arrays.copyOf(this.a, iF);
            this.b = java.util.Arrays.copyOf(this.b, iF);
            int[] iArr = this.j;
            int length2 = iArr.length;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iF);
            java.util.Arrays.fill(iArrCopyOf, length2, iF, -1);
            this.j = iArrCopyOf;
            int[] iArr2 = this.k;
            int length3 = iArr2.length;
            int[] iArrCopyOf2 = java.util.Arrays.copyOf(iArr2, iF);
            java.util.Arrays.fill(iArrCopyOf2, length3, iF, -1);
            this.k = iArrCopyOf2;
            int[] iArr3 = this.m;
            int length4 = iArr3.length;
            int[] iArrCopyOf3 = java.util.Arrays.copyOf(iArr3, iF);
            java.util.Arrays.fill(iArrCopyOf3, length4, iF, -1);
            this.m = iArrCopyOf3;
            int[] iArr4 = this.f;
            int length5 = iArr4.length;
            int[] iArrCopyOf4 = java.util.Arrays.copyOf(iArr4, iF);
            java.util.Arrays.fill(iArrCopyOf4, length5, iF, -1);
            this.f = iArrCopyOf4;
        }
        if (this.h.length < i) {
            int iAB = defpackage.ysr.aB(i);
            int[] iArr5 = new int[iAB];
            java.util.Arrays.fill(iArr5, -1);
            this.h = iArr5;
            int[] iArr6 = new int[iAB];
            java.util.Arrays.fill(iArr6, -1);
            this.i = iArr6;
            for (int i2 = 0; i2 < this.c; i2++) {
                int iN = n(defpackage.ysr.aA(this.a[i2]));
                int[] iArr7 = this.j;
                int[] iArr8 = this.h;
                iArr7[i2] = iArr8[iN];
                iArr8[iN] = i2;
                int iN2 = n(defpackage.ysr.aA(this.b[i2]));
                int[] iArr9 = this.k;
                int[] iArr10 = this.i;
                iArr9[i2] = iArr10[iN2];
                iArr10[iN2] = i2;
            }
        }
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        i();
        for (int i2 = 0; i2 < i; i2++) {
            j(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final void s(int i, int i2) {
        if (i == -1) {
            throw new java.lang.IllegalArgumentException();
        }
        int iN = n(i2);
        int[] iArr = this.j;
        int[] iArr2 = this.h;
        iArr[i] = iArr2[iN];
        iArr2[iN] = i;
    }

    private final void t(int i, int i2) {
        if (i == -1) {
            throw new java.lang.IllegalArgumentException();
        }
        int iN = n(i2);
        int[] iArr = this.k;
        int[] iArr2 = this.i;
        iArr[i] = iArr2[iN];
        iArr2[iN] = i;
    }

    private final void u(int i, int i2, int i3) {
        int i4;
        int[] iArr;
        int i5;
        int[] iArr2;
        defpackage.ysr.aX(i != -1);
        p(i, i2);
        q(i, i3);
        v(this.m[i], this.f[i]);
        int i6 = this.c - 1;
        if (i6 != i) {
            int i7 = this.m[i6];
            int i8 = this.f[i6];
            v(i7, i);
            v(i, i8);
            java.lang.Object[] objArr = this.a;
            java.lang.Object obj = objArr[i6];
            java.lang.Object[] objArr2 = this.b;
            java.lang.Object obj2 = objArr2[i6];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int iN = n(defpackage.ysr.aA(obj));
            int[] iArr3 = this.h;
            int i9 = iArr3[iN];
            if (i9 == i6) {
                iArr3[iN] = i;
            } else {
                int i10 = this.j[i9];
                while (true) {
                    i4 = i9;
                    i9 = i10;
                    iArr = this.j;
                    if (i9 == i6) {
                        break;
                    } else {
                        i10 = iArr[i9];
                    }
                }
                iArr[i4] = i;
            }
            int[] iArr4 = this.j;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
            int iN2 = n(defpackage.ysr.aA(obj2));
            int[] iArr5 = this.i;
            int i11 = iArr5[iN2];
            if (i11 == i6) {
                iArr5[iN2] = i;
            } else {
                int i12 = this.k[i11];
                while (true) {
                    i5 = i11;
                    i11 = i12;
                    iArr2 = this.k;
                    if (i11 == i6) {
                        break;
                    } else {
                        i12 = iArr2[i11];
                    }
                }
                iArr2[i5] = i;
            }
            int[] iArr6 = this.k;
            iArr6[i] = iArr6[i6];
            iArr6[i6] = -1;
        }
        java.lang.Object[] objArr3 = this.a;
        int i13 = this.c - 1;
        objArr3[i13] = null;
        this.b[i13] = null;
        this.c = i13;
        this.d++;
    }

    private final void v(int i, int i2) {
        if (i == -2) {
            this.e = i2;
        } else {
            this.f[i] = i2;
        }
        if (i2 == -2) {
            this.l = i;
        } else {
            this.m[i2] = i;
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.c);
        for (java.util.Map.Entry<K, V> entry : entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // defpackage.ydi
    public final defpackage.ydi a() {
        defpackage.ydi ydiVar = this.g;
        if (ydiVar != null) {
            return ydiVar;
        }
        defpackage.yfy yfyVar = new defpackage.yfy(this);
        this.g = yfyVar;
        return yfyVar;
    }

    public final int b(java.lang.Object obj) {
        return c(obj, defpackage.ysr.aA(obj));
    }

    public final int c(java.lang.Object obj, int i) {
        return o(obj, i, this.h, this.j, this.a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        java.util.Arrays.fill(this.a, 0, this.c, (java.lang.Object) null);
        java.util.Arrays.fill(this.b, 0, this.c, (java.lang.Object) null);
        java.util.Arrays.fill(this.h, -1);
        java.util.Arrays.fill(this.i, -1);
        java.util.Arrays.fill(this.j, 0, this.c, -1);
        java.util.Arrays.fill(this.k, 0, this.c, -1);
        java.util.Arrays.fill(this.m, 0, this.c, -1);
        java.util.Arrays.fill(this.f, 0, this.c, -1);
        this.c = 0;
        this.e = -2;
        this.l = -2;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return b(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return d(obj) != -1;
    }

    public final int d(java.lang.Object obj) {
        return e(obj, defpackage.ysr.aA(obj));
    }

    public final int e(java.lang.Object obj, int i) {
        return o(obj, i, this.i, this.k, this.b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        java.util.Set<java.util.Map.Entry<K, V>> set = this.p;
        if (set != null) {
            return set;
        }
        defpackage.yfx yfxVar = new defpackage.yfx(this);
        this.p = yfxVar;
        return yfxVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final java.util.Set values() {
        java.util.Set set = this.o;
        if (set != null) {
            return set;
        }
        ygb ygbVar = new ygb(this);
        this.o = ygbVar;
        return ygbVar;
    }

    public final void g(int i, int i2) {
        u(i, i2, defpackage.ysr.aA(this.b[i]));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(java.lang.Object obj) {
        int iB = b(obj);
        if (iB == -1) {
            return null;
        }
        return (V) this.b[iB];
    }

    public final void h(int i, int i2) {
        u(i, defpackage.ysr.aA(this.a[i]), i2);
    }

    final void i() {
        int iAB = defpackage.ysr.aB(16);
        this.c = 0;
        this.a = new java.lang.Object[16];
        this.b = new java.lang.Object[16];
        int[] iArr = new int[iAB];
        java.util.Arrays.fill(iArr, -1);
        this.h = iArr;
        int[] iArr2 = new int[iAB];
        java.util.Arrays.fill(iArr2, -1);
        this.i = iArr2;
        int[] iArr3 = new int[16];
        java.util.Arrays.fill(iArr3, -1);
        this.j = iArr3;
        int[] iArr4 = new int[16];
        java.util.Arrays.fill(iArr4, -1);
        this.k = iArr4;
        this.e = -2;
        this.l = -2;
        int[] iArr5 = new int[16];
        java.util.Arrays.fill(iArr5, -1);
        this.m = iArr5;
        int[] iArr6 = new int[16];
        java.util.Arrays.fill(iArr6, -1);
        this.f = iArr6;
    }

    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        int iAA = defpackage.ysr.aA(obj);
        int iC = c(obj, iAA);
        if (iC != -1) {
            java.lang.Object obj3 = this.b[iC];
            if (j$.util.Objects.equals(obj3, obj2)) {
                return obj2;
            }
            m(iC, obj2);
            return obj3;
        }
        int iAA2 = defpackage.ysr.aA(obj2);
        defpackage.ysr.bc(e(obj2, iAA2) == -1, "Value already present: %s", obj2);
        r(this.c + 1);
        java.lang.Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = obj;
        this.b[i] = obj2;
        s(i, iAA);
        t(this.c, iAA2);
        v(this.l, this.c);
        v(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    public final java.lang.Object k(java.lang.Object obj, java.lang.Object obj2) {
        int iAA = defpackage.ysr.aA(obj);
        int iE = e(obj, iAA);
        if (iE != -1) {
            java.lang.Object obj3 = this.a[iE];
            if (j$.util.Objects.equals(obj3, obj2)) {
                return obj2;
            }
            l(iE, obj2);
            return obj3;
        }
        int i = this.l;
        int iAA2 = defpackage.ysr.aA(obj2);
        defpackage.ysr.bc(c(obj2, iAA2) == -1, "Key already present: %s", obj2);
        r(this.c + 1);
        java.lang.Object[] objArr = this.a;
        int i2 = this.c;
        objArr[i2] = obj2;
        this.b[i2] = obj;
        s(i2, iAA2);
        t(this.c, iAA);
        int i3 = i == -2 ? this.e : this.f[i];
        v(i, this.c);
        v(this.c, i3);
        this.c++;
        this.d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        java.util.Set<K> set = this.n;
        if (set != null) {
            return set;
        }
        yga ygaVar = new yga(this);
        this.n = ygaVar;
        return ygaVar;
    }

    public final void l(int i, java.lang.Object obj) {
        defpackage.ysr.aX(i != -1);
        int iC = c(obj, defpackage.ysr.aA(obj));
        int i2 = this.l;
        if (iC != -1) {
            throw new java.lang.IllegalArgumentException("Key already present in map: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
        }
        if (i2 == i) {
            i2 = this.m[i];
        } else if (i2 == this.c) {
            i2 = iC;
        }
        if (i == -2) {
            iC = this.f[-2];
        } else if (this.c != -2) {
            iC = -2;
        }
        v(this.m[i], this.f[i]);
        p(i, defpackage.ysr.aA(this.a[i]));
        this.a[i] = obj;
        s(i, defpackage.ysr.aA(obj));
        v(i2, i);
        v(i, iC);
    }

    public final void m(int i, java.lang.Object obj) {
        defpackage.ysr.aX(i != -1);
        int iAA = defpackage.ysr.aA(obj);
        if (e(obj, iAA) != -1) {
            throw new java.lang.IllegalArgumentException("Value already present in map: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
        }
        q(i, defpackage.ysr.aA(this.b[i]));
        this.b[i] = obj;
        t(i, iAA);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        return (V) j(k, v);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        int iAA = defpackage.ysr.aA(obj);
        int iC = c(obj, iAA);
        if (iC == -1) {
            return null;
        }
        V v = (V) this.b[iC];
        g(iC, iAA);
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }
}
