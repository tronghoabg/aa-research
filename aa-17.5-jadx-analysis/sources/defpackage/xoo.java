package defpackage;

/* loaded from: classes3.dex */
public final class xoo extends abnv implements abox {
    public static final xoo a;
    public int b;
    public String c = "";
    public int d;
    public xma e;

    static {
        xoo xooVar = new xoo();
        a = xooVar;
        abnv.P(xoo.class, xooVar);
    }

    private xoo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new xoo();
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
        return abnv.L(xoo.class);
    }
}
