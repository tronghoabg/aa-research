package defpackage;

/* loaded from: classes2.dex */
public final class osy extends abnv implements abox {
    public static final osy a;
    public static final abnh c;
    public int b;
    private int d;

    static {
        osy osyVar = new osy();
        a = osyVar;
        abnv.P(osy.class, osyVar);
        c = abnv.W(osn.a, osyVar, osyVar, null, 111, abqd.MESSAGE);
    }

    private osy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new osy();
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
        return abnv.L(osy.class);
    }
}
