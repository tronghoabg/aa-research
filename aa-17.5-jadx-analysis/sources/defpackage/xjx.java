package defpackage;

/* loaded from: classes3.dex */
public final class xjx extends abnv implements abox {
    public static final xjx a;
    public int b;
    public int c;
    public int d;
    public int e;
    private int f;

    static {
        xjx xjxVar = new xjx();
        a = xjxVar;
        abnv.P(xjx.class, xjxVar);
    }

    private xjx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"f", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new xjx();
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
        return abnv.L(xjx.class);
    }
}
