package defpackage;

/* loaded from: classes3.dex */
public final class abcq extends abns implements abnt {
    public static final abcq a;
    public int b;
    public int c;
    public abco d;
    public abco e;
    public int g;
    public abcs i;
    public int j;
    private byte k = 2;
    public long f = -1;
    public aboh h = abpf.b;

    static {
        abcq abcqVar = new abcq();
        a = abcqVar;
        abnv.P(abcq.class, abcqVar);
    }

    private abcq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0003\u0001င\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဂ\u0003\u0005င\u0006\u0006\u001b\u0007ᐉ\u0007\bင\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", abao.class, "i", "j"});
        }
        if (i2 == 3) {
            return new abcq();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abcq.class);
        }
        this.k = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
