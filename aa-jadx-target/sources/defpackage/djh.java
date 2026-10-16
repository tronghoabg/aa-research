package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class djh {
    public int a;
    public int b;
    public int c;
    public int d;
    private final defpackage.djw e;

    public djh(defpackage.dfb dfbVar, long j) {
        this.e = new defpackage.djw(dfbVar.b);
        long j2 = defpackage.dgc.a;
        long j3 = 4294967295L & j;
        int i = (int) (j >> 32);
        int i2 = (int) j3;
        this.a = java.lang.Math.min(i, i2);
        this.b = java.lang.Math.max(i, i2);
        this.c = -1;
        this.d = -1;
        int iMin = java.lang.Math.min(i, i2);
        int iMax = java.lang.Math.max(i, i2);
        if (iMin < 0 || iMin > dfbVar.a()) {
            throw new java.lang.IndexOutOfBoundsException("start (" + iMin + ") offset is outside of text region " + dfbVar.a());
        }
        if (iMax >= 0 && iMax <= dfbVar.a()) {
            if (iMin > iMax) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bn(iMax, iMin, "Do not set reversed range: ", " > "));
            }
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("end (" + iMax + ") offset is outside of text region " + dfbVar.a());
    }

    private final void l(int i) {
        if (i < 0) {
            defpackage.dki.c(defpackage.a.bo(i, "Cannot set selectionEnd to a negative value: "));
        }
        this.b = i;
    }

    private final void m(int i) {
        if (i < 0) {
            defpackage.dki.c(defpackage.a.bo(i, "Cannot set selectionStart to a negative value: "));
        }
        this.a = i;
    }

    public final char a(int i) {
        defpackage.djw djwVar = this.e;
        defpackage.djj djjVar = djwVar.b;
        if (djjVar == null) {
            return djwVar.a.charAt(i);
        }
        int i2 = djwVar.c;
        if (i < i2) {
            return djwVar.a.charAt(i);
        }
        int iB = djjVar.b();
        if (i >= iB + i2) {
            return djwVar.a.charAt(i - ((iB - djwVar.d) + i2));
        }
        int i3 = i - i2;
        int i4 = djjVar.c;
        if (i3 < i4) {
            return djjVar.b[i3];
        }
        return djjVar.b[(i3 - i4) + djjVar.d];
    }

    public final int b() {
        int i = this.a;
        int i2 = this.b;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final int c() {
        return this.e.a();
    }

    public final long d() {
        long jG = defpackage.dax.g(this.a, this.b);
        long j = defpackage.dgc.a;
        return jG;
    }

    public final defpackage.dgc e() {
        if (k()) {
            return new defpackage.dgc(defpackage.dax.g(this.c, this.d));
        }
        return null;
    }

    public final void f() {
        this.c = -1;
        this.d = -1;
    }

    public final void g(int i, int i2) {
        long jG = defpackage.dax.g(i, i2);
        long j = defpackage.dgc.a;
        this.e.b(i, i2, "");
        long jP = defpackage.day.p(defpackage.dax.g(this.a, this.b), jG);
        int i3 = (int) (jP >> 32);
        int i4 = (int) (jP & 4294967295L);
        m(java.lang.Math.min(i3, i4));
        l(java.lang.Math.max(i3, i4));
        if (k()) {
            long jP2 = defpackage.day.p(defpackage.dax.g(this.c, this.d), jG);
            if (defpackage.dgc.i(jP2)) {
                f();
                return;
            }
            int i5 = (int) (jP2 >> 32);
            int i6 = (int) (jP2 & 4294967295L);
            this.c = java.lang.Math.min(i5, i6);
            this.d = java.lang.Math.max(i5, i6);
        }
    }

    public final void h(int i, int i2, java.lang.String str) {
        if (i >= 0) {
            defpackage.djw djwVar = this.e;
            if (i <= djwVar.a()) {
                if (i2 < 0 || i2 > djwVar.a()) {
                    throw new java.lang.IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + djwVar.a());
                }
                if (i > i2) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bn(i2, i, "Do not set reversed range: ", " > "));
                }
                djwVar.b(i, i2, str);
                m(str.length() + i);
                l(i + str.length());
                this.c = -1;
                this.d = -1;
                return;
            }
        }
        throw new java.lang.IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.e.a());
    }

    public final void i(int i, int i2) {
        if (i >= 0) {
            defpackage.djw djwVar = this.e;
            if (i <= djwVar.a()) {
                if (i2 >= 0 && i2 <= djwVar.a()) {
                    if (i >= i2) {
                        throw new java.lang.IllegalArgumentException(defpackage.a.bn(i2, i, "Do not set reversed or empty range: ", " > "));
                    }
                    this.c = i;
                    this.d = i2;
                    return;
                }
                throw new java.lang.IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + djwVar.a());
            }
        }
        throw new java.lang.IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.e.a());
    }

    public final void j(int i, int i2) {
        if (i >= 0) {
            defpackage.djw djwVar = this.e;
            if (i <= djwVar.a()) {
                if (i2 >= 0 && i2 <= djwVar.a()) {
                    if (i > i2) {
                        throw new java.lang.IllegalArgumentException(defpackage.a.bn(i2, i, "Do not set reversed range: ", " > "));
                    }
                    m(i);
                    l(i2);
                    return;
                }
                throw new java.lang.IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + djwVar.a());
            }
        }
        throw new java.lang.IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.e.a());
    }

    public final boolean k() {
        return this.c != -1;
    }

    public final java.lang.String toString() {
        return this.e.toString();
    }
}
