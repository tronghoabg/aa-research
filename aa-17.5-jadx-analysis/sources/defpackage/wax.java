package defpackage;

/* loaded from: classes.dex */
public final class wax extends abnv implements abox {
    public static final wax a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        wax waxVar = new wax();
        a = waxVar;
        abnv.P(wax.class, waxVar);
    }

    private wax() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (i2 == 3) {
            return new wax();
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
        return abnv.L(wax.class);
    }
}
