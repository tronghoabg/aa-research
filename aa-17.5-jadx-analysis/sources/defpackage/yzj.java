package defpackage;

/* loaded from: classes.dex */
public final class yzj extends abnv implements abox {
    public static final yzj a;
    public int b;
    public long c;
    public long d;

    static {
        yzj yzjVar = new yzj();
        a = yzjVar;
        abnv.P(yzj.class, yzjVar);
    }

    private yzj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new yzj();
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
        return abnv.L(yzj.class);
    }
}
