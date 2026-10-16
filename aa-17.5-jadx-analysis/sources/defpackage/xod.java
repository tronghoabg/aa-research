package defpackage;

/* loaded from: classes3.dex */
public final class xod extends abnv implements abox {
    public static final xod a;
    public int b;
    public xgi c;
    public xgq d;
    public String e = "";

    static {
        xod xodVar = new xod();
        a = xodVar;
        abnv.P(xod.class, xodVar);
    }

    private xod() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new xod();
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
        return abnv.L(xod.class);
    }
}
