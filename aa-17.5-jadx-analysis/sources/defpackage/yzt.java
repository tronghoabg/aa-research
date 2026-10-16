package defpackage;

/* loaded from: classes.dex */
public final class yzt extends abnv implements abox {
    public static final yzt a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        yzt yztVar = new yzt();
        a = yztVar;
        abnv.P(yzt.class, yztVar);
    }

    private yzt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new yzt();
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
        return abnv.L(yzt.class);
    }
}
