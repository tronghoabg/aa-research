package defpackage;

/* loaded from: classes3.dex */
public final class xly extends abnv implements abox {
    public static final xly a;
    public boolean b;
    private int c;
    private byte d = 2;

    static {
        xly xlyVar = new xly();
        a = xlyVar;
        abnv.P(xly.class, xlyVar);
    }

    private xly() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔇ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new xly();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xly.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
