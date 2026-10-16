package defpackage;

/* loaded from: classes.dex */
public final class xkc extends abnv implements abox {
    public static final xkc a;
    public int b;
    private int c;
    private byte d = 2;

    static {
        xkc xkcVar = new xkc();
        a = xkcVar;
        abnv.P(xkc.class, xkcVar);
    }

    private xkc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new xkc();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xkc.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
