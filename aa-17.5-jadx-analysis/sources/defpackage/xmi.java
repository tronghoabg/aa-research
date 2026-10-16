package defpackage;

/* loaded from: classes.dex */
public final class xmi extends abnv implements abox {
    public static final xmi a;
    public int b;
    public long c;
    private byte e = 2;
    public abms d = abms.d;

    static {
        xmi xmiVar = new xmi();
        a = xmiVar;
        abnv.P(xmi.class, xmiVar);
    }

    private xmi() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔂ\u0000\u0002ည\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new xmi();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xmi.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
