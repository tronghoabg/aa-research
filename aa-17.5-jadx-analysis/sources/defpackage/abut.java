package defpackage;

/* loaded from: classes3.dex */
public final class abut extends abnv implements abox {
    public static final abut a;
    public int b;
    public abus c;
    public int d;
    public abod e = abnw.a;

    static {
        abut abutVar = new abut();
        a = abutVar;
        abnv.P(abut.class, abutVar);
    }

    private abut() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0003\f\u0004,", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abut();
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
        return abnv.L(abut.class);
    }
}
