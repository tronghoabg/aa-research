package defpackage;

/* loaded from: classes.dex */
public final class yyp extends abnv implements abox {
    public static final yyp a;
    public int b;
    public yyo c;
    public aboh d = abpf.b;
    public int e;
    public int f;

    static {
        yyp yypVar = new yyp();
        a = yypVar;
        abnv.P(yyp.class, yypVar);
    }

    private yyp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003င\u0001\u0004င\u0002", new Object[]{"b", "c", "d", yyo.class, "e", "f"});
        }
        if (i2 == 3) {
            return new yyp();
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
        return abnv.L(yyp.class);
    }
}
