package defpackage;

/* loaded from: classes3.dex */
public final class aavy extends abnv implements abox {
    public static final aavy a;

    static {
        aavy aavyVar = new aavy();
        a = aavyVar;
        abnv.P(aavy.class, aavyVar);
    }

    private aavy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new aavy();
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
        return abnv.L(aavy.class);
    }
}
