package defpackage;

/* loaded from: classes3.dex */
public final class acer extends abnv implements abox {
    public static final acer a;
    private int b;
    private aapc c;

    static {
        acer acerVar = new acer();
        a = acerVar;
        abnv.P(acer.class, acerVar);
    }

    private acer() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0000\bဉ\u0007", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new acer();
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
        return abnv.L(acer.class);
    }
}
