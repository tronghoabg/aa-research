package defpackage;

/* loaded from: classes3.dex */
public final class adci extends abnv implements abox {
    public static final adci a;
    public int b;
    public int c;
    public String d = "";
    public long e;
    private int f;

    static {
        adci adciVar = new adci();
        a = adciVar;
        abnv.P(adci.class, adciVar);
    }

    private adci() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"f", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new adci();
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
        return abnv.L(adci.class);
    }
}
