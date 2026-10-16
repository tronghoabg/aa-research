package defpackage;

/* loaded from: classes3.dex */
public final class xio extends abnv implements abox {
    public static final xio a;
    public int b;
    public xgi c;
    public int d = 1;

    static {
        xio xioVar = new xio();
        a = xioVar;
        abnv.P(xio.class, xioVar);
    }

    private xio() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", xln.b});
        }
        if (i2 == 3) {
            return new xio();
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
        return abnv.L(xio.class);
    }
}
