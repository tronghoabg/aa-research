package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afcy<K, V> implements java.util.Map<K, V>, java.io.Serializable, defpackage.afhg {
    public static final defpackage.afcy a;
    public java.lang.Object[] b;
    public java.lang.Object[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    private int[] i;
    private int j;
    private int k;
    private afda l;
    private afdb m;
    private defpackage.afcz n;

    static {
        defpackage.afcy afcyVar = new defpackage.afcy(0);
        afcyVar.h = true;
        a = afcyVar;
    }

    public afcy(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("capacity must be non-negative.");
        }
        java.lang.Object[] objArr = new java.lang.Object[i];
        int[] iArr = new int[i];
        int[] iArr2 = new int[defpackage.afga.B(i)];
        this.b = objArr;
        this.c = null;
        this.d = iArr;
        this.i = iArr2;
        this.j = 2;
        this.e = 0;
        this.k = java.lang.Integer.numberOfLeadingZeros(l()) + 1;
    }

    private final int l() {
        return this.i.length;
    }

    private final int m(java.lang.Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.k;
    }

    private final void n(boolean z) {
        int i;
        java.lang.Object[] objArr = this.c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.e;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.d;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                int i5 = i3 + 1;
                java.lang.Object[] objArr2 = this.b;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.i[i4] = i5;
                }
                i3 = i5;
            }
            i2++;
        }
        defpackage.afga.F(this.b, i3, i);
        if (objArr != null) {
            defpackage.afga.F(objArr, i3, this.e);
        }
        this.e = i3;
    }

    private final void o(int i) {
        java.lang.Object[] objArrCopyOf;
        int iD = d();
        int i2 = this.e;
        int i3 = iD - i2;
        int i4 = i2 - this.g;
        if (i3 < i && i3 + i4 >= i && i4 >= (d() >> 2)) {
            n(true);
            return;
        }
        int i5 = this.e + i;
        if (i5 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        if (i5 > d()) {
            int iCw = defpackage.afga.cw(d(), i5);
            java.lang.Object[] objArr = this.b;
            objArr.getClass();
            java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr, iCw);
            objArrCopyOf2.getClass();
            this.b = objArrCopyOf2;
            java.lang.Object[] objArr2 = this.c;
            if (objArr2 != null) {
                objArrCopyOf = java.util.Arrays.copyOf(objArr2, iCw);
                objArrCopyOf.getClass();
            } else {
                objArrCopyOf = null;
            }
            this.c = objArrCopyOf;
            int[] iArrCopyOf = java.util.Arrays.copyOf(this.d, iCw);
            iArrCopyOf.getClass();
            this.d = iArrCopyOf;
            int iB = defpackage.afga.B(iCw);
            if (iB > l()) {
                q(iB);
            }
        }
    }

    private final void p() {
        this.f++;
    }

    private final void q(int i) {
        int[] iArr;
        p();
        int i2 = 0;
        if (this.e > this.g) {
            n(false);
        }
        this.i = new int[i];
        this.k = java.lang.Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.e) {
            int i3 = i2 + 1;
            int iM = m(this.b[i2]);
            int i4 = this.j;
            while (true) {
                iArr = this.i;
                if (iArr[iM] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new java.lang.IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iM = iM == 0 ? l() - 1 : iM - 1;
            }
            iArr[iM] = i3;
            this.d[i2] = iM;
            i2 = i3;
        }
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() throws java.io.NotSerializableException {
        if (this.h) {
            return new afdd(this);
        }
        throw new java.io.NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(java.lang.Object obj) {
        f();
        while (true) {
            int iM = m(obj);
            int i = this.j;
            int i2 = i + i;
            int iL = l() >> 1;
            int i3 = 0;
            while (true) {
                int i4 = this.i[iM];
                if (i4 == 0) {
                    if (this.e >= d()) {
                        o(1);
                        break;
                    }
                    int i5 = this.e;
                    int i6 = i5 + 1;
                    this.e = i6;
                    this.b[i5] = obj;
                    this.d[i5] = iM;
                    this.i[iM] = i6;
                    this.g++;
                    p();
                    if (i3 > this.j) {
                        this.j = i3;
                    }
                    return i5;
                }
                if (defpackage.afga.f(this.b[i4 - 1], obj)) {
                    return -i4;
                }
                i3++;
                if (i3 > (i2 > iL ? iL : i2)) {
                    int iL2 = l();
                    q(iL2 + iL2);
                    break;
                }
                iM = iM == 0 ? l() - 1 : iM - 1;
            }
        }
    }

    public final int b(java.lang.Object obj) {
        int iM = m(obj);
        int i = this.j;
        while (true) {
            int i2 = this.i[iM];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (defpackage.afga.f(this.b[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM = iM == 0 ? l() - 1 : iM - 1;
        }
    }

    public final int c(java.lang.Object obj) {
        int i = this.e;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.d[i] >= 0) {
                java.lang.Object[] objArr = this.c;
                objArr.getClass();
                if (defpackage.afga.f(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        f();
        int i = this.e - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.i[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        defpackage.afga.F(this.b, 0, this.e);
        java.lang.Object[] objArr = this.c;
        if (objArr != null) {
            defpackage.afga.F(objArr, 0, this.e);
        }
        this.g = 0;
        this.e = 0;
        p();
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return b(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return c(obj) >= 0;
    }

    public final int d() {
        return this.b.length;
    }

    public final java.util.Map e() {
        f();
        this.h = true;
        if (this.g > 0) {
            return this;
        }
        defpackage.afcy afcyVar = a;
        afcyVar.getClass();
        return afcyVar;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        defpackage.afcz afczVar = this.n;
        if (afczVar != null) {
            return afczVar;
        }
        defpackage.afcz afczVar2 = new defpackage.afcz(this);
        this.n = afczVar2;
        return afczVar2;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (this.g == map.size() && h(map.entrySet())) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.h) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void g(int i) {
        int i2;
        int i3;
        defpackage.afga.E(this.b, i);
        java.lang.Object[] objArr = this.c;
        if (objArr != null) {
            defpackage.afga.E(objArr, i);
        }
        int iL = this.d[i];
        loop0: while (true) {
            int i4 = iL;
            int i5 = 0;
            do {
                iL = iL == 0 ? l() - 1 : iL - 1;
                int[] iArr = this.i;
                i2 = iArr[iL];
                i5++;
                if (i5 > this.j) {
                    iArr[i4] = 0;
                    break loop0;
                } else {
                    if (i2 == 0) {
                        iArr[i4] = 0;
                        break loop0;
                    }
                    i3 = i2 - 1;
                }
            } while (((m(this.b[i3]) - iL) & (l() - 1)) < i5);
            this.i[i4] = i2;
            this.d[i3] = i4;
        }
        this.d[i] = -1;
        this.g--;
        p();
    }

    @Override // java.util.Map
    public final V get(java.lang.Object obj) {
        int iB = b(obj);
        if (iB < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.c;
        objArr.getClass();
        return (V) objArr[iB];
    }

    public final boolean h(java.util.Collection collection) {
        collection.getClass();
        for (java.lang.Object obj : collection) {
            if (obj != null) {
                try {
                    if (!i((java.util.Map.Entry) obj)) {
                    }
                } catch (java.lang.ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        defpackage.afcu afcuVar = new defpackage.afcu(this);
        int i = 0;
        while (afcuVar.hasNext()) {
            int i2 = afcuVar.b;
            defpackage.afcy afcyVar = afcuVar.a;
            if (i2 >= afcyVar.e) {
                throw new java.util.NoSuchElementException();
            }
            afcuVar.b = i2 + 1;
            afcuVar.c = i2;
            java.lang.Object obj = afcyVar.b[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            java.lang.Object[] objArr = afcyVar.c;
            objArr.getClass();
            java.lang.Object obj2 = objArr[afcuVar.c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            afcuVar.b();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final boolean i(java.util.Map.Entry entry) {
        int iB = b(entry.getKey());
        if (iB < 0) {
            return false;
        }
        java.lang.Object[] objArr = this.c;
        objArr.getClass();
        return defpackage.afga.f(objArr[iB], entry.getValue());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.g == 0;
    }

    public final boolean j(java.lang.Object obj) {
        f();
        int iB = b(obj);
        if (iB < 0) {
            return false;
        }
        g(iB);
        return true;
    }

    public final java.lang.Object[] k() {
        java.lang.Object[] objArr = this.c;
        if (objArr != null) {
            return objArr;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[d()];
        this.c = objArr2;
        return objArr2;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
        afda afdaVar = this.l;
        if (afdaVar != null) {
            return afdaVar;
        }
        afda afdaVar2 = new afda(this);
        this.l = afdaVar2;
        return afdaVar2;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        f();
        int iA = a(k);
        java.lang.Object[] objArrK = k();
        if (iA >= 0) {
            objArrK[iA] = v;
            return null;
        }
        int i = (-iA) - 1;
        V v2 = (V) objArrK[i];
        objArrK[i] = v;
        return v2;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        map.getClass();
        f();
        java.util.Set<java.util.Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        o(setEntrySet.size());
        for (java.util.Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iA = a(entry.getKey());
            java.lang.Object[] objArrK = k();
            if (iA >= 0) {
                objArrK[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!defpackage.afga.f(entry.getValue(), objArrK[i])) {
                    objArrK[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final V remove(java.lang.Object obj) {
        f();
        int iB = b(obj);
        if (iB < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.c;
        objArr.getClass();
        V v = (V) objArr[iB];
        g(iB);
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((this.g * 3) + 2);
        sb.append("{");
        defpackage.afcu afcuVar = new defpackage.afcu(this);
        int i = 0;
        while (afcuVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = afcuVar.b;
            defpackage.afcy afcyVar = afcuVar.a;
            if (i2 >= afcyVar.e) {
                throw new java.util.NoSuchElementException();
            }
            afcuVar.b = i2 + 1;
            afcuVar.c = i2;
            java.lang.Object obj = afcyVar.b[i2];
            if (obj == afcyVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            java.lang.Object[] objArr = afcyVar.c;
            objArr.getClass();
            java.lang.Object obj2 = objArr[afcuVar.c];
            if (obj2 == afcyVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            afcuVar.b();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
        afdb afdbVar = this.m;
        if (afdbVar != null) {
            return afdbVar;
        }
        afdb afdbVar2 = new afdb(this);
        this.m = afdbVar2;
        return afdbVar2;
    }

    public afcy() {
        throw null;
    }
}
