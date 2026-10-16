package defpackage;

/* loaded from: classes2.dex */
public final class otj extends abnv implements abox {
    public static final otj a;
    public String b = "";
    public String c = "";
    private int d;

    static {
        otj otjVar = new otj();
        a = otjVar;
        abnv.P(otj.class, otjVar);
    }

    private otj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new otj();
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
        return abnv.L(otj.class);
    }
}
