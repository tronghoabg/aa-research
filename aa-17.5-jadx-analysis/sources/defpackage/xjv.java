package defpackage;

/* loaded from: classes.dex */
public final class xjv extends abnv implements abox {
    public static final xjv a;
    public int b;
    public int c;
    public int d;
    private byte f = 2;
    public int e = 1;

    static {
        xjv xjvVar = new xjv();
        a = xjvVar;
        abnv.P(xjv.class, xjvVar);
    }

    private xjv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", xln.d});
        }
        if (i2 == 3) {
            return new xjv();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xjv.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
