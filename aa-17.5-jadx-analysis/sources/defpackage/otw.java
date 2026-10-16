package defpackage;

/* loaded from: classes.dex */
public final class otw extends abnv implements abox {
    public static final otw a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        otw otwVar = new otw();
        a = otwVar;
        abnv.P(otw.class, otwVar);
    }

    private otw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001င\u0000\u0004᠌\u0001\u0005᠌\u0002", new Object[]{"b", "c", "d", otu.a, "e", otu.e});
        }
        if (i2 == 3) {
            return new otw();
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
        return abnv.L(otw.class);
    }
}
