package defpackage;

/* loaded from: classes2.dex */
public final class otc extends abnv implements abox {
    public static final otc a;
    public static final abnh g;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        otc otcVar = new otc();
        a = otcVar;
        abnv.P(otc.class, otcVar);
        g = abnv.W(osn.a, otcVar, otcVar, null, 107, abqd.MESSAGE);
    }

    private otc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new otc();
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
        return abnv.L(otc.class);
    }
}
