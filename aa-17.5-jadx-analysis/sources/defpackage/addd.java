package defpackage;

/* loaded from: classes3.dex */
public final class addd extends abnv implements abox {
    public static final addd a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        addd adddVar = new addd();
        a = adddVar;
        abnv.P(addd.class, adddVar);
    }

    private addd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new addd();
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
        return abnv.L(addd.class);
    }
}
