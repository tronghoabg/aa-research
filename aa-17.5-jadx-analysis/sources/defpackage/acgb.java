package defpackage;

/* loaded from: classes3.dex */
public final class acgb extends abnv implements abox {
    public static final acgb a;
    private int b;
    private ablk c;

    static {
        acgb acgbVar = new acgb();
        a = acgbVar;
        abnv.P(acgb.class, acgbVar);
    }

    private acgb() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0011\u0011\u0001\u0000\u0000\u0000\u0011ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new acgb();
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
        return abnv.L(acgb.class);
    }
}
