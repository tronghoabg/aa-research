package defpackage;

import org.jni_zero.JniZero;

/* loaded from: classes2.dex */
class akdg extends aked {
    private final akdc a;
    private final int c;
    private final int d;

    public akdg(akdc akdcVar) {
        super(akch.h, 2629746000L);
        this.a = akdcVar;
        this.c = 12;
        this.d = 2;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int a(long j) {
        akdc akdcVar = this.a;
        return akdcVar.T(j, akdcVar.Y(j));
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int c() {
        return this.c;
    }

    @Override // defpackage.akcf
    public final int d() {
        return 1;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long e(long j, int i) {
        int i2;
        int i3;
        int i4;
        if (i == 0) {
            return j;
        }
        akdc akdcVar = this.a;
        long jS = akdcVar.S(j);
        int iY = akdcVar.Y(j);
        int iT = akdcVar.T(j, iY);
        int i5 = iT - 1;
        int i6 = i5 + i;
        if (i6 < 0) {
            int i7 = this.c;
            int i8 = i + i7;
            if (Math.signum(i8) == Math.signum(i)) {
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
            int iAbs = Math.abs(i6) % i9;
            if (iAbs == 0) {
                iAbs = i9;
            }
            i4 = (i9 - iAbs) + 1;
            if (i4 != 1) {
                i3 = i10;
            }
        }
        int iN = akdcVar.N(j, iY, iT);
        int iR = akdcVar.R(i3, i4);
        if (iN > iR) {
            iN = iR;
        }
        return akdcVar.ad(i3, i4, iN) + jS;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long g(long j) {
        akdc akdcVar = this.a;
        int iY = akdcVar.Y(j);
        return akdcVar.ac(iY) + akdcVar.ab(iY, akdcVar.T(j, iY));
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long h(long j, int i) {
        JniZero.c(this, i, 1, this.c);
        akdc akdcVar = this.a;
        int iY = akdcVar.Y(j);
        int iN = akdcVar.N(j, iY, akdcVar.T(j, iY));
        int iR = akdcVar.R(iY, i);
        if (iN > iR) {
            iN = iR;
        }
        return akdcVar.ad(iY, i, iN) + akdcVar.S(j);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final akcm r() {
        return this.a.c;
    }

    @Override // defpackage.akcf
    public final akcm s() {
        return this.a.g;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final boolean t(long j) {
        akdc akdcVar = this.a;
        int iY = akdcVar.Y(j);
        return akdcVar.ag(iY) && akdcVar.T(j, iY) == this.d;
    }

    @Override // defpackage.aked
    public final long x(long j, long j2) {
        long j3;
        long j4;
        long j5;
        int i = (int) j2;
        if (i == j2) {
            return e(j, i);
        }
        akdc akdcVar = this.a;
        long jS = akdcVar.S(j);
        int iY = akdcVar.Y(j);
        long j6 = iY;
        int iT = akdcVar.T(j, iY);
        long j7 = (iT - 1) + j2;
        int i2 = this.c;
        if (j7 >= 0) {
            j3 = jS;
            long j8 = i2;
            j4 = j6 + (j7 / j8);
            j5 = (j7 % j8) + 1;
        } else {
            j3 = jS;
            long j9 = i2;
            j4 = j6 + (j7 / j9);
            int iAbs = (int) (Math.abs(j7) % j9);
            if (iAbs == 0) {
                iAbs = i2;
            }
            long j10 = (-1) + j4;
            long j11 = (i2 - iAbs) + 1;
            if (j11 != 1) {
                j4 = j10;
            }
            j5 = j11;
        }
        if (j4 < -292275054 || j4 > 292278993) {
            throw new IllegalArgumentException(a.bN(j2, "Magnitude of add amount is too large: "));
        }
        int i3 = (int) j5;
        int iN = akdcVar.N(j, iY, iT);
        int i4 = (int) j4;
        int iR = akdcVar.R(i4, i3);
        if (iN > iR) {
            iN = iR;
        }
        return akdcVar.ad(i4, i3, iN) + j3;
    }

    @Override // defpackage.akcf
    public final void v() {
    }
}
