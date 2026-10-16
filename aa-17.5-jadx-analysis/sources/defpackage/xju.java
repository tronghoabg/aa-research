package defpackage;

/* loaded from: classes.dex */
public final class xju extends abnv implements abox {
    public static final xju a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    private byte k = 2;

    static {
        xju xjuVar = new xju();
        a = xjuVar;
        abnv.P(xju.class, xjuVar);
    }

    private xju() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new xju();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xju.class);
        }
        this.k = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
