package b.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class m extends a {
    @Override // b.a.a.a
    final long a() {
        return Double.doubleToRawLongBits(Double.NaN);
    }

    @Override // b.a.a.a
    final long b() {
        return Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
    }

    @Override // b.a.a.a
    final long d() {
        return Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
    }

    @Override // b.a.a.a
    final long e(char[] cArr, int i2, int i3, boolean z, long j2, int i4, boolean z2, int i5) throws NumberFormatException {
        double dB = e.b(z, j2, i4, z2, i5);
        if (Double.isNaN(dB)) {
            dB = Double.parseDouble(new String(cArr, i2, i3 - i2));
        }
        return Double.doubleToRawLongBits(dB);
    }

    @Override // b.a.a.a
    final long f(char[] cArr, int i2, int i3, boolean z, long j2, int i4, boolean z2, int i5) throws NumberFormatException {
        double d2 = e.d(z, j2, i4, z2, i5);
        if (Double.isNaN(d2)) {
            d2 = Double.parseDouble(new String(cArr, i2, i3 - i2));
        }
        return Double.doubleToRawLongBits(d2);
    }
}
