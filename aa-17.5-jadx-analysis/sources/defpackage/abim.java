package defpackage;

/* loaded from: classes3.dex */
public final class abim extends abnv implements abox {
    public static final abim a;
    public int b;
    public int c;
    public int d;
    public abog e = abor.a;
    public abin f;
    private int g;

    static {
        abim abimVar = new abim();
        a = abimVar;
        abnv.P(abim.class, abimVar);
    }

    private abim() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0005င\u0004\u0007&\bဉ\u0006", new Object[]{"g", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new abim();
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
        return abnv.L(abim.class);
    }
}
