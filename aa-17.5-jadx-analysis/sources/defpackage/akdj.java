package defpackage;

import org.jni_zero.JniZero;

/* loaded from: classes2.dex */
final class akdj extends aked {
    protected final akdc a;

    public akdj(akdc akdcVar) {
        super(akch.f, 31556952000L);
        this.a = akdcVar;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int a(long j) {
        return this.a.Y(j);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int c() {
        return 292278993;
    }

    @Override // defpackage.akcf
    public final int d() {
        return -292275054;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long e(long j, int i) {
        if (i == 0) {
            return j;
        }
        int iA = a(j);
        int i2 = iA + i;
        if ((iA ^ i2) >= 0 || (iA ^ i) < 0) {
            return h(j, i2);
        }
        throw new ArithmeticException(a.bo(i, iA, "The calculation caused an overflow: ", " + "));
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long g(long j) {
        return this.a.ac(a(j));
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long h(long j, int i) {
        JniZero.c(this, i, -292275054, 292278993);
        return this.a.ae(j, i);
    }

    @Override // defpackage.akcf
    public final long j(long j, int i) {
        JniZero.c(this, i, -292275055, 292278994);
        return this.a.ae(j, i);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final akcm r() {
        return this.a.c;
    }

    @Override // defpackage.akcf
    public final akcm s() {
        return null;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final boolean t(long j) {
        return this.a.ag(a(j));
    }

    @Override // defpackage.aked
    public final long x(long j, long j2) {
        return e(j, JniZero.a(j2));
    }

    @Override // defpackage.akcf
    public final void v() {
    }
}
