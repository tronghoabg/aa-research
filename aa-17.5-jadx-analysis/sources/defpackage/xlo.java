package defpackage;

/* loaded from: classes.dex */
public final class xlo extends abnv implements abox {
    public static final xlo a;
    public int b;
    public int c;
    public xlm e;
    private byte f = 2;
    public int d = 1;

    static {
        xlo xloVar = new xlo();
        a = xloVar;
        abnv.P(xlo.class, xloVar);
    }

    private xlo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᴌ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d", xln.a, "e"});
        }
        if (i2 == 3) {
            return new xlo();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xlo.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
