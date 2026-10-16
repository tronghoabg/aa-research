package defpackage;

/* loaded from: classes.dex */
public final class wbb extends abnv implements abox {
    public static final wbb a;
    public long e;
    private int g;
    public abot f = abot.a;
    public String b = "";
    public abms c = abms.d;
    public String d = "";

    static {
        wbb wbbVar = new wbb();
        a = wbbVar;
        abnv.P(wbb.class, wbbVar);
    }

    private wbb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"g", "b", "c", "d", "e", "f", new lds(abqd.STRING, "", abqd.MESSAGE, wax.a)});
        }
        if (i2 == 3) {
            return new wbb();
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
        return abnv.L(wbb.class);
    }
}
