package defpackage;

/* loaded from: classes2.dex */
public final class pbc extends abnv implements abox {
    public static final pbc a;
    public int b = 0;
    public Object c;

    static {
        pbc pbcVar = new pbc();
        a = pbcVar;
        abnv.P(pbc.class, pbcVar);
    }

    private pbc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u083f\u0000\u0002\u083f\u0000", new Object[]{"c", "b", orj.q, ywl.d});
        }
        if (i2 == 3) {
            return new pbc();
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
        return abnv.L(pbc.class);
    }
}
