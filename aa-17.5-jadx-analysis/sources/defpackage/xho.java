package defpackage;

/* loaded from: classes3.dex */
public final class xho extends abnv implements abox {
    public static final xho a;
    public int b;
    private byte d = 2;
    public int c = 1;

    static {
        xho xhoVar = new xho();
        a = xhoVar;
        abnv.P(xho.class, xhoVar);
    }

    private xho() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᴌ\u0000", new Object[]{"b", "c", xln.b});
        }
        if (i2 == 3) {
            return new xho();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xho.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
