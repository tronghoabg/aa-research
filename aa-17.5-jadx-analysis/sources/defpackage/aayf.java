package defpackage;

/* loaded from: classes3.dex */
public final class aayf extends abnv implements abox {
    public static final aayf a;
    private abot b = abot.a;

    static {
        aayf aayfVar = new aayf();
        a = aayfVar;
        abnv.P(aayf.class, aayfVar);
    }

    private aayf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new lds(abqd.INT32, 0, abqd.DOUBLE, Double.valueOf(0.0d))});
        }
        if (i2 == 3) {
            return new aayf();
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
        return abnv.L(aayf.class);
    }
}
