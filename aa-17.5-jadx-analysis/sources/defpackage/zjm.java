package defpackage;

/* loaded from: classes3.dex */
public final class zjm extends abnv implements abox {
    public static final zjm a;
    private abot b = abot.a;

    static {
        zjm zjmVar = new zjm();
        a = zjmVar;
        abnv.P(zjm.class, zjmVar);
    }

    private zjm() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0010\u0010\u0001\u0001\u0000\u0000\u00102", new Object[]{"b", new lds(abqd.STRING, "", abqd.MESSAGE, zjn.a)});
        }
        if (i2 == 3) {
            return new zjm();
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
        return abnv.L(zjm.class);
    }
}
