package defpackage;

/* loaded from: classes3.dex */
public final class tba extends abnv implements abox {
    public static final tba a;
    public int b;
    public boolean d;
    public String c = "";
    public String e = "";
    public aboh f = abpf.b;

    static {
        tba tbaVar = new tba();
        a = tbaVar;
        abnv.P(tba.class, tbaVar);
    }

    private tba() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", "f", tbb.class});
        }
        if (i2 == 3) {
            return new tba();
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
        return abnv.L(tba.class);
    }
}
