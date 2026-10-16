package defpackage;

/* loaded from: classes2.dex */
public final class ouj extends abnv implements abox {
    public static final ouj a;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public abpt g;

    static {
        ouj oujVar = new ouj();
        a = oujVar;
        abnv.P(ouj.class, oujVar);
    }

    private ouj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", orj.n, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new ouj();
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
        return abnv.L(ouj.class);
    }
}
