package defpackage;

/* loaded from: classes.dex */
public final class abzm extends abnv implements abox {
    public static final abzm a;
    public aboh b = abpf.b;

    static {
        abzm abzmVar = new abzm();
        a = abzmVar;
        abnv.P(abzm.class, abzmVar);
    }

    private abzm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", abzn.class});
        }
        if (i2 == 3) {
            return new abzm();
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
        return abnv.L(abzm.class);
    }
}
