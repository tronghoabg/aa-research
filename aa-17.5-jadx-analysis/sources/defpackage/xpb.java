package defpackage;

/* loaded from: classes.dex */
public final class xpb extends abnv implements abox {
    public static final xpb a;
    public int b;
    public xiv c;

    static {
        xpb xpbVar = new xpb();
        a = xpbVar;
        abnv.P(xpb.class, xpbVar);
    }

    private xpb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new xpb();
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
        return abnv.L(xpb.class);
    }
}
