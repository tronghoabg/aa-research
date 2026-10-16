package defpackage;

/* loaded from: classes3.dex */
public final class abbx extends abnv implements abox {
    public static final abbx a;
    public int b;
    public int c;
    public abam d;

    static {
        abbx abbxVar = new abbx();
        a = abbxVar;
        abnv.P(abbx.class, abbxVar);
    }

    private abbx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abbx();
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
        return abnv.L(abbx.class);
    }
}
