package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class iba extends defpackage.ibf {
    @Override // defpackage.ibf
    public final float a(int i, int i2, int i3, int i4) {
        return java.lang.Math.min(1.0f, b.a(i, i2, i3, i4));
    }

    @Override // defpackage.ibf
    public final int b(int i, int i2, int i3, int i4) {
        if (a(i, i2, i3, i4) == 1.0f) {
            return 2;
        }
        return b.b(i, i2, i3, i4);
    }
}
