package defpackage;

/* loaded from: classes3.dex */
public final class xna extends abnv implements abox {
    public static final xna a;
    public int b = 1;
    public int c;
    private int d;

    static {
        xna xnaVar = new xna();
        a = xnaVar;
        abnv.P(xna.class, xnaVar);
    }

    private xna() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001", new Object[]{"d", "b", xku.p, "c"});
        }
        if (i2 == 3) {
            return new xna();
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
        return abnv.L(xna.class);
    }
}
