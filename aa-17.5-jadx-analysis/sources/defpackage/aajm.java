package defpackage;

/* loaded from: classes3.dex */
public final class aajm extends abnv implements abox {
    public static final aajm a;
    private int b;
    private aapc c;

    static {
        aajm aajmVar = new aajm();
        a = aajmVar;
        abnv.P(aajm.class, aajmVar);
    }

    private aajm() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aajm();
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
        return abnv.L(aajm.class);
    }
}
