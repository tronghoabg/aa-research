package defpackage;

/* loaded from: classes2.dex */
final class elb extends ele {
    @Override // defpackage.ele
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(k(obj, j));
    }

    @Override // defpackage.ele
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(j(obj, j));
    }

    @Override // defpackage.ele
    public final void c(Object obj, long j, boolean z) {
        if (elf.d) {
            elf.l(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            elf.m(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.ele
    public final void d(Object obj, long j, byte b) {
        if (elf.d) {
            elf.l(obj, j, b);
        } else {
            elf.m(obj, j, b);
        }
    }

    @Override // defpackage.ele
    public final void e(Object obj, long j, double d) {
        m(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.ele
    public final void f(Object obj, long j, float f) {
        l(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.ele
    public final boolean g(Object obj, long j) {
        return elf.d ? elf.u(obj, j) : elf.v(obj, j);
    }

    @Override // defpackage.ele
    public final boolean h() {
        return false;
    }
}
