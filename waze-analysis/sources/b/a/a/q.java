package b.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class q extends b {
    @Override // b.a.a.b
    final long a() {
        return Float.floatToRawIntBits(Float.NaN);
    }

    @Override // b.a.a.b
    final long b() {
        return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
    }

    @Override // b.a.a.b
    final long c() {
        return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
    }

    @Override // b.a.a.b
    final long e(CharSequence charSequence, int i2, boolean z, long j2, int i3, boolean z2, int i4) throws NumberFormatException {
        float fA = f.a(z, j2, i3, z2, i4);
        if (Float.isNaN(fA)) {
            fA = Float.parseFloat(charSequence.subSequence(0, i2).toString());
        }
        return Float.floatToRawIntBits(fA);
    }

    @Override // b.a.a.b
    final long f(CharSequence charSequence, int i2, boolean z, long j2, int i3, boolean z2, int i4) throws NumberFormatException {
        float fC = f.c(z, j2, i3, z2, i4);
        if (Float.isNaN(fC)) {
            fC = Float.parseFloat(charSequence.subSequence(0, i2).toString());
        }
        return Float.floatToRawIntBits(fC);
    }
}
