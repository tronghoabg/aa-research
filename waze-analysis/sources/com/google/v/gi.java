package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class gi extends gj {
    @Override // com.google.v.gj
    public final double a(Object obj, long j2) {
        return Double.longBitsToDouble(h(obj, j2));
    }

    @Override // com.google.v.gj
    public final float b(Object obj, long j2) {
        return Float.intBitsToFloat(g(obj, j2));
    }

    @Override // com.google.v.gj
    public final void c(Object obj, long j2, boolean z) {
        if (gk.f13004a) {
            gk.i(obj, j2, z);
        } else {
            gk.j(obj, j2, z);
        }
    }

    @Override // com.google.v.gj
    public final void d(Object obj, long j2, double d2) {
        j(obj, j2, Double.doubleToLongBits(d2));
    }

    @Override // com.google.v.gj
    public final void e(Object obj, long j2, float f2) {
        i(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // com.google.v.gj
    public final boolean f(Object obj, long j2) {
        return gk.f13004a ? gk.q(obj, j2) : gk.r(obj, j2);
    }
}
