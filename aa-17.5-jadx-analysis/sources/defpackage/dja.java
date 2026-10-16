package defpackage;

/* loaded from: classes.dex */
public final class dja {
    public int a;
    public int b;
    public int c;
    public int d;
    private final djo e;

    public dja(deu deuVar, long j) {
        this.e = new djo(deuVar.b);
        long j2 = dfv.a;
        long j3 = 4294967295L & j;
        int i = (int) (j >> 32);
        int i2 = (int) j3;
        this.a = Math.min(i, i2);
        this.b = Math.max(i, i2);
        this.c = -1;
        this.d = -1;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        if (iMin < 0 || iMin > deuVar.a()) {
            throw new IndexOutOfBoundsException("start (" + iMin + ") offset is outside of text region " + deuVar.a());
        }
        if (iMax >= 0 && iMax <= deuVar.a()) {
            if (iMin > iMax) {
                throw new IllegalArgumentException(a.bo(iMax, iMin, "Do not set reversed range: ", " > "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("end (" + iMax + ") offset is outside of text region " + deuVar.a());
    }

    private final void l(int i) {
        if (i < 0) {
            dka.c(a.bp(i, "Cannot set selectionEnd to a negative value: "));
        }
        this.b = i;
    }

    private final void m(int i) {
        if (i < 0) {
            dka.c(a.bp(i, "Cannot set selectionStart to a negative value: "));
        }
        this.a = i;
    }

    public final char a(int i) {
        djo djoVar = this.e;
        djc djcVar = djoVar.b;
        if (djcVar == null) {
            return djoVar.a.charAt(i);
        }
        int i2 = djoVar.c;
        if (i < i2) {
            return djoVar.a.charAt(i);
        }
        int iB = djcVar.b();
        if (i >= iB + i2) {
            return djoVar.a.charAt(i - ((iB - djoVar.d) + i2));
        }
        int i3 = i - i2;
        int i4 = djcVar.c;
        if (i3 < i4) {
            return djcVar.b[i3];
        }
        return djcVar.b[(i3 - i4) + djcVar.d];
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
        long jT = czz.t(this.a, this.b);
        long j = dfv.a;
        return jT;
    }

    public final dfv e() {
        if (k()) {
            return new dfv(czz.t(this.c, this.d));
        }
        return null;
    }

    public final void f() {
        this.c = -1;
        this.d = -1;
    }

    public final void g(int i, int i2) {
        long jT = czz.t(i, i2);
        long j = dfv.a;
        this.e.b(i, i2, "");
        long jR = dap.r(czz.t(this.a, this.b), jT);
        int i3 = (int) (jR >> 32);
        int i4 = (int) (jR & 4294967295L);
        m(Math.min(i3, i4));
        l(Math.max(i3, i4));
        if (k()) {
            long jR2 = dap.r(czz.t(this.c, this.d), jT);
            if (dfv.i(jR2)) {
                f();
                return;
            }
            int i5 = (int) (jR2 >> 32);
            int i6 = (int) (jR2 & 4294967295L);
            this.c = Math.min(i5, i6);
            this.d = Math.max(i5, i6);
        }
    }

    public final void h(int i, int i2, String str) {
        if (i >= 0) {
            djo djoVar = this.e;
            if (i <= djoVar.a()) {
                if (i2 < 0 || i2 > djoVar.a()) {
                    throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + djoVar.a());
                }
                if (i > i2) {
                    throw new IllegalArgumentException(a.bo(i2, i, "Do not set reversed range: ", " > "));
                }
                djoVar.b(i, i2, str);
                m(str.length() + i);
                l(i + str.length());
                this.c = -1;
                this.d = -1;
                return;
            }
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.e.a());
    }

    public final void i(int i, int i2) {
        if (i >= 0) {
            djo djoVar = this.e;
            if (i <= djoVar.a()) {
                if (i2 >= 0 && i2 <= djoVar.a()) {
                    if (i >= i2) {
                        throw new IllegalArgumentException(a.bo(i2, i, "Do not set reversed or empty range: ", " > "));
                    }
                    this.c = i;
                    this.d = i2;
                    return;
                }
                throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + djoVar.a());
            }
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.e.a());
    }

    public final void j(int i, int i2) {
        if (i >= 0) {
            djo djoVar = this.e;
            if (i <= djoVar.a()) {
                if (i2 >= 0 && i2 <= djoVar.a()) {
                    if (i > i2) {
                        throw new IllegalArgumentException(a.bo(i2, i, "Do not set reversed range: ", " > "));
                    }
                    m(i);
                    l(i2);
                    return;
                }
                throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + djoVar.a());
            }
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.e.a());
    }

    public final boolean k() {
        return this.c != -1;
    }

    public final String toString() {
        return this.e.toString();
    }
}
