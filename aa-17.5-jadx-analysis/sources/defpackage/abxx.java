package defpackage;

/* loaded from: classes3.dex */
public final class abxx extends abnv implements abox {
    public static final aboe a = new wbk(15);
    public static final abxx b;
    public int c;
    public abxv d;
    public int e;
    public abod f = abnw.a;

    static {
        abxx abxxVar = new abxx();
        b = abxxVar;
        abnv.P(abxx.class, abxxVar);
    }

    private abxx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(b, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0003\f\u0004,", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new abxx();
        }
        if (i2 == 4) {
            return new abnp(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(abxx.class);
    }
}
