package defpackage;

/* loaded from: classes3.dex */
public final class aare extends abnv implements abox {
    public static final aare a;
    private int b;
    private aapc c;

    static {
        aare aareVar = new aare();
        a = aareVar;
        abnv.P(aare.class, aareVar);
    }

    private aare() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aare();
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
        return abnv.L(aare.class);
    }
}
