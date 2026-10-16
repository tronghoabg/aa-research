package defpackage;

/* loaded from: classes2.dex */
public final class okx extends abnv implements abox {
    public static final okx a;
    public int b;
    public boolean c;
    public boolean d;

    static {
        okx okxVar = new okx();
        a = okxVar;
        abnv.P(okx.class, okxVar);
    }

    private okx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new okx();
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
        return abnv.L(okx.class);
    }
}
