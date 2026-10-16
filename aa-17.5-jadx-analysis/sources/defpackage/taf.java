package defpackage;

/* loaded from: classes.dex */
public final class taf extends abnv implements abox {
    public static final taf a;
    public orl b;
    private int c;

    static {
        taf tafVar = new taf();
        a = tafVar;
        abnv.P(taf.class, tafVar);
    }

    private taf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new taf();
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
        return abnv.L(taf.class);
    }
}
