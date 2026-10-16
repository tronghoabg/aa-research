package defpackage;

/* loaded from: classes.dex */
public final class yxs extends abnv implements abox {
    public static final yxs a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        yxs yxsVar = new yxs();
        a = yxsVar;
        abnv.P(yxs.class, yxsVar);
    }

    private yxs() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new yxs();
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
        return abnv.L(yxs.class);
    }
}
