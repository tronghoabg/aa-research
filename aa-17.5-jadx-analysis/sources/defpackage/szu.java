package defpackage;

/* loaded from: classes3.dex */
public final class szu extends abnv implements abox {
    public static final szu a;
    public aboh b = abpf.b;

    static {
        szu szuVar = new szu();
        a = szuVar;
        abnv.P(szu.class, szuVar);
    }

    private szu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", tat.class});
        }
        if (i2 == 3) {
            return new szu();
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
        return abnv.L(szu.class);
    }
}
