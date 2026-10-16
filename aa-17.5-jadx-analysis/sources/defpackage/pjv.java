package defpackage;

/* loaded from: classes2.dex */
public final class pjv extends abnv implements abox {
    public static final pjv a;
    public pjx b;
    public abms c = abms.d;
    private int d;

    static {
        pjv pjvVar = new pjv();
        a = pjvVar;
        abnv.P(pjv.class, pjvVar);
    }

    private pjv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new pjv();
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
        return abnv.L(pjv.class);
    }
}
