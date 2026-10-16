package defpackage;

/* loaded from: classes3.dex */
public final class abtm extends abnv implements abox {
    public static final abtm a;
    private int b;
    private achf c;

    static {
        abtm abtmVar = new abtm();
        a = abtmVar;
        abnv.P(abtm.class, abtmVar);
    }

    private abtm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abtm();
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
        return abnv.L(abtm.class);
    }
}
