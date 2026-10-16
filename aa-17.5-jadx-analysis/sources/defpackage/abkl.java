package defpackage;

/* loaded from: classes3.dex */
public final class abkl extends abnv implements abox {
    public static final abkl a;
    public int b;
    public int c = 1;

    static {
        abkl abklVar = new abkl();
        a = abklVar;
        abnv.P(abkl.class, abklVar);
    }

    private abkl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", abho.m});
        }
        if (i2 == 3) {
            return new abkl();
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
        return abnv.L(abkl.class);
    }
}
