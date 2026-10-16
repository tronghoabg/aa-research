package defpackage;

/* loaded from: classes3.dex */
public final class aayz extends abnv implements abox {
    public static final aayz a;

    static {
        aayz aayzVar = new aayz();
        a = aayzVar;
        abnv.P(aayz.class, aayzVar);
    }

    private aayz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aayz();
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
        return abnv.L(aayz.class);
    }
}
