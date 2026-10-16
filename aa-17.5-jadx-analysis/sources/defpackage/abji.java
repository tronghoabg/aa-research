package defpackage;

/* loaded from: classes3.dex */
public final class abji extends abnv implements abox {
    public static final abji a;
    public int b;
    public int c;
    public int d;
    public int e;
    public abht f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public float m;
    public float n;

    static {
        abji abjiVar = new abji();
        a = abjiVar;
        abnv.P(abji.class, abjiVar);
    }

    private abji() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဆ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005᠌\u0004\u0006င\u0005\u0007င\u0006\bင\b\tင\t\nဆ\n\u000bခ\u000b\fခ\u0010", new Object[]{"b", "c", "d", "e", "f", "g", abho.h, "h", "i", "j", "k", "l", "m", "n"});
        }
        if (i2 == 3) {
            return new abji();
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
        return abnv.L(abji.class);
    }
}
