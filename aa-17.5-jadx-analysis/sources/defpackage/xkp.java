package defpackage;

/* loaded from: classes.dex */
public final class xkp extends abnv implements abox {
    public static final xkp a;
    public int b;
    public xhf d;
    private byte e = 2;
    public int c = 1;

    static {
        xkp xkpVar = new xkp();
        a = xkpVar;
        abnv.P(xkp.class, xkpVar);
    }

    private xkp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001᠌\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", otu.u, "d"});
        }
        if (i2 == 3) {
            return new xkp();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xkp.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
