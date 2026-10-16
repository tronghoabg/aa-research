package defpackage;

/* loaded from: classes.dex */
public final class xpf extends abnv implements abox {
    public static final xpf a;
    public int b = 1;
    public boolean c;
    private int d;

    static {
        xpf xpfVar = new xpf();
        a = xpfVar;
        abnv.P(xpf.class, xpfVar);
    }

    private xpf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"d", "b", xln.g, "c"});
        }
        if (i2 == 3) {
            return new xpf();
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
        return abnv.L(xpf.class);
    }
}
