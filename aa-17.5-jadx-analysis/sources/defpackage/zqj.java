package defpackage;

/* loaded from: classes3.dex */
public final class zqj extends abnv implements abox {
    public static final zqj a;
    public long b;
    public long c;
    private int d;

    static {
        zqj zqjVar = new zqj();
        a = zqjVar;
        abnv.P(zqj.class, zqjVar);
    }

    private zqj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဃ\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new zqj();
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
        return abnv.L(zqj.class);
    }
}
