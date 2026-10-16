package defpackage;

/* loaded from: classes3.dex */
public final class xgl extends abnv implements abox {
    public static final xgl a;
    public int b;
    public xgi c;
    public xga d;
    public xgi e;

    static {
        xgl xglVar = new xgl();
        a = xglVar;
        abnv.P(xgl.class, xglVar);
    }

    private xgl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new xgl();
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
        return abnv.L(xgl.class);
    }
}
