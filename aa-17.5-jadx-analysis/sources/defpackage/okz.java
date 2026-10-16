package defpackage;

/* loaded from: classes2.dex */
public final class okz extends abnv implements abox {
    public static final okz a;
    public aboh b = abpf.b;

    static {
        okz okzVar = new okz();
        a = okzVar;
        abnv.P(okz.class, okzVar);
    }

    private okz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", oky.class});
        }
        if (i2 == 3) {
            return new okz();
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
        return abnv.L(okz.class);
    }
}
