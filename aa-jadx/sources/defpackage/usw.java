package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class usw {
    final int[] a;
    final int[] b;
    final float[] c;
    final defpackage.usy d;
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
    final defpackage.usz o;

    public usw(defpackage.usz uszVar, int i, int i2, float[] fArr, int[] iArr, int[] iArr2, float[] fArr2) {
        this.o = uszVar;
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
            this.d = defpackage.uta.d(fArr);
        }
        this.m = 1 == (i & 1);
        this.n = uszVar.a() / 2;
        if (uszVar.e(0, uszVar.a() - 2) && uszVar.e(1, uszVar.a() - 1)) {
            z = true;
        }
        this.h = z;
    }
}
