package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hiv {
    public final defpackage.vd a;
    public int b;
    private final int c;
    private final int d;

    public hiv(int i, int i2, int i3, defpackage.vd vdVar) {
        d(i, i2, i3);
        this.c = i;
        this.d = i2;
        this.b = i3;
        this.a = vdVar;
    }

    private static void d(int i, int i2, int i3) {
        if (i3 < i || i3 > i2) {
            throw new java.lang.IndexOutOfBoundsException("Selected index " + i3 + " not within bounds of [" + i + ", " + i2 + "]");
        }
    }

    public final int a(int i) {
        return i - this.c;
    }

    public final void b(int i) {
        d(this.c, this.d, i);
        this.b = i;
    }

    public final boolean c(int i) {
        return i == this.b;
    }

    public final java.lang.String toString() {
        return "[start: " + this.c + ", end: " + this.d + ", selected: " + this.b + "]";
    }
}
