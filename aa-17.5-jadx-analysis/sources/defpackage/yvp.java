package defpackage;

/* loaded from: classes3.dex */
public final class yvp extends abnv implements abox {
    public static final yvp a;
    public int b;
    public boolean c;
    public int d;
    public abod e = abnw.a;

    static {
        yvp yvpVar = new yvp();
        a = yvpVar;
        abnv.P(yvp.class, yvpVar);
    }

    private yvp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            abob abobVar = xou.m;
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ࠬ", new Object[]{"b", "c", "d", abobVar, "e", abobVar});
        }
        if (i2 == 3) {
            return new yvp();
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
        return abnv.L(yvp.class);
    }
}
