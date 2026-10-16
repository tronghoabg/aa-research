package b.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p extends a {
    @Override // b.a.a.a
    final long a() {
        return Float.floatToRawIntBits(Float.NaN);
    }

    @Override // b.a.a.a
    final long b() {
        return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
    }

    @Override // b.a.a.a
    final long d() {
        return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
    }

    @Override // b.a.a.a
    final long e(char[] cArr, int i2, int i3, boolean z, long j2, int i4, boolean z2, int i5) throws NumberFormatException {
        float fA = f.a(z, j2, i4, z2, i5);
        if (Float.isNaN(fA)) {
            fA = Float.parseFloat(new String(cArr, i2, i3 - i2));
        }
        return Float.floatToRawIntBits(fA);
    }

    @Override // b.a.a.a
    final long f(char[] cArr, int i2, int i3, boolean z, long j2, int i4, boolean z2, int i5) throws NumberFormatException {
        float fC = f.c(z, j2, i4, z2, i5);
        if (Float.isNaN(fC)) {
            fC = Float.parseFloat(new String(cArr, i2, i3 - i2));
        }
        return Float.floatToRawIntBits(fC);
    }
}
