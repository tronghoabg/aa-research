package defpackage;

/* loaded from: classes2.dex */
public final class pay extends abnv implements abox {
    public static final pay a;
    public abnf b;
    public abnf c;
    private int d;

    static {
        pay payVar = new pay();
        a = payVar;
        abnv.P(pay.class, payVar);
    }

    private pay() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new pay();
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
        return abnv.L(pay.class);
    }
}
