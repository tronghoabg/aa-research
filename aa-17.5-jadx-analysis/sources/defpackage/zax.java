package defpackage;

/* loaded from: classes3.dex */
public final class zax extends abnv implements abox {
    public static final zax a;
    public int b;
    public int c;
    public int d;

    static {
        zax zaxVar = new zax();
        a = zaxVar;
        abnv.P(zax.class, zaxVar);
    }

    private zax() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", ywl.j});
        }
        if (i2 == 3) {
            return new zax();
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
        return abnv.L(zax.class);
    }
}
