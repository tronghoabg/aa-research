package defpackage;

/* loaded from: classes3.dex */
public final class aapw extends abnv implements abox {
    public static final aapw a;
    private int b;
    private aapc c;

    static {
        aapw aapwVar = new aapw();
        a = aapwVar;
        abnv.P(aapw.class, aapwVar);
    }

    private aapw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aapw();
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
        return abnv.L(aapw.class);
    }
}
