package defpackage;

/* loaded from: classes3.dex */
public final class aaps extends abnv implements abox {
    public static final aaps a;
    private int b;
    private aapc c;

    static {
        aaps aapsVar = new aaps();
        a = aapsVar;
        abnv.P(aaps.class, aapsVar);
    }

    private aaps() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aaps();
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
        return abnv.L(aaps.class);
    }
}
