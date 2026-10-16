package defpackage;

/* loaded from: classes.dex */
public final class yyn extends abnv implements abox {
    public static final yyn a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        yyn yynVar = new yyn();
        a = yynVar;
        abnv.P(yyn.class, yynVar);
    }

    private yyn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new yyn();
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
        return abnv.L(yyn.class);
    }
}
