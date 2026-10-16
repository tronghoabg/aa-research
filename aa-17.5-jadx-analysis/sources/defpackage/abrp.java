package defpackage;

/* loaded from: classes3.dex */
public final class abrp extends abnv implements abox {
    public static final abrp a;
    public Object c;
    public boolean e;
    private int g;
    public int b = 0;
    public String d = "";
    public int f = 1;

    static {
        abrp abrpVar = new abrp();
        a = abrpVar;
        abnv.P(abrp.class, abrpVar);
    }

    private abrp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001?\u0000\u0002\u083f\u0000\u0003ဈ\u0000\u0005ဇ\u0002\u0006᠌\u0003", new Object[]{"c", "b", "g", ywl.g, "d", "e", "f", abho.t});
        }
        if (i2 == 3) {
            return new abrp();
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
        return abnv.L(abrp.class);
    }
}
