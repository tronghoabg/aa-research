package defpackage;

/* loaded from: classes3.dex */
public final class xmm extends abnv implements abox {
    public static final aboe a = new wbk(9);
    public static final xmm b;
    public int c;
    public boolean e;
    public boolean g;
    public abod d = abnw.a;
    public String f = "";

    static {
        xmm xmmVar = new xmm();
        b = xmmVar;
        abnv.P(xmm.class, xmmVar);
    }

    private xmm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(b, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဇ\u0000\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"c", "d", xku.n, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new xmm();
        }
        if (i2 == 4) {
            return new abnp(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(xmm.class);
    }
}
