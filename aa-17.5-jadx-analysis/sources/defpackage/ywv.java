package defpackage;

/* loaded from: classes.dex */
public final class ywv extends abnv implements abox {
    public static final ywv a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    static {
        ywv ywvVar = new ywv();
        a = ywvVar;
        abnv.P(ywv.class, ywvVar);
    }

    private ywv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fင\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        }
        if (i2 == 3) {
            return new ywv();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(ywv.class);
    }
}
