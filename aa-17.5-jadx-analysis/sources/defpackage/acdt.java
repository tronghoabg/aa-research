package defpackage;

/* loaded from: classes3.dex */
public final class acdt extends abnv implements abox {
    public static final acdt a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public int f;

    static {
        acdt acdtVar = new acdt();
        a = acdtVar;
        abnv.P(acdt.class, acdtVar);
    }

    private acdt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004᠌\u0003", new Object[]{"b", "c", absk.p, "d", "e", "f", absk.q});
        }
        if (i2 == 3) {
            return new acdt();
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
        return abnv.L(acdt.class);
    }
}
