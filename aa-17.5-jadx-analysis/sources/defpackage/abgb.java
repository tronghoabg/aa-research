package defpackage;

/* loaded from: classes3.dex */
public final class abgb extends abnv implements abox {
    public static final abgb a;
    public aboh b = abpf.b;

    static {
        abgb abgbVar = new abgb();
        a = abgbVar;
        abnv.P(abgb.class, abgbVar);
    }

    private abgb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new abgb();
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
        return abnv.L(abgb.class);
    }
}
