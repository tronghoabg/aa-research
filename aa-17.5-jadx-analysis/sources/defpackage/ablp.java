package defpackage;

/* loaded from: classes3.dex */
public final class ablp extends abnv implements abox {
    public static final ablp a;
    public zki b;
    private int c;

    static {
        ablp ablpVar = new ablp();
        a = ablpVar;
        abnv.P(ablp.class, ablpVar);
    }

    private ablp() {
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new ablp();
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
        return abnv.L(ablp.class);
    }
}
