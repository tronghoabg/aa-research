package defpackage;

/* loaded from: classes2.dex */
public final class otd extends abnv implements abox {
    public static final otd a;
    public static final abnh b;

    static {
        otd otdVar = new otd();
        a = otdVar;
        abnv.P(otd.class, otdVar);
        b = abnv.W(osn.a, otdVar, otdVar, null, 109, abqd.MESSAGE);
    }

    private otd() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new otd();
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
        return abnv.L(otd.class);
    }
}
