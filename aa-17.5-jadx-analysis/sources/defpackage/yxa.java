package defpackage;

/* loaded from: classes.dex */
public final class yxa extends abnv implements abox {
    public static final yxa a;
    public int b;
    public int c;
    public int d;

    static {
        yxa yxaVar = new yxa();
        a = yxaVar;
        abnv.P(yxa.class, yxaVar);
    }

    private yxa() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new yxa();
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
        return abnv.L(yxa.class);
    }
}
