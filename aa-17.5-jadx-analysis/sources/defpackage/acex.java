package defpackage;

/* loaded from: classes3.dex */
public final class acex extends abnv implements abox {
    public static final acex a;
    private int b;
    private aapc c;

    static {
        acex acexVar = new acex();
        a = acexVar;
        abnv.P(acex.class, acexVar);
    }

    private acex() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0002", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new acex();
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
        return abnv.L(acex.class);
    }
}
