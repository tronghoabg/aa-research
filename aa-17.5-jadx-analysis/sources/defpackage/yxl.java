package defpackage;

/* loaded from: classes.dex */
public final class yxl extends abnv implements abox {
    public static final yxl a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;

    static {
        yxl yxlVar = new yxl();
        a = yxlVar;
        abnv.P(yxl.class, yxlVar);
    }

    private yxl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0003\u0004ဇ\u0004\u0005င\u0005\u0006ဇ\u0002", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
        }
        if (i2 == 3) {
            return new yxl();
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
        return abnv.L(yxl.class);
    }
}
