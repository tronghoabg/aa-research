package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class abrb extends defpackage.abrc {
    @Override // defpackage.abrc
    public final double a(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(h(obj, j));
    }

    @Override // defpackage.abrc
    public final float b(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(g(obj, j));
    }

    @Override // defpackage.abrc
    public final void c(java.lang.Object obj, long j, boolean z) {
        if (defpackage.abrd.b) {
            defpackage.abrd.i(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            defpackage.abrd.j(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.abrc
    public final void d(java.lang.Object obj, long j, double d) {
        k(obj, j, java.lang.Double.doubleToLongBits(d));
    }

    @Override // defpackage.abrc
    public final void e(java.lang.Object obj, long j, float f) {
        j(obj, j, java.lang.Float.floatToIntBits(f));
    }

    @Override // defpackage.abrc
    public final boolean f(java.lang.Object obj, long j) {
        if (defpackage.abrd.b) {
            return defpackage.abrd.n(obj, j);
        }
        return defpackage.abrd.a(obj, j) != 0;
    }
}
