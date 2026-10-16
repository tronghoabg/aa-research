package defpackage;

/* loaded from: classes.dex */
public final class yxg extends abnv implements abox {
    public static final yxg a;
    public int b;
    public int c;

    static {
        yxg yxgVar = new yxg();
        a = yxgVar;
        abnv.P(yxg.class, yxgVar);
    }

    private yxg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new yxg();
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
        return abnv.L(yxg.class);
    }
}
