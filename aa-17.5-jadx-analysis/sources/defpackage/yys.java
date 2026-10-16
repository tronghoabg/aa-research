package defpackage;

/* loaded from: classes.dex */
public final class yys extends abnv implements abox {
    public static final yys a;
    public aboh b;
    public aboh c;

    static {
        yys yysVar = new yys();
        a = yysVar;
        abnv.P(yys.class, yysVar);
    }

    private yys() {
        abpf abpfVar = abpf.b;
        this.b = abpfVar;
        this.c = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0000\u0002\u001a\u0003\u001a", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new yys();
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
        return abnv.L(yys.class);
    }
}
