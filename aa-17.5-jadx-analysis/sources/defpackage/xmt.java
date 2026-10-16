package defpackage;

/* loaded from: classes3.dex */
public final class xmt extends abnv implements abox {
    public static final xmt a;
    public boolean b;
    private int c;

    static {
        xmt xmtVar = new xmt();
        a = xmtVar;
        abnv.P(xmt.class, xmtVar);
    }

    private xmt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new xmt();
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
        return abnv.L(xmt.class);
    }
}
