package defpackage;

/* loaded from: classes.dex */
public final class xof extends abnv implements abox {
    public static final xof a;
    public int b;
    private byte d = 2;
    public int c = 1;

    static {
        xof xofVar = new xof();
        a = xofVar;
        abnv.P(xof.class, xofVar);
    }

    private xof() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᴌ\u0000", new Object[]{"b", "c", otu.u});
        }
        if (i2 == 3) {
            return new xof();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xof.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
