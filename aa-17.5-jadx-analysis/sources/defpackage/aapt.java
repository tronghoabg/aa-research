package defpackage;

/* loaded from: classes3.dex */
public final class aapt extends abnv implements abox {
    public static final aapt a;
    private int b;
    private aapc c;

    static {
        aapt aaptVar = new aapt();
        a = aaptVar;
        abnv.P(aapt.class, aaptVar);
    }

    private aapt() {
        Object[] objArr = abpf.a;
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0000\bဉ\u0007", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aapt();
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
        return abnv.L(aapt.class);
    }
}
