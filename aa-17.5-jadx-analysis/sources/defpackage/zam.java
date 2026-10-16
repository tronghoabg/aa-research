package defpackage;

/* loaded from: classes3.dex */
public final class zam extends abnv implements abox {
    public static final zam a;
    private int b;
    private zah c;
    private zah d;
    private zah e;

    static {
        zam zamVar = new zam();
        a = zamVar;
        abnv.P(zam.class, zamVar);
    }

    private zam() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new zam();
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
        return abnv.L(zam.class);
    }
}
