package defpackage;

/* loaded from: classes.dex */
public final class kqh extends abnv implements abox {
    public static final kqh a;
    public abot b = abot.a;

    static {
        kqh kqhVar = new kqh();
        a = kqhVar;
        abnv.P(kqh.class, kqhVar);
    }

    private kqh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new lds(abqd.STRING, "", abqd.MESSAGE, kqi.a)});
        }
        if (i2 == 3) {
            return new kqh();
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
        return abnv.L(kqh.class);
    }
}
