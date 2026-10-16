package defpackage;

/* loaded from: classes3.dex */
public final class tad extends abnv implements abox {
    public static final tad a;
    public int b;
    public abpt c;
    public int d;

    static {
        tad tadVar = new tad();
        a = tadVar;
        abnv.P(tad.class, tadVar);
    }

    private tad() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဌ\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new tad();
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
        return abnv.L(tad.class);
    }
}
