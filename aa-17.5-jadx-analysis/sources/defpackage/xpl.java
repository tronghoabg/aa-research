package defpackage;

/* loaded from: classes.dex */
public final class xpl extends abnv implements abox {
    public static final xpl a;
    public String b = "";
    private int c;

    static {
        xpl xplVar = new xpl();
        a = xplVar;
        abnv.P(xpl.class, xplVar);
    }

    private xpl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new xpl();
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
        return abnv.L(xpl.class);
    }
}
