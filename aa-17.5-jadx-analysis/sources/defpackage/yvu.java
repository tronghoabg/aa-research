package defpackage;

/* loaded from: classes3.dex */
public final class yvu extends abnv implements abox {
    public static final yvu a;
    public int b;
    public int c;
    public int d;

    static {
        yvu yvuVar = new yvu();
        a = yvuVar;
        abnv.P(yvu.class, yvuVar);
    }

    private yvu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", xou.o, "d", xou.p});
        }
        if (i2 == 3) {
            return new yvu();
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
        return abnv.L(yvu.class);
    }
}
