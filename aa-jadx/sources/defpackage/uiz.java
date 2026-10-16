package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uiz {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public java.lang.Integer o = null;
    public int a = 0;
    public int b = 0;
    public boolean c = false;
    public boolean d = false;

    public static int a(int i, int i2) {
        return ((java.lang.Math.min(256, i) - 1) << 8) | (java.lang.Math.min(256, i2) - 1);
    }

    public static int c(int i, int i2, int i3) {
        if (i != 0) {
            int i4 = i - 1;
            int i5 = i2 - 1;
            if (i2 != 0) {
                int i6 = i5 << 4;
                int i7 = i3 - 1;
                if (i3 != 0) {
                    return (i4 << 8) | i6 | i7;
                }
            }
        }
        throw null;
    }

    public final void b(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
