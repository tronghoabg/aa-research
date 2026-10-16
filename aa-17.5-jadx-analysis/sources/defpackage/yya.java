package defpackage;

/* loaded from: classes.dex */
public final class yya extends abnv implements abox {
    public static final yya a;
    public int b;
    public long c;
    public yxz d;

    static {
        yya yyaVar = new yya();
        a = yyaVar;
        abnv.P(yya.class, yyaVar);
    }

    private yya() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new yya();
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
        return abnv.L(yya.class);
    }
}
