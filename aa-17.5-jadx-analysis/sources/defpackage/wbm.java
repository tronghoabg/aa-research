package defpackage;

/* loaded from: classes.dex */
public final class wbm extends abnv implements abox {
    public static final wbm a;
    public String b = "";
    public long c;
    private int d;

    static {
        wbm wbmVar = new wbm();
        a = wbmVar;
        abnv.P(wbm.class, wbmVar);
    }

    private wbm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new wbm();
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
        return abnv.L(wbm.class);
    }
}
