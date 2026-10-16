package defpackage;

/* loaded from: classes.dex */
public final class yyg extends abnv implements abox {
    public static final yyg a;
    public int b;
    public aboh c = abpf.b;
    public int d;
    public boolean e;

    static {
        yyg yygVar = new yyg();
        a = yygVar;
        abnv.P(yyg.class, yygVar);
    }

    private yyg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဇ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new yyg();
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
        return abnv.L(yyg.class);
    }
}
