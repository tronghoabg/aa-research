package defpackage;

/* loaded from: classes2.dex */
public final class osr extends abnv implements abox {
    public static final osr a;
    public int b;
    public int c;
    public long d;

    static {
        osr osrVar = new osr();
        a = osrVar;
        abnv.P(osr.class, osrVar);
    }

    private osr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005᠌\u0000\u0006ဂ\u0001", new Object[]{"b", "c", xou.u, "d"});
        }
        if (i2 == 3) {
            return new osr();
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
        return abnv.L(osr.class);
    }
}
