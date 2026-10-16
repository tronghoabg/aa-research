package defpackage;

/* loaded from: classes.dex */
public final class xmd extends abnv implements abox {
    public static final xmd a;
    public int b;
    public int d;
    private byte e = 2;
    public aboh c = abpf.b;

    static {
        xmd xmdVar = new xmd();
        a = xmdVar;
        abnv.P(xmd.class, xmdVar);
    }

    private xmd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဋ\u0000", new Object[]{"b", "c", xmb.class, "d"});
        }
        if (i2 == 3) {
            return new xmd();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xmd.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
