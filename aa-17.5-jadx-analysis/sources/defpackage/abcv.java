package defpackage;

/* loaded from: classes3.dex */
public final class abcv extends abnv implements abox {
    public static final abcv a;
    public int b;
    public int c;
    public int d;
    public aboh e;
    public abod f;
    public abbt g;
    public abew h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public abau q;
    public int r;
    public int s;
    public abal t;
    public int u;
    public int v;
    public aboh w;
    private byte x = 2;

    static {
        abcv abcvVar = new abcv();
        a = abcvVar;
        abnv.P(abcv.class, abcvVar);
    }

    private abcv() {
        abpf abpfVar = abpf.b;
        this.e = abpfVar;
        this.f = abnw.a;
        this.j = 1;
        this.k = 1;
        this.w = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.x);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0003\u0002\u0001ဆ\u0000\u0002ဆ\u0002\u0003Л\u0004ဉ\u0005\u0005ᐉ\u0006\u0006င\b\u0007ဇ\u000b\b'\t᠌\t\n᠌\n\u000bဏ\f\fဏ\r\rဏ\u000e\u000e᠌\u0012\u000fဉ\u0013\u0010င\u0015\u0011င\u0014\u0012ဉ\u0016\u0013င\u0017\u0014\u001b\u0015င\u0018", new Object[]{"b", "c", "d", "e", abbz.class, "g", "h", "i", "l", "f", "j", zli.q, "k", abce.e, "m", "n", "o", "p", abce.f, "q", "s", "r", "t", "u", "w", abcp.class, "v"});
        }
        if (i2 == 3) {
            return new abcv();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abcv.class);
        }
        this.x = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
