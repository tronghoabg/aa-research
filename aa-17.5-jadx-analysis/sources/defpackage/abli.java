package defpackage;

/* loaded from: classes3.dex */
public final class abli extends abnv implements abox {
    public static final abli a;
    private abot b = abot.a;

    static {
        abli abliVar = new abli();
        a = abliVar;
        abnv.P(abli.class, abliVar);
    }

    private abli() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0001\u0000\u0000\u00042", new Object[]{"b", new lds(abqd.STRING, "", abqd.MESSAGE, ablh.a)});
        }
        if (i2 == 3) {
            return new abli();
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
        return abnv.L(abli.class);
    }
}
