package defpackage;

/* loaded from: classes.dex */
public final class xnu extends abnv implements abox {
    public static final xnu a;
    public int b;
    public long d;
    private byte e = 2;
    public int c = 1;

    static {
        xnu xnuVar = new xnu();
        a = xnuVar;
        abnv.P(xnu.class, xnuVar);
    }

    private xnu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᔂ\u0001", new Object[]{"b", "c", xln.c, "d"});
        }
        if (i2 == 3) {
            return new xnu();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xnu.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
