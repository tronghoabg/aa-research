package defpackage;

/* loaded from: classes3.dex */
public final class acfs extends abnv implements abox {
    public static final acfs a;
    public long b = 33554432;
    public double c = 0.25d;
    public double d = 0.8d;
    public double e = 0.9d;
    public int f = 604800000;
    public long g = 3145728;
    public boolean h;
    public int i;
    private int j;

    static {
        acfs acfsVar = new acfs();
        a = acfsVar;
        abnv.P(acfs.class, acfsVar);
    }

    private acfs() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\b\u0000\u0001\u0002\u000e\b\u0000\u0000\u0000\u0002ဂ\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004\u0007င\u0006\bဂ\u0007\rဇ\f\u000eင\r", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new acfs();
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
        return abnv.L(acfs.class);
    }
}
