package defpackage;

/* loaded from: classes3.dex */
public final class zqp extends abnv implements abox {
    public static final zqp a;
    public int b;
    public String c = "";
    public int d;

    static {
        zqp zqpVar = new zqp();
        a = zqpVar;
        abnv.P(zqp.class, zqpVar);
    }

    private zqp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", zli.f});
        }
        if (i2 == 3) {
            return new zqp();
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
        return abnv.L(zqp.class);
    }
}
