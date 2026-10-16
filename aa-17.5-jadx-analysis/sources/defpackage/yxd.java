package defpackage;

/* loaded from: classes.dex */
public final class yxd extends abnv implements abox {
    public static final yxd a;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;

    static {
        yxd yxdVar = new yxd();
        a = yxdVar;
        abnv.P(yxd.class, yxdVar);
    }

    private yxd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new yxd();
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
        return abnv.L(yxd.class);
    }
}
