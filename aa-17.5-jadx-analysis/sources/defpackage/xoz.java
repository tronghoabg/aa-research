package defpackage;

/* loaded from: classes.dex */
public final class xoz extends abnv implements abox {
    public static final xoz a;
    public int b;
    private byte f = 2;
    public String c = "";
    public aboh d = abpf.b;
    public abms e = abms.d;

    static {
        xoz xozVar = new xoz();
        a = xozVar;
        abnv.P(xoz.class, xozVar);
    }

    private xoz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᔈ\u0000\u0002\u001a\u0003ည\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new xoz();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xoz.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
