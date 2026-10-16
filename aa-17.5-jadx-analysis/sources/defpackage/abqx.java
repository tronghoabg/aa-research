package defpackage;

/* loaded from: classes3.dex */
public final class abqx extends abnv implements abox {
    public static final abqx a;
    public int b;
    public int c;
    public abpt d;

    static {
        abqx abqxVar = new abqx();
        a = abqxVar;
        abnv.P(abqx.class, abqxVar);
    }

    private abqx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"b", "c", ywl.i, "d"});
        }
        if (i2 == 3) {
            return new abqx();
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
        return abnv.L(abqx.class);
    }
}
