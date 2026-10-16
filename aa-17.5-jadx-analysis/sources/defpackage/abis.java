package defpackage;

/* loaded from: classes3.dex */
public final class abis extends abnv implements abox {
    public static final abis a;
    public int b;
    public long c;
    public abka d;
    public abiz e;
    public int f = 1;

    static {
        abis abisVar = new abis();
        a = abisVar;
        abnv.P(abis.class, abisVar);
    }

    private abis() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", abho.j});
        }
        if (i2 == 3) {
            return new abis();
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
        return abnv.L(abis.class);
    }
}
