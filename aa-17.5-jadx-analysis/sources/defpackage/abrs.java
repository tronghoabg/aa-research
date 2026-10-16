package defpackage;

/* loaded from: classes.dex */
public final class abrs extends abnv implements abox {
    public static final abrs a;
    public abod b = abnw.a;

    static {
        abrs abrsVar = new abrs();
        a = abrsVar;
        abnv.P(abrs.class, abrsVar);
    }

    private abrs() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new abrs();
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
        return abnv.L(abrs.class);
    }
}
