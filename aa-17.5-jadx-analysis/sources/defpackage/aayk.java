package defpackage;

/* loaded from: classes3.dex */
public final class aayk extends abnv implements abox {
    public static final aayk a;

    static {
        aayk aaykVar = new aayk();
        a = aaykVar;
        abnv.P(aayk.class, aaykVar);
    }

    private aayk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aayk();
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
        return abnv.L(aayk.class);
    }
}
