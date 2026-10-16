package defpackage;

/* loaded from: classes.dex */
public final class xhq extends abnv implements abox {
    public static final xhq a;
    public int b;
    private byte e = 2;
    public String c = "";
    public int d = -1;

    static {
        xhq xhqVar = new xhq();
        a = xhqVar;
        abnv.P(xhq.class, xhqVar);
    }

    private xhq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᴌ\u0001", new Object[]{"b", "c", "d", otu.l});
        }
        if (i2 == 3) {
            return new xhq();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xhq.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
