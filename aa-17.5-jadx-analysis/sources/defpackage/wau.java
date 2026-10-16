package defpackage;

/* loaded from: classes.dex */
public final class wau extends abnv implements abox {
    public static final wau a;
    public int b;
    public int c;
    public int d;

    static {
        wau wauVar = new wau();
        a = wauVar;
        abnv.P(wau.class, wauVar);
    }

    private wau() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new wau();
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
        return abnv.L(wau.class);
    }
}
