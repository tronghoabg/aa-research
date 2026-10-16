package defpackage;

/* loaded from: classes.dex */
public final class yzd extends abnv implements abox {
    public static final yzd a;
    public int b;
    public String c = "";
    public int d;

    static {
        yzd yzdVar = new yzd();
        a = yzdVar;
        abnv.P(yzd.class, yzdVar);
    }

    private yzd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new yzd();
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
        return abnv.L(yzd.class);
    }
}
