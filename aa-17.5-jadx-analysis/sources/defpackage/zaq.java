package defpackage;

/* loaded from: classes3.dex */
public final class zaq extends abnv implements abox {
    public static final zaq a;
    private int b;
    private xvb c;
    private xvb d;
    private xvb e;

    static {
        zaq zaqVar = new zaq();
        a = zaqVar;
        abnv.P(zaq.class, zaqVar);
    }

    private zaq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new zaq();
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
        return abnv.L(zaq.class);
    }
}
