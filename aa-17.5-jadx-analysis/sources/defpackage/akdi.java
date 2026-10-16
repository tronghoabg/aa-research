package defpackage;

import org.jni_zero.JniZero;

/* loaded from: classes2.dex */
final class akdi extends aked {
    private final akdc a;

    public akdi(akdc akdcVar) {
        super(akch.k, 31556952000L);
        this.a = akdcVar;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int a(long j) {
        return this.a.X(j);
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
        return i == 0 ? j : h(j, a(j) + i);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long g(long j) {
        akdc akdcVar = this.a;
        long jG = akdcVar.l.g(j);
        return akdcVar.U(jG) > 1 ? jG - ((r4 - 1) * 604800000) : jG;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long h(long j, int i) {
        JniZero.c(this, Math.abs(i), -292275054, 292278993);
        int iA = a(j);
        if (iA == i) {
            return j;
        }
        akdc akdcVar = this.a;
        int iO = akdcVar.O(j);
        int iW = akdcVar.W(iA);
        int iW2 = akdcVar.W(i);
        if (iW2 < iW) {
            iW = iW2;
        }
        int iU = akdcVar.U(j);
        if (iU <= iW) {
            iW = iU;
        }
        long jAe = akdcVar.ae(j, i);
        int iA2 = a(jAe);
        if (iA2 < i) {
            jAe += 604800000;
        } else if (iA2 > i) {
            jAe -= 604800000;
        }
        return akdcVar.j.h(jAe + ((iW - akdcVar.U(jAe)) * 604800000), iO);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final akcm r() {
        return this.a.d;
    }

    @Override // defpackage.akcf
    public final akcm s() {
        return null;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final boolean t(long j) {
        akdc akdcVar = this.a;
        return akdcVar.W(akdcVar.X(j)) > 52;
    }

    @Override // defpackage.aked
    public final long x(long j, long j2) {
        return e(j, JniZero.a(j2));
    }

    @Override // defpackage.akcf
    public final void v() {
    }
}
