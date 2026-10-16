package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class aba<K, V> {
    private int[] a;
    private java.lang.Object[] b;
    public int d;

    public aba(int i) {
        this.a = i == 0 ? defpackage.abg.a : new int[i];
        this.b = i == 0 ? defpackage.abg.c : new java.lang.Object[i + i];
    }

    private final int a(java.lang.Object obj, int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int iA = defpackage.abg.a(this.a, i2, i);
        if (iA < 0 || defpackage.afga.f(obj, this.b[iA + iA])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (defpackage.afga.f(obj, this.b[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (defpackage.afga.f(obj, this.b[i4 + i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    private final int j() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        int iA = defpackage.abg.a(this.a, i, 0);
        if (iA < 0 || this.b[iA + iA] == null) {
            return iA;
        }
        int i2 = iA + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iA - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 + i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int b(java.lang.Object obj) {
        int i = this.d;
        int i2 = i + i;
        java.lang.Object[] objArr = this.b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (defpackage.afga.f(obj, objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final int c(java.lang.Object obj) {
        return obj == null ? j() : a(obj, obj.hashCode());
    }

    public void clear() {
        if (this.d > 0) {
            this.a = defpackage.abg.a;
            this.b = defpackage.abg.c;
            this.d = 0;
        }
    }

    public final boolean containsKey(K k) {
        return c(k) >= 0;
    }

    public final boolean containsValue(java.lang.Object obj) {
        return b(obj) >= 0;
    }

    public final java.lang.Object d(int i) {
        if (i < 0 || i >= this.d) {
            defpackage.ca.Y(defpackage.a.bo(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[i + i];
    }

    public java.lang.Object e(int i) {
        if (i < 0 || i >= this.d) {
            defpackage.ca.Y(defpackage.a.bo(i, "Expected index to be within 0..size()-1, but was "));
        }
        java.lang.Object[] objArr = this.b;
        int i2 = i + i;
        java.lang.Object obj = objArr[i2 + 1];
        int i3 = this.d;
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i4 = i3 - 1;
        int[] iArr = this.a;
        int length = iArr.length;
        if (length <= 8 || i3 >= length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                iArr.getClass();
                iArr.getClass();
                java.lang.System.arraycopy(iArr, i5, iArr, i, i3 - i5);
                java.lang.Object[] objArr2 = this.b;
                objArr2.getClass();
                objArr2.getClass();
                int i6 = i5 + i5;
                java.lang.System.arraycopy(objArr2, i6, objArr2, i2, (i3 + i3) - i6);
            }
            java.lang.Object[] objArr3 = this.b;
            int i7 = i4 + i4;
            objArr3[i7] = null;
            objArr3[i7 + 1] = null;
        } else {
            int i8 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i8);
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.b, i8 + i8);
            objArrCopyOf.getClass();
            this.b = objArrCopyOf;
            if (i3 != this.d) {
                throw new java.util.ConcurrentModificationException();
            }
            if (i > 0) {
                int[] iArr2 = this.a;
                iArr.getClass();
                iArr2.getClass();
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
                java.lang.Object[] objArr4 = this.b;
                objArr.getClass();
                objArr4.getClass();
                java.lang.System.arraycopy(objArr, 0, objArr4, 0, i2);
            }
            if (i < i4) {
                int[] iArr3 = this.a;
                int i9 = i + 1;
                iArr.getClass();
                iArr3.getClass();
                java.lang.System.arraycopy(iArr, i9, iArr3, i, i3 - i9);
                java.lang.Object[] objArr5 = this.b;
                objArr.getClass();
                objArr5.getClass();
                int i10 = i9 + i9;
                java.lang.System.arraycopy(objArr, i10, objArr5, i2, (i3 + i3) - i10);
            }
        }
        if (i3 != this.d) {
            throw new java.util.ConcurrentModificationException();
        }
        this.d = i4;
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof defpackage.aba) {
                int i = this.d;
                defpackage.aba abaVar = (defpackage.aba) obj;
                if (i != abaVar.d) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    java.lang.Object objD = d(i2);
                    java.lang.Object objG = g(i2);
                    java.lang.Object obj2 = abaVar.get(objD);
                    if (objG == null) {
                        if (obj2 != null || !abaVar.containsKey(objD)) {
                            return false;
                        }
                    } else if (!defpackage.afga.f(objG, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof java.util.Map) || this.d != ((java.util.Map) obj).size()) {
                return false;
            }
            int i3 = this.d;
            for (int i4 = 0; i4 < i3; i4++) {
                java.lang.Object objD2 = d(i4);
                java.lang.Object objG2 = g(i4);
                java.util.Map map = (java.util.Map) obj;
                java.lang.Object obj3 = map.get(objD2);
                if (objG2 == null) {
                    if (obj3 != null || !map.containsKey(objD2)) {
                        return false;
                    }
                } else if (!defpackage.afga.f(objG2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
        }
        return false;
    }

    public java.lang.Object f(int i, java.lang.Object obj) {
        if (i < 0 || i >= this.d) {
            defpackage.ca.Y(defpackage.a.bo(i, "Expected index to be within 0..size()-1, but was "));
        }
        java.lang.Object[] objArr = this.b;
        int i2 = i + i + 1;
        java.lang.Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final java.lang.Object g(int i) {
        if (i < 0 || i >= this.d) {
            defpackage.ca.Y(defpackage.a.bo(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[i + i + 1];
    }

    public final V get(K k) {
        int iC = c(k);
        if (iC >= 0) {
            return (V) this.b[iC + iC + 1];
        }
        return null;
    }

    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        int iC = c(obj);
        return iC >= 0 ? this.b[iC + iC + 1] : obj2;
    }

    public final void h(int i) {
        int i2 = this.d;
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i);
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.b, i + i);
            objArrCopyOf.getClass();
            this.b = objArrCopyOf;
        }
        if (this.d != i2) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public int hashCode() {
        int[] iArr = this.a;
        java.lang.Object[] objArr = this.b;
        int i = this.d;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            java.lang.Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i(defpackage.aba abaVar) {
        int i = abaVar.d;
        h(this.d + i);
        if (this.d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(abaVar.d(i2), abaVar.g(i2));
            }
        } else if (i > 0) {
            int[] iArr = abaVar.a;
            int[] iArr2 = this.a;
            iArr.getClass();
            iArr2.getClass();
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
            java.lang.Object[] objArr = abaVar.b;
            java.lang.Object[] objArr2 = this.b;
            objArr.getClass();
            objArr2.getClass();
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, i + i);
            this.d = i;
        }
    }

    public final boolean isEmpty() {
        return this.d <= 0;
    }

    public V put(K k, V v) {
        int i = this.d;
        int iHashCode = k != null ? k.hashCode() : 0;
        int iA = k != null ? a(k, iHashCode) : j();
        if (iA >= 0) {
            int i2 = iA + iA + 1;
            java.lang.Object[] objArr = this.b;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~iA;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i4);
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.b, i4 + i4);
            objArrCopyOf.getClass();
            this.b = objArrCopyOf;
            if (i != this.d) {
                throw new java.util.ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            iArr2.getClass();
            iArr2.getClass();
            java.lang.System.arraycopy(iArr2, i3, iArr2, i5, i - i3);
            java.lang.Object[] objArr2 = this.b;
            int i6 = this.d;
            objArr2.getClass();
            objArr2.getClass();
            int i7 = i3 + i3;
            java.lang.System.arraycopy(objArr2, i7, objArr2, i5 + i5, (i6 + i6) - i7);
        }
        int i8 = this.d;
        if (i == i8) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                java.lang.Object[] objArr3 = this.b;
                int i9 = i3 + i3;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.d = i8 + 1;
                return null;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        V v = get(obj);
        return v == null ? put(obj, obj2) : v;
    }

    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int iC = c(obj);
        if (iC < 0 || !defpackage.afga.f(obj2, g(iC))) {
            return false;
        }
        e(iC);
        return true;
    }

    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int iC = c(obj);
        if (iC < 0 || !defpackage.afga.f(obj2, g(iC))) {
            return false;
        }
        f(iC, obj3);
        return true;
    }

    public final int size() {
        return this.d;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            java.lang.Object objD = d(i2);
            if (objD != sb) {
                sb.append(objD);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            java.lang.Object objG = g(i2);
            if (objG != sb) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public aba() {
        throw null;
    }

    public final V remove(K k) {
        int iC = c(k);
        if (iC >= 0) {
            return (V) e(iC);
        }
        return null;
    }

    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        int iC = c(obj);
        if (iC >= 0) {
            return f(iC, obj2);
        }
        return null;
    }
}
