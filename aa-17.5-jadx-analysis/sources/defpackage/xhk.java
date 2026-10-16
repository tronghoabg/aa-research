package defpackage;

/* loaded from: classes.dex */
public final class xhk extends abnv implements abox {
    public static final xhk a;
    public int b;
    private int c;
    private byte d = 2;

    static {
        xhk xhkVar = new xhk();
        a = xhkVar;
        abnv.P(xhk.class, xhkVar);
    }

    private xhk() {
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
            return new xhk();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xhk.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
