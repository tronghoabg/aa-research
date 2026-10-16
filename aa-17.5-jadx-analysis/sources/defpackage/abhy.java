package defpackage;

/* loaded from: classes3.dex */
public final class abhy extends abnv implements abox {
    public static final abhy a;
    public int b;
    public abhl c;
    public abfy f;
    private abbi h;
    private byte i = 2;
    public abms d = abms.d;
    public aboh e = abpf.b;
    public int g = 1;

    static {
        abhy abhyVar = new abhy();
        a = abhyVar;
        abnv.P(abhy.class, abhyVar);
    }

    private abhy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0002\u0001ဉ\u0000\u0002ᐉ\u0002\u0003Л\u0004᠌\u0004\u0007ဉ\u0003\bည\u0001", new Object[]{"b", "c", "h", "e", abda.class, "g", abho.j, "f", "d"});
        }
        if (i2 == 3) {
            return new abhy();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abhy.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
