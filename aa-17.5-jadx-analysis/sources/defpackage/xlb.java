package defpackage;

/* loaded from: classes3.dex */
public final class xlb extends abnv implements abox {
    public static final xlb a;
    public int b;
    public String c = "";
    public xis d;

    static {
        xlb xlbVar = new xlb();
        a = xlbVar;
        abnv.P(xlb.class, xlbVar);
    }

    private xlb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new xlb();
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
        return abnv.L(xlb.class);
    }
}
