package defpackage;

/* loaded from: classes3.dex */
public final class zll extends abnv implements abox {
    public static final zll a;
    public double b;
    public double c;
    private int d;

    static {
        zll zllVar = new zll();
        a = zllVar;
        abnv.P(zll.class, zllVar);
    }

    private zll() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new zll();
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
        return abnv.L(zll.class);
    }
}
