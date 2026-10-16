package defpackage;

/* loaded from: classes.dex */
public final class xhg extends abnv implements abox {
    public static final xhg a;
    public int b;
    public boolean c;
    private int d;
    private byte e = 2;

    static {
        xhg xhgVar = new xhg();
        a = xhgVar;
        abnv.P(xhg.class, xhgVar);
    }

    private xhg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᴌ\u0000\u0002ဇ\u0001", new Object[]{"d", "b", otu.j, "c"});
        }
        if (i2 == 3) {
            return new xhg();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xhg.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
