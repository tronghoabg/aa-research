package defpackage;

/* loaded from: classes.dex */
public final class yyj extends abnv implements abox {
    public static final yyj a;
    public int b;
    public int c;
    public boolean d;
    public int e;

    static {
        yyj yyjVar = new yyj();
        a = yyjVar;
        abnv.P(yyj.class, yyjVar);
    }

    private yyj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new yyj();
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
        return abnv.L(yyj.class);
    }
}
