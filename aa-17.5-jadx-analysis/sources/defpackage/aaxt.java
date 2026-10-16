package defpackage;

/* loaded from: classes3.dex */
public final class aaxt extends abnv implements abox {
    public static final aaxt a;

    static {
        aaxt aaxtVar = new aaxt();
        a = aaxtVar;
        abnv.P(aaxt.class, aaxtVar);
    }

    private aaxt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aaxt();
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
        return abnv.L(aaxt.class);
    }
}
