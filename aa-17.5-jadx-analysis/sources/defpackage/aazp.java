package defpackage;

/* loaded from: classes3.dex */
public final class aazp extends abnv implements abox {
    public static final aazp a;
    public static final abnh b;
    public static final abnh c;

    static {
        aazp aazpVar = new aazp();
        a = aazpVar;
        abnv.P(aazp.class, aazpVar);
        b = abnv.W(abcs.a, aazpVar, aazpVar, null, 259960600, abqd.MESSAGE);
        c = abnv.W(abdd.a, aazpVar, aazpVar, null, 367504627, abqd.MESSAGE);
    }

    private aazp() {
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aazp();
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
        return abnv.L(aazp.class);
    }
}
