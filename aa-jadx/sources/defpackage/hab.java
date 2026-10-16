package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hab {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    public final void a(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.e = z;
    }

    public final int b() {
        return java.lang.Math.min(this.c - this.a, this.d - this.b);
    }
}
