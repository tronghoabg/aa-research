package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ysw extends java.util.AbstractMap {
    public static final java.util.Comparator a = new defpackage.azq(12);
    public final java.lang.Object[] b;
    public final int[] c;
    public final java.util.Set d;
    private java.lang.Integer e;
    private java.lang.String f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, ysw] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ysw] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public ysw(defpackage.ysw yswVar, defpackage.ysw yswVar2) {
        int i;
        java.lang.Object objC;
        java.lang.Object[] objArr;
        ?? abstractMap = new java.util.AbstractMap();
        abstractMap.d = new defpackage.ysv(abstractMap, -1);
        abstractMap.e = null;
        abstractMap.f = null;
        int size = yswVar.size() + yswVar2.size();
        int iB = yswVar.b() + yswVar2.b();
        int i2 = size + 1;
        java.lang.Object[] objArr2 = new java.lang.Object[iB];
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = size;
        java.util.Map.Entry entryC = yswVar.c(0);
        java.util.Map.Entry entryC2 = yswVar2.c(0);
        int i4 = 0;
        int i5 = 0;
        int iA = size;
        java.util.Map.Entry entryC3 = entryC;
        int i6 = 0;
        while (true) {
            int i7 = 1;
            if (entryC3 == null && entryC2 == null) {
                break;
            }
            i6++;
            if (entryC3 != null) {
                if (entryC2 != null) {
                    int iCompareTo = ((java.lang.String) entryC3.getKey()).compareTo((java.lang.String) entryC2.getKey());
                    if (iCompareTo == 0) {
                        int i8 = i4 + 1;
                        int i9 = i5 + 1;
                        objArr2[i6] = abstractMap.d((java.lang.String) entryC3.getKey(), i6);
                        defpackage.ysv ysvVar = (defpackage.ysv) entryC3.getValue();
                        defpackage.ysv ysvVar2 = (defpackage.ysv) entryC2.getValue();
                        int i10 = 0;
                        int i11 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            if (i10 >= ysvVar.size() && i11 >= ysvVar2.size()) {
                                break;
                            }
                            int iCompare = i10 == ysvVar.size() ? i7 : i11 == ysvVar2.size() ? -1 : 0;
                            iCompare = iCompare == 0 ? defpackage.ysy.a.compare(ysvVar.c(i10), ysvVar2.c(i11)) : iCompare;
                            if (iCompare < 0) {
                                i = i10 + 1;
                                objC = ysvVar.c(i10);
                            } else {
                                int i12 = i11 + 1;
                                java.lang.Object objC2 = ysvVar2.c(i11);
                                i11 = i12;
                                i = iCompare == 0 ? i10 + 1 : i10;
                                objC = objC2;
                            }
                            objArr2[iA] = objC;
                            i10 = i;
                            iA++;
                            i7 = 1;
                            abstractMap = this;
                        }
                        iArr[i6] = iA;
                        entryC3 = yswVar.c(i8);
                        entryC2 = yswVar2.c(i9);
                        i5 = i9;
                        i4 = i8;
                        i3 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i3 = 0;
                        abstractMap = this;
                    }
                }
                i4++;
                iA = a(entryC3, i6, iA, objArr2, iArr);
                entryC3 = yswVar.c(i4);
                i3 = 0;
                abstractMap = this;
            }
            java.util.Map.Entry entry = entryC3;
            i5++;
            int iA2 = a(entryC2, i6, iA, objArr2, iArr);
            entryC2 = yswVar2.c(i5);
            iA = iA2;
            entryC3 = entry;
            i3 = 0;
            abstractMap = this;
        }
        int i13 = iArr[i3];
        int i14 = i13 - i6;
        if (i14 != 0) {
            for (int i15 = i3; i15 <= i6; i15++) {
                iArr[i15] = iArr[i15] - i14;
            }
            int i16 = iArr[i6];
            int i17 = i16 - i6;
            if (e(iB, i16)) {
                objArr = new java.lang.Object[i16];
                java.lang.System.arraycopy(objArr2, i3, objArr, i3, i6);
            } else {
                objArr = objArr2;
            }
            java.lang.System.arraycopy(objArr2, i13, objArr, i6, i17);
            objArr2 = objArr;
        }
        abstractMap.b = objArr2;
        int i18 = iArr[i3] + 1;
        abstractMap.c = e(i2, i18) ? java.util.Arrays.copyOf(iArr, i18) : iArr;
    }

    private final int a(java.util.Map.Entry entry, int i, int i2, java.lang.Object[] objArr, int[] iArr) {
        defpackage.ysv ysvVar = (defpackage.ysv) entry.getValue();
        int iA = ysvVar.a() - ysvVar.b();
        java.lang.System.arraycopy(ysvVar.b.b, ysvVar.b(), objArr, i2, iA);
        objArr[i] = d((java.lang.String) entry.getKey(), i);
        int i3 = i2 + iA;
        iArr[i + 1] = i3;
        return i3;
    }

    private final int b() {
        return this.c[size()];
    }

    private final java.util.Map.Entry c(int i) {
        if (i < this.c[0]) {
            return (java.util.Map.Entry) this.b[i];
        }
        return null;
    }

    private final java.util.Map.Entry d(java.lang.String str, int i) {
        return new java.util.AbstractMap.SimpleImmutableEntry(str, new defpackage.ysv(this, i));
    }

    private static boolean e(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<java.lang.String, java.util.Set<java.lang.Object>>> entrySet() {
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        java.lang.Integer numValueOf = this.e;
        if (numValueOf == null) {
            numValueOf = java.lang.Integer.valueOf(super.hashCode());
            this.e = numValueOf;
        }
        return numValueOf.intValue();
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
        java.lang.String str = this.f;
        if (str != null) {
            return str;
        }
        java.lang.String string = super.toString();
        this.f = string;
        return string;
    }

    public ysw(java.util.List list) {
        this.d = new defpackage.ysv(this, -1);
        this.e = null;
        this.f = null;
        java.util.Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            java.lang.Object[] objArr = new java.lang.Object[size];
            java.util.Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.b = e(size, 0) ? java.util.Arrays.copyOf(objArr, 0) : objArr;
                this.c = iArr;
                return;
            }
            java.lang.Object obj = ((odn) it2.next()).a;
            throw null;
        }
        java.lang.Object obj2 = ((odn) it.next()).a;
        throw null;
    }
}
