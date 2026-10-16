package defpackage;

/* loaded from: classes3.dex */
public final class absd extends abnv implements abox {
    public static final absd a;
    public int b;
    public int c;
    public absc d;

    static {
        absd absdVar = new absd();
        a = absdVar;
        abnv.P(absd.class, absdVar);
    }

    private absd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0003ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new absd();
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
        return abnv.L(absd.class);
    }
}
