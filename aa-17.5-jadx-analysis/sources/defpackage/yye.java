package defpackage;

/* loaded from: classes.dex */
public final class yye extends abnv implements abox {
    public static final yye a;
    public int b;
    public int c;
    public abod d = abnw.a;

    static {
        yye yyeVar = new yye();
        a = yyeVar;
        abnv.P(yye.class, yyeVar);
    }

    private yye() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0016", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new yye();
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
        return abnv.L(yye.class);
    }
}
