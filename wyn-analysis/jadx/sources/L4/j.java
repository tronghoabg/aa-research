package L4;

/* loaded from: classes.dex */
public final class j extends k {
    @Override // L4.k
    public final int a(int i5, int i10, int i11, int i12) {
        return k.f6906d ? 2 : 1;
    }

    @Override // L4.k
    public final float b(int i5, int i10, int i11, int i12) {
        if (k.f6906d) {
            return Math.min(i11 / i5, i12 / i10);
        }
        if (Math.max(i10 / i12, i5 / i11) == 0) {
            return 1.0f;
        }
        return 1.0f / Integer.highestOneBit(r2);
    }
}
