package defpackage;

/* loaded from: classes3.dex */
public final class yvy extends abnv implements abox {
    public static final yvy a;
    public int b;
    public boolean c;
    public int d;

    static {
        yvy yvyVar = new yvy();
        a = yvyVar;
        abnv.P(yvy.class, yvyVar);
    }

    private yvy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0004᠌\u0003", new Object[]{"b", "c", "d", xou.t});
        }
        if (i2 == 3) {
            return new yvy();
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
        return abnv.L(yvy.class);
    }
}
