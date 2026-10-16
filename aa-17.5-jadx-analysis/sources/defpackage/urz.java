package defpackage;

/* loaded from: classes3.dex */
final class urz {
    final int[] a;
    final int[] b;
    final float[] c;
    final usc d;
    final boolean e;
    final int f;
    final int g;
    final boolean h;
    int i;
    int j;
    int k;
    boolean l;
    final boolean m;
    final int n;
    final usd o;

    public urz(usd usdVar, int i, int i2, float[] fArr, int[] iArr, int[] iArr2, float[] fArr2) {
        this.o = usdVar;
        this.f = i2;
        this.a = iArr;
        this.b = iArr2;
        this.c = fArr2;
        boolean z = false;
        this.e = (i & 64) != 0;
        this.g = (i2 << 8) & 65280;
        if (fArr == null) {
            this.d = null;
        } else {
            this.d = use.d(fArr);
        }
        this.m = 1 == (i & 1);
        this.n = usdVar.a() / 2;
        if (usdVar.e(0, usdVar.a() - 2) && usdVar.e(1, usdVar.a() - 1)) {
            z = true;
        }
        this.h = z;
    }
}
