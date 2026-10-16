package defpackage;

/* loaded from: classes3.dex */
public final class xig extends abnv implements abox {
    public static final xig a;
    public String b = "";
    private int c;

    static {
        xig xigVar = new xig();
        a = xigVar;
        abnv.P(xig.class, xigVar);
    }

    private xig() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new xig();
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
        return abnv.L(xig.class);
    }
}
