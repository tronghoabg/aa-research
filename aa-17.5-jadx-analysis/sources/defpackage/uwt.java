package defpackage;

/* loaded from: classes3.dex */
public final class uwt {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public uwt(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final uwt a(int i) {
        return new uwt(this.a, this.b, i, this.d);
    }

    public final String toString() {
        return this.a + "," + this.b + "," + this.d + "," + this.c;
    }
}
