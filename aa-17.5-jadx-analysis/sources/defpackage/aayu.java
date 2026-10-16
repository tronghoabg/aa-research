package defpackage;

/* loaded from: classes3.dex */
public final class aayu extends abnv implements abox {
    public static final aayu a;
    private abot b = abot.a;

    static {
        aayu aayuVar = new aayu();
        a = aayuVar;
        abnv.P(aayu.class, aayuVar);
    }

    private aayu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            abqd abqdVar = abqd.STRING;
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new lds(abqdVar, "", abqdVar, "")});
        }
        if (i2 == 3) {
            return new aayu();
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
        return abnv.L(aayu.class);
    }
}
