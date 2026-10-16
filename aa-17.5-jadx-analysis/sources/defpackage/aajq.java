package defpackage;

/* loaded from: classes3.dex */
public final class aajq extends abnv implements abox {
    public static final aajq a;
    private int b;
    private aapc c;

    static {
        aajq aajqVar = new aajq();
        a = aajqVar;
        abnv.P(aajq.class, aajqVar);
    }

    private aajq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aajq();
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
        return abnv.L(aajq.class);
    }
}
