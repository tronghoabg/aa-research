package defpackage;

/* loaded from: classes3.dex */
public final class tai extends abnv implements abox {
    public static final tai a;
    public aboh b = abpf.b;

    static {
        tai taiVar = new tai();
        a = taiVar;
        abnv.P(tai.class, taiVar);
    }

    private tai() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", orz.class});
        }
        if (i2 == 3) {
            return new tai();
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
        return abnv.L(tai.class);
    }
}
