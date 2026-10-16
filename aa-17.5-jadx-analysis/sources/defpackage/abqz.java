package defpackage;

/* loaded from: classes.dex */
public final class abqz extends abnv implements abox {
    public static final abqz a;
    public aboh b = abpf.b;

    static {
        abqz abqzVar = new abqz();
        a = abqzVar;
        abnv.P(abqz.class, abqzVar);
    }

    private abqz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", abqy.class});
        }
        if (i2 == 3) {
            return new abqz();
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
        return abnv.L(abqz.class);
    }
}
