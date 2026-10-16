package defpackage;

/* loaded from: classes3.dex */
public final class zpy extends abnv implements abox {
    public static final zpy a;
    private abot b = abot.a;

    static {
        zpy zpyVar = new zpy();
        a = zpyVar;
        abnv.P(zpy.class, zpyVar);
    }

    private zpy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new lds(abqd.STRING, "", abqd.MESSAGE, zpx.a)});
        }
        if (i2 == 3) {
            return new zpy();
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
        return abnv.L(zpy.class);
    }
}
