package defpackage;

/* loaded from: classes3.dex */
public final class xks extends abnv implements abox {
    public static final xks a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    private byte g = 2;

    static {
        xks xksVar = new xks();
        a = xksVar;
        abnv.P(xks.class, xksVar);
    }

    private xks() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new xks();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xks.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
