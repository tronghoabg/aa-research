package defpackage;

/* loaded from: classes3.dex */
public final class abad extends abnv implements abox {
    public static final abad a;
    public int b;
    public int c;

    static {
        abad abadVar = new abad();
        a = abadVar;
        abnv.P(abad.class, abadVar);
    }

    private abad() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", zli.p});
        }
        if (i2 == 3) {
            return new abad();
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
        return abnv.L(abad.class);
    }
}
