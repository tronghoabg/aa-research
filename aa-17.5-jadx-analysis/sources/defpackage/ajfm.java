package defpackage;

/* loaded from: classes3.dex */
public final class ajfm extends abnv implements abox {
    public static final ajfm a;
    public int b;
    public long c;
    public long d;
    public long e;

    static {
        ajfm ajfmVar = new ajfm();
        a = ajfmVar;
        abnv.P(ajfm.class, ajfmVar);
    }

    private ajfm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ajfm();
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
        return abnv.L(ajfm.class);
    }
}
