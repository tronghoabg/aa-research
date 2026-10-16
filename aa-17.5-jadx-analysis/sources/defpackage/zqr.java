package defpackage;

/* loaded from: classes3.dex */
public final class zqr extends abnv implements abox {
    public static final zqr a;
    public int b;
    public zqu c;
    public int d;
    public long e;

    static {
        zqr zqrVar = new zqr();
        a = zqrVar;
        abnv.P(zqr.class, zqrVar);
    }

    private zqr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဂ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new zqr();
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
        return abnv.L(zqr.class);
    }
}
