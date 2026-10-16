package defpackage;

/* loaded from: classes3.dex */
public final class xps extends abnv implements abox {
    public static final xps a;
    public int b;
    public long c;

    static {
        xps xpsVar = new xps();
        a = xpsVar;
        abnv.P(xps.class, xpsVar);
    }

    private xps() {
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new xps();
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
        return abnv.L(xps.class);
    }
}
