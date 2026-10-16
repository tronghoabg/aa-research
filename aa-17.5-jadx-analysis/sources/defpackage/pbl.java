package defpackage;

/* loaded from: classes2.dex */
public final class pbl extends abnv implements abox {
    public static final pbl a;
    public int b;
    public String c = "";
    public String d = "";
    public abod e = abnw.a;

    static {
        pbl pblVar = new pbl();
        a = pblVar;
        abnv.P(pbl.class, pblVar);
    }

    private pbl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u0016", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new pbl();
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
        return abnv.L(pbl.class);
    }
}
