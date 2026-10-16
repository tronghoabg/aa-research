package defpackage;

/* loaded from: classes3.dex */
public final class abwt extends abnv implements abox {
    public static final abwt a;
    private abot b = abot.a;

    static {
        abwt abwtVar = new abwt();
        a = abwtVar;
        abnv.P(abwt.class, abwtVar);
    }

    private abwt() {
        Object[] objArr = abpf.a;
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000**\u0001\u0001\u0000\u0000*2", new Object[]{"b", new lds(abqd.STRING, "", abqd.MESSAGE, acba.a)});
        }
        if (i2 == 3) {
            return new abwt();
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
        return abnv.L(abwt.class);
    }
}
