package defpackage;

/* loaded from: classes3.dex */
public final class acco extends abnv implements abox {
    public static final acco a;

    static {
        acco accoVar = new acco();
        a = accoVar;
        abnv.P(acco.class, accoVar);
    }

    private acco() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new acco();
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
        return abnv.L(acco.class);
    }
}
