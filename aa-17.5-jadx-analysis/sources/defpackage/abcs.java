package defpackage;

/* loaded from: classes3.dex */
public final class abcs extends abns implements abcu {
    public static final abcs a;
    public int b;
    public abco c;
    public abco d;
    public abag e;
    public abdy f;
    public int h;
    public int i;
    public int j;
    public int k;
    public int n;
    public int o;
    public aboh q;
    public aboh r;
    public aboh s;
    public aboh t;
    public abdl u;
    public int v;
    private aben x;
    private byte y = 2;
    public int g = 9;
    public int l = -1;
    public long m = -1;
    public abod p = abnw.a;

    static {
        abcs abcsVar = new abcs();
        a = abcsVar;
        abnv.P(abcs.class, abcsVar);
    }

    private abcs() {
        abpf abpfVar = abpf.b;
        this.q = abpfVar;
        this.r = abpfVar;
        this.s = abpfVar;
        this.t = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.y);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0015\u0000\u0001\u0001Ϩ\u0015\u0000\u0005\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ဂ\r\u0007᠌\u0005\bင\f\tင\u000e\nဆ\u000f\u000bင\u0007\fင\b\rင\t\u000eင\u0006\u0010'\u0011\u001b\u0012Л\u0013\u001b\u0014\u001b\u0016ᐉ\u0010\u001eဉ\u0014Ϩင\u0015", new Object[]{"b", "c", "d", "e", "f", "m", "g", abce.d, "l", "n", "o", "i", "j", "k", "h", "p", "q", abao.class, "r", abcq.class, "s", abcr.class, "t", abbo.class, "u", "x", "v"});
        }
        if (i2 == 3) {
            return new abcs();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abcs.class);
        }
        this.y = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    @Override // defpackage.abcu
    public final abco b() {
        abco abcoVar = this.c;
        return abcoVar == null ? abco.a : abcoVar;
    }

    @Override // defpackage.abcu
    public final abco c() {
        abco abcoVar = this.d;
        return abcoVar == null ? abco.a : abcoVar;
    }

    @Override // defpackage.abcu
    public final boolean d() {
        return (this.b & 2) != 0;
    }
}
