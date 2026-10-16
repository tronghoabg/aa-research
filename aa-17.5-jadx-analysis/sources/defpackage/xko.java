package defpackage;

/* loaded from: classes.dex */
public final class xko extends abnv implements abox {
    public static final xko a;
    public int b;
    public aboh e;
    public aboh f;
    public int g;
    public int h;
    public int i;
    public int j;
    private byte k = 2;
    public int c = 1;
    public int d = 1;

    static {
        xko xkoVar = new xko();
        a = xkoVar;
        abnv.P(xko.class, xkoVar);
    }

    private xko() {
        abpf abpfVar = abpf.b;
        this.e = abpfVar;
        this.f = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0002\u0001\u0001᠌\u0000\u0002᠌\u0001\u0003Л\u0004\u001b\u0006ဋ\u0003\u0007᠌\u0004\b᠌\u0005\t᠌\u0006", new Object[]{"b", "c", otu.u, "d", otu.k, "e", xhf.class, "f", xpd.class, "g", "h", otu.n, "i", otu.t, "j", xln.e});
        }
        if (i2 == 3) {
            return new xko();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xko.class);
        }
        this.k = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
