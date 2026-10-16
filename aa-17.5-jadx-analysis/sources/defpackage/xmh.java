package defpackage;

/* loaded from: classes.dex */
public final class xmh extends abnv implements abox {
    public static final xmh a;
    public int b;
    public long c;
    public boolean d;
    private byte f = 2;
    public abms e = abms.d;

    static {
        xmh xmhVar = new xmh();
        a = xmhVar;
        abnv.P(xmh.class, xmhVar);
    }

    private xmh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔂ\u0000\u0002ဇ\u0001\u0003ည\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new xmh();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xmh.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
