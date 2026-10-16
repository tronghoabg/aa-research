package defpackage;

/* loaded from: classes3.dex */
public final class zkf extends abnv implements abox {
    public static final zkf a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    private int f;

    static {
        zkf zkfVar = new zkf();
        a = zkfVar;
        abnv.P(zkf.class, zkfVar);
    }

    private zkf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"f", "b", ywl.u, "c", "d", zli.b, "e", ywl.t});
        }
        if (i2 == 3) {
            return new zkf();
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
        return abnv.L(zkf.class);
    }
}
