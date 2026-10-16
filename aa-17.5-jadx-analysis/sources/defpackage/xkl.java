package defpackage;

/* loaded from: classes3.dex */
public final class xkl extends abnv implements abox {
    public static final xkl a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public abms f = abms.d;
    public String g = "";
    public int h;
    public int i;

    static {
        xkl xklVar = new xkl();
        a = xklVar;
        abnv.P(xkl.class, xklVar);
    }

    private xkl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဋ\u0005\u0007င\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new xkl();
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
        return abnv.L(xkl.class);
    }
}
