package defpackage;

/* loaded from: classes3.dex */
public final class uzx extends abnv implements abox {
    public static final uzx a;
    public int b;
    public int c;

    static {
        uzx uzxVar = new uzx();
        a = uzxVar;
        abnv.P(uzx.class, uzxVar);
    }

    private uzx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new uzx();
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
        return abnv.L(uzx.class);
    }
}
