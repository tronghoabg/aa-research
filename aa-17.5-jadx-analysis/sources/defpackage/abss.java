package defpackage;

/* loaded from: classes3.dex */
public final class abss extends abnv implements abox {
    public static final abss a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        abss abssVar = new abss();
        a = abssVar;
        abnv.P(abss.class, abssVar);
    }

    private abss() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abss();
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
        return abnv.L(abss.class);
    }
}
