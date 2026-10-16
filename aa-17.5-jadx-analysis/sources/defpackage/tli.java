package defpackage;

/* loaded from: classes3.dex */
public final class tli extends abnv implements abox {
    public static final tli a;
    public abms b;
    public abms c;

    static {
        tli tliVar = new tli();
        a = tliVar;
        abnv.P(tli.class, tliVar);
    }

    private tli() {
        abms abmsVar = abms.d;
        this.b = abmsVar;
        this.c = abmsVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new tli();
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
        return abnv.L(tli.class);
    }
}
