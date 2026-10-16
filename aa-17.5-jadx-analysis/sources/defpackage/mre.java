package defpackage;

/* loaded from: classes2.dex */
public final class mre extends abnv implements abox {
    public static final mre a;
    public int b;
    public String c = "";

    static {
        mre mreVar = new mre();
        a = mreVar;
        abnv.P(mre.class, mreVar);
    }

    private mre() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new mre();
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
        return abnv.L(mre.class);
    }
}
