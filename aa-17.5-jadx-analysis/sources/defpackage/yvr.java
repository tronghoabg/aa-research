package defpackage;

/* loaded from: classes3.dex */
public final class yvr extends abnv implements abox {
    public static final yvr a;
    public abod b = abnw.a;

    static {
        yvr yvrVar = new yvr();
        a = yvrVar;
        abnv.P(yvr.class, yvrVar);
    }

    private yvr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"b", xou.n});
        }
        if (i2 == 3) {
            return new yvr();
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
        return abnv.L(yvr.class);
    }
}
