package defpackage;

/* loaded from: classes.dex */
public final class yyl extends abnv implements abox {
    public static final yyl a;
    public int b;
    public String c = "";
    public int d;

    static {
        yyl yylVar = new yyl();
        a = yylVar;
        abnv.P(yyl.class, yylVar);
    }

    private yyl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new yyl();
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
        return abnv.L(yyl.class);
    }
}
