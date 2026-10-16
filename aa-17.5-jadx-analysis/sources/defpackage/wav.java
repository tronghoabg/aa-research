package defpackage;

/* loaded from: classes.dex */
public final class wav extends abnv implements abox {
    public static final wav a;
    public int b;
    public wau d;
    public String c = "";
    public String e = "";

    static {
        wav wavVar = new wav();
        a = wavVar;
        abnv.P(wav.class, wavVar);
    }

    private wav() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wav();
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
        return abnv.L(wav.class);
    }
}
