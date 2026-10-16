package defpackage;

/* loaded from: classes3.dex */
public final class zbi extends abnv implements abox {
    public static final zbi a;
    public aboh b = abpf.b;

    static {
        zbi zbiVar = new zbi();
        a = zbiVar;
        abnv.P(zbi.class, zbiVar);
    }

    private zbi() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", zbf.class});
        }
        if (i2 == 3) {
            return new zbi();
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
        return abnv.L(zbi.class);
    }
}
