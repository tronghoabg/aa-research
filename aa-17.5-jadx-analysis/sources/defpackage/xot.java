package defpackage;

/* loaded from: classes3.dex */
public final class xot extends abnv implements abox {
    public static final xot a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        xot xotVar = new xot();
        a = xotVar;
        abnv.P(xot.class, xotVar);
    }

    private xot() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000", new Object[]{"d", "c", "b", "e", xos.class});
        }
        if (i2 == 3) {
            return new xot();
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
        return abnv.L(xot.class);
    }
}
