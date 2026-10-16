package defpackage;

/* loaded from: classes3.dex */
public final class acgp extends abnv implements abox {
    public static final acgp a;
    private int b;
    private aapc c;

    static {
        acgp acgpVar = new acgp();
        a = acgpVar;
        abnv.P(acgp.class, acgpVar);
    }

    private acgp() {
        abor aborVar = abor.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new acgp();
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
        return abnv.L(acgp.class);
    }
}
