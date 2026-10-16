package defpackage;

/* loaded from: classes3.dex */
public final class aaun extends abnv implements abox {
    public static final aaun a;
    public boolean b;
    private int c;

    static {
        aaun aaunVar = new aaun();
        a = aaunVar;
        abnv.P(aaun.class, aaunVar);
    }

    private aaun() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001TT\u0001\u0000\u0000\u0000Tဇ\u000f", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new aaun();
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
        return abnv.L(aaun.class);
    }
}
