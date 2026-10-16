package defpackage;

/* loaded from: classes3.dex */
final class abpy extends abqa {
    @Override // defpackage.abqa
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(h(obj, j));
    }

    @Override // defpackage.abqa
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(g(obj, j));
    }

    @Override // defpackage.abqa
    public final void c(Object obj, long j, boolean z) {
        if (abqb.b) {
            abqb.i(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            abqb.j(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.abqa
    public final void d(Object obj, long j, double d) {
        k(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.abqa
    public final void e(Object obj, long j, float f) {
        j(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.abqa
    public final boolean f(Object obj, long j) {
        return !abqb.b ? abqb.a(obj, j) != 0 : abqb.n(obj, j);
    }
}
