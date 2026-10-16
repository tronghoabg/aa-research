package defpackage;

/* loaded from: classes2.dex */
public final class lap extends abnv implements abox {
    public static final lap a;
    public int c;
    private int e;
    public String b = "";
    public String d = "";

    static {
        lap lapVar = new lap();
        a = lapVar;
        abnv.P(lap.class, lapVar);
    }

    private lap() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"e", "b", "c", orj.b, "d"});
        }
        if (i2 == 3) {
            return new lap();
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
        return abnv.L(lap.class);
    }
}
