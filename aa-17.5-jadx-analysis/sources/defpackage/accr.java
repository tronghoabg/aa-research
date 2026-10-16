package defpackage;

/* loaded from: classes3.dex */
public final class accr extends abnv implements abox {
    public static final accr a;
    private int b;
    private aapc c;

    static {
        accr accrVar = new accr();
        a = accrVar;
        abnv.P(accr.class, accrVar);
    }

    private accr() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new accr();
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
        return abnv.L(accr.class);
    }
}
