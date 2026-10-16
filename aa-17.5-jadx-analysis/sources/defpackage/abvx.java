package defpackage;

/* loaded from: classes3.dex */
public final class abvx extends abnv implements abox {
    public static final abvx a;
    public aboh b = abpf.b;

    static {
        abvx abvxVar = new abvx();
        a = abvxVar;
        abnv.P(abvx.class, abvxVar);
    }

    private abvx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", abvw.class});
        }
        if (i2 == 3) {
            return new abvx();
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
        return abnv.L(abvx.class);
    }
}
