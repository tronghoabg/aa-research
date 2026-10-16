package defpackage;

/* loaded from: classes3.dex */
public final class xqa extends abnv implements abox {
    public static final xqa a;
    public int b;
    public int c;
    public int d;
    public int g;
    public xgs h;
    public String e = "";
    public int f = 1;
    public abms i = abms.d;

    static {
        xqa xqaVar = new xqa();
        a = xqaVar;
        abnv.P(xqa.class, xqaVar);
    }

    private xqa() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဉ\u0005\u0007ည\u0006", new Object[]{"b", "c", "d", "e", "f", xou.h, "g", xou.j, "h", "i"});
        }
        if (i2 == 3) {
            return new xqa();
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
        return abnv.L(xqa.class);
    }
}
