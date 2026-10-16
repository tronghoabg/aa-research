package defpackage;

/* loaded from: classes3.dex */
public final class aaor extends abnv implements abox {
    public static final aaor a;
    private int b;
    private aapc c;

    static {
        aaor aaorVar = new aaor();
        a = aaorVar;
        abnv.P(aaor.class, aaorVar);
    }

    private aaor() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\n", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aaor();
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
        return abnv.L(aaor.class);
    }
}
