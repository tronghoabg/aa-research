package defpackage;

/* loaded from: classes3.dex */
public final class acdb extends abnv implements abox {
    public static final acdb a;
    public int b;
    public int d;
    public String c = "";
    public String e = "";

    static {
        acdb acdbVar = new acdb();
        a = acdbVar;
        abnv.P(acdb.class, acdbVar);
    }

    private acdb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဏ\u0001\u0004ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new acdb();
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
        return abnv.L(acdb.class);
    }
}
