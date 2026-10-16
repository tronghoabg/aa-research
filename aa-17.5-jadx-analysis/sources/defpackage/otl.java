package defpackage;

/* loaded from: classes2.dex */
public final class otl extends abnv implements abox {
    public static final otl a;

    static {
        otl otlVar = new otl();
        a = otlVar;
        abnv.P(otl.class, otlVar);
    }

    private otl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new otl();
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
        return abnv.L(otl.class);
    }
}
