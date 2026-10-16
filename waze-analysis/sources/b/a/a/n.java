package b.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n extends b {
    @Override // b.a.a.b
    final long a() {
        return Double.doubleToRawLongBits(Double.NaN);
    }

    @Override // b.a.a.b
    final long b() {
        return Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
    }

    @Override // b.a.a.b
    final long c() {
        return Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
    }

    @Override // b.a.a.b
    final long e(CharSequence charSequence, int i2, boolean z, long j2, int i3, boolean z2, int i4) throws NumberFormatException {
        double dB = e.b(z, j2, i3, z2, i4);
        if (Double.isNaN(dB)) {
            dB = Double.parseDouble(charSequence.subSequence(0, i2).toString());
        }
        return Double.doubleToRawLongBits(dB);
    }

    @Override // b.a.a.b
    final long f(CharSequence charSequence, int i2, boolean z, long j2, int i3, boolean z2, int i4) throws NumberFormatException {
        double d2 = e.d(z, j2, i3, z2, i4);
        if (Double.isNaN(d2)) {
            d2 = Double.parseDouble(charSequence.subSequence(0, i2).toString());
        }
        return Double.doubleToRawLongBits(d2);
    }
}
