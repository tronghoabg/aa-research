package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class elk extends defpackage.elm {
    @Override // defpackage.elm
    public final double a(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(k(obj, j));
    }

    @Override // defpackage.elm
    public final float b(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(j(obj, j));
    }

    @Override // defpackage.elm
    public final void c(java.lang.Object obj, long j, boolean z) {
        if (defpackage.eln.d) {
            defpackage.eln.l(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            defpackage.eln.m(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.elm
    public final void d(java.lang.Object obj, long j, byte b) {
        if (defpackage.eln.d) {
            defpackage.eln.l(obj, j, b);
        } else {
            defpackage.eln.m(obj, j, b);
        }
    }

    @Override // defpackage.elm
    public final void e(java.lang.Object obj, long j, double d) {
        m(obj, j, java.lang.Double.doubleToLongBits(d));
    }

    @Override // defpackage.elm
    public final void f(java.lang.Object obj, long j, float f) {
        l(obj, j, java.lang.Float.floatToIntBits(f));
    }

    @Override // defpackage.elm
    public final boolean g(java.lang.Object obj, long j) {
        return defpackage.eln.d ? defpackage.eln.u(obj, j) : defpackage.eln.v(obj, j);
    }

    @Override // defpackage.elm
    public final boolean h() {
        return false;
    }
}
