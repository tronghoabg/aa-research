package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class akeg extends defpackage.akfd {
    private final defpackage.akec a;
    private final int c;
    private final int d;

    public akeg(defpackage.akec akecVar) {
        super(defpackage.akdh.h, 2629746000L);
        this.a = akecVar;
        this.c = 12;
        this.d = 2;
    }

    @Override // defpackage.akex, defpackage.akdf
    public final int a(long j) {
        defpackage.akec akecVar = this.a;
        return akecVar.T(j, akecVar.Y(j));
    }

    @Override // defpackage.akex, defpackage.akdf
    public final int c() {
        return this.c;
    }

    @Override // defpackage.akdf
    public final int d() {
        return 1;
    }

    @Override // defpackage.akex, defpackage.akdf
    public final long e(long j, int i) {
        int i2;
        int i3;
        int i4;
        if (i == 0) {
            return j;
        }
        defpackage.akec akecVar = this.a;
        long jS = akecVar.S(j);
        int iY = akecVar.Y(j);
        int iT = akecVar.T(j, iY);
        int i5 = iT - 1;
        int i6 = i5 + i;
        if (i6 < 0) {
            int i7 = this.c;
            int i8 = i + i7;
            if (java.lang.Math.signum(i8) == java.lang.Math.signum(i)) {
                i2 = iY - 1;
            } else {
                i8 = i - i7;
                i2 = iY + 1;
            }
            i6 = i5 + i8;
        } else {
            i2 = iY;
        }
        int i9 = this.c;
        if (i6 >= 0) {
            i3 = i2 + (i6 / i9);
            i4 = (i6 % i9) + 1;
        } else {
            i3 = i2 + (i6 / i9);
            int i10 = i3 - 1;
            int iAbs = java.lang.Math.abs(i6) % i9;
            if (iAbs == 0) {
                iAbs = i9;
            }
            i4 = (i9 - iAbs) + 1;
            if (i4 != 1) {
                i3 = i10;
            }
        }
        int iN = akecVar.N(j, iY, iT);
        int iR = akecVar.R(i3, i4);
        if (iN > iR) {
            iN = iR;
        }
        return akecVar.ad(i3, i4, iN) + jS;
    }

    @Override // defpackage.akex, defpackage.akdf
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.akex, defpackage.akdf
    public final long g(long j) {
        defpackage.akec akecVar = this.a;
        int iY = akecVar.Y(j);
        return akecVar.ac(iY) + akecVar.ab(iY, akecVar.T(j, iY));
    }

    @Override // defpackage.akex, defpackage.akdf
    public final long h(long j, int i) {
        org.jni_zero.JniZero.c(this, i, 1, this.c);
        defpackage.akec akecVar = this.a;
        int iY = akecVar.Y(j);
        int iN = akecVar.N(j, iY, akecVar.T(j, iY));
        int iR = akecVar.R(iY, i);
        if (iN > iR) {
            iN = iR;
        }
        return akecVar.ad(iY, i, iN) + ((long) akecVar.S(j));
    }

    @Override // defpackage.akex, defpackage.akdf
    public final defpackage.akdm r() {
        return this.a.c;
    }

    @Override // defpackage.akdf
    public final defpackage.akdm s() {
        return this.a.g;
    }

    @Override // defpackage.akex, defpackage.akdf
    public final boolean t(long j) {
        defpackage.akec akecVar = this.a;
        int iY = akecVar.Y(j);
        return akecVar.ag(iY) && akecVar.T(j, iY) == this.d;
    }

    @Override // defpackage.akfd
    public final long x(long j, long j2) {
        long j3;
        long j4;
        int i = (int) j2;
        if (i == j2) {
            return e(j, i);
        }
        defpackage.akec akecVar = this.a;
        long jS = akecVar.S(j);
        int iY = akecVar.Y(j);
        long j5 = iY;
        int iT = akecVar.T(j, iY);
        long j6 = ((long) (iT - 1)) + j2;
        int i2 = this.c;
        if (j6 >= 0) {
            long j7 = i2;
            j3 = j5 + (j6 / j7);
            j4 = (j6 % j7) + 1;
        } else {
            long j8 = i2;
            j3 = j5 + (j6 / j8);
            int iAbs = (int) (java.lang.Math.abs(j6) % j8);
            if (iAbs == 0) {
                iAbs = i2;
            }
            long j9 = (-1) + j3;
            long j10 = (i2 - iAbs) + 1;
            if (j10 != 1) {
                j3 = j9;
            }
            j4 = j10;
        }
        if (j3 < -292275054 || j3 > 292278993) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bM(j2, "Magnitude of add amount is too large: "));
        }
        int i3 = (int) j4;
        int iN = akecVar.N(j, iY, iT);
        int i4 = (int) j3;
        int iR = akecVar.R(i4, i3);
        if (iN > iR) {
            iN = iR;
        }
        return akecVar.ad(i4, i3, iN) + jS;
    }

    @Override // defpackage.akdf
    public final void v() {
    }
}
