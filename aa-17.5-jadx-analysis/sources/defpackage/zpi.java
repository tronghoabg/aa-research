package defpackage;

/* loaded from: classes3.dex */
public final class zpi extends abnv implements abox {
    public static final zpi a;
    public int b;
    public zpf c;

    static {
        zpi zpiVar = new zpi();
        a = zpiVar;
        abnv.P(zpi.class, zpiVar);
    }

    private zpi() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zpi();
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
        return abnv.L(zpi.class);
    }
}
