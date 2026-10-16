package defpackage;

/* loaded from: classes3.dex */
public final class ajfv extends abnv implements abox {
    public static final ajfv a;
    public int b = 0;
    public long c;
    public abnf d;
    private int e;
    private Object f;

    static {
        ajfv ajfvVar = new ajfv();
        a = ajfvVar;
        abnv.P(ajfv.class, ajfvVar);
    }

    private ajfv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"f", "b", "e", "c", "d", ajft.class, ajfu.class, ajfs.class});
        }
        if (i2 == 3) {
            return new ajfv();
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
        return abnv.L(ajfv.class);
    }
}
