package defpackage;

/* loaded from: classes3.dex */
public final class xoe extends abnv implements abox {
    public static final xoe a;
    public int b;
    public xgi c;
    public int d = 1;
    public String e = "";
    public int f;

    static {
        xoe xoeVar = new xoe();
        a = xoeVar;
        abnv.P(xoe.class, xoeVar);
    }

    private xoe() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"b", "c", "d", xln.b, "e", "f"});
        }
        if (i2 == 3) {
            return new xoe();
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
        return abnv.L(xoe.class);
    }
}
