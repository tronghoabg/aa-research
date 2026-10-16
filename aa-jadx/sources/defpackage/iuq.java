package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iuq {
    public int a;
    public int b;
    public int c;
    public float d;
    public int e;
    public float f;
    public android.util.Size g;
    public android.graphics.Rect h;
    public android.graphics.Rect i;
    public java.util.List j;
    public com.google.android.gms.car.display.CarDisplayUiFeatures k;
    public com.google.android.gms.car.display.CarDisplayBlendedUiConfig l;
    public int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;

    public final defpackage.ive a() {
        return new defpackage.ive(this.a, this.n, this.o, this.b, this.p, this.q, this.r, this.s, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (~this.m) & 262143);
    }

    public final void b(int i) {
        this.o = i;
        this.m |= 4;
    }

    public final void c(int i) {
        this.n = i;
        this.m |= 2;
    }

    public final void d(int i) {
        this.q = i;
        this.m |= 32;
    }

    public final void e(int i) {
        this.r = i;
        this.m |= 64;
    }

    public final void f(int i) {
        this.s = i;
        this.m |= 128;
    }

    public final void g(int i) {
        this.p = i;
        this.m |= 16;
    }
}
