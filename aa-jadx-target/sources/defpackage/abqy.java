package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abqy {
    public static final defpackage.abqy a = new defpackage.abqy(0, new int[0], new java.lang.Object[0], false);
    public int b;
    public int[] c;
    public java.lang.Object[] d;
    public int e;
    private boolean f;

    public abqy(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final int a() {
        int iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = this.c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((java.lang.Long) this.d[i3]).longValue();
                    iNumberOfLeadingZeros3 = ((352 - (java.lang.Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    defpackage.abnv abnvVar = (defpackage.abnv) this.d[i3];
                    int iNumberOfLeadingZeros4 = java.lang.Integer.numberOfLeadingZeros(i7) * 9;
                    int iD = abnvVar.d();
                    iNumberOfLeadingZeros3 = ((352 - iNumberOfLeadingZeros4) >>> 6) + ((352 - (java.lang.Integer.numberOfLeadingZeros(iD) * 9)) >>> 6) + iD;
                } else if (i6 == 3) {
                    int iNumberOfLeadingZeros5 = java.lang.Integer.numberOfLeadingZeros(i5 << 3) * 9;
                    iNumberOfLeadingZeros2 = ((defpackage.abqy) this.d[i3]).a();
                    int i8 = (352 - iNumberOfLeadingZeros5) >>> 6;
                    iNumberOfLeadingZeros = i8 + i8;
                } else {
                    if (i6 != 5) {
                        throw new java.lang.IllegalStateException(new defpackage.abpo());
                    }
                    ((java.lang.Integer) this.d[i3]).intValue();
                    iNumberOfLeadingZeros3 = ((352 - (java.lang.Integer.numberOfLeadingZeros(i5 << 3) * 9)) >>> 6) + 4;
                }
                i2 += iNumberOfLeadingZeros3;
            } else {
                int i9 = i5 << 3;
                long jLongValue = ((java.lang.Long) this.d[i3]).longValue();
                iNumberOfLeadingZeros = (352 - (java.lang.Integer.numberOfLeadingZeros(i9) * 9)) >>> 6;
                iNumberOfLeadingZeros2 = (640 - (java.lang.Long.numberOfLeadingZeros(jLongValue) * 9)) >>> 6;
            }
            iNumberOfLeadingZeros3 = iNumberOfLeadingZeros + iNumberOfLeadingZeros2;
            i2 += iNumberOfLeadingZeros3;
        }
        this.e = i2;
        return i2;
    }

    final void b() {
        if (!this.f) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void c(int i) {
        int[] iArr = this.c;
        if (i > iArr.length) {
            int i2 = this.b;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.c = java.util.Arrays.copyOf(iArr, i);
            this.d = java.util.Arrays.copyOf(this.d, i);
        }
    }

    public final void d() {
        if (this.f) {
            this.f = false;
        }
    }

    final void e(int i, java.lang.Object obj) {
        b();
        c(this.b + 1);
        int[] iArr = this.c;
        int i2 = this.b;
        iArr[i2] = i;
        this.d[i2] = obj;
        this.b = i2 + 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.abqy)) {
            return false;
        }
        defpackage.abqy abqyVar = (defpackage.abqy) obj;
        int i = this.b;
        if (i == abqyVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = abqyVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            java.lang.Object[] objArr = this.d;
            java.lang.Object[] objArr2 = abqyVar.d;
            int i3 = this.b;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(defpackage.kwv kwvVar) throws java.io.IOException {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                java.lang.Object obj = this.d[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    kwvVar.n(i3, ((java.lang.Long) obj).longValue());
                } else if (i4 == 1) {
                    kwvVar.j(i3, ((java.lang.Long) obj).longValue());
                } else if (i4 == 2) {
                    kwvVar.f(i3, (defpackage.abnv) obj);
                } else if (i4 == 3) {
                    defpackage.abof abofVar = (defpackage.abof) kwvVar.a;
                    abofVar.t(i3, 3);
                    ((defpackage.abqy) obj).f(kwvVar);
                    abofVar.t(i3, 4);
                } else {
                    if (i4 != 5) {
                        throw new java.lang.RuntimeException(new defpackage.abpo());
                    }
                    kwvVar.i(i3, ((java.lang.Integer) obj).intValue());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = i + 527;
        int[] iArr = this.c;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        java.lang.Object[] objArr = this.d;
        int i6 = this.b;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public abqy() {
        this(0, new int[8], new java.lang.Object[8], true);
    }
}
