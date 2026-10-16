package defpackage;

/* loaded from: classes3.dex */
public final class aawe extends abnv implements abox {
    public static final aawe a;

    static {
        aawe aaweVar = new aawe();
        a = aaweVar;
        abnv.P(aawe.class, aaweVar);
    }

    private aawe() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aawe();
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
        return abnv.L(aawe.class);
    }
}
