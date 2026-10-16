package defpackage;

/* loaded from: classes.dex */
public final class xiq extends abnv implements abox {
    public static final xiq a;
    public int b;
    public int c;
    public int d;
    private byte e = 2;

    static {
        xiq xiqVar = new xiq();
        a = xiqVar;
        abnv.P(xiq.class, xiqVar);
    }

    private xiq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔏ\u0000\u0002ᔄ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new xiq();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xiq.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
