package defpackage;

/* loaded from: classes3.dex */
public final class aazm extends abnv implements abox {
    public static final aazm a;
    private int b;
    private aapc c;

    static {
        aazm aazmVar = new aazm();
        a = aazmVar;
        abnv.P(aazm.class, aazmVar);
    }

    private aazm() {
        abms abmsVar = abms.d;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aazm();
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
        return abnv.L(aazm.class);
    }
}
