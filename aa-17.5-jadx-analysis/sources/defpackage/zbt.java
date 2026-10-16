package defpackage;

/* loaded from: classes3.dex */
public final class zbt extends abnv implements abox {
    public static final zbt a;
    public abod b = abnw.a;

    static {
        zbt zbtVar = new zbt();
        a = zbtVar;
        abnv.P(zbt.class, zbtVar);
    }

    private zbt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new zbt();
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
        return abnv.L(zbt.class);
    }
}
