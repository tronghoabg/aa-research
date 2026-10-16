package defpackage;

/* loaded from: classes3.dex */
public final class abje extends abns implements abnt {
    public static final abje a;
    public int b;
    public Object d;
    public long e;
    public aboh f;
    public float g;
    public float h;
    public int i;
    public int j;
    public boolean k;
    public abdl l;
    public int m;
    public boolean n;
    public int o;
    public aboh p;
    public abod q;
    public int r;
    public int s;
    public int t;
    public float u;
    public int c = 0;
    private byte v = 2;

    static {
        abje abjeVar = new abje();
        a = abjeVar;
        abnv.P(abje.class, abjeVar);
    }

    private abje() {
        abpf abpfVar = abpf.b;
        this.f = abpfVar;
        this.i = 1;
        this.j = 1;
        this.p = abpfVar;
        this.q = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.v);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0013\u0001\u0001\u0001\u0018\u0013\u0000\u0003\u0001\u0001စ\u0000\u0002<\u0000\u0003<\u0000\u0004\u001b\u0005ခ\u0001\u0006ခ\u0002\u0007ᐉ\u0006\b᠌\u0007\tဇ\b\u000bင\n\f\u001b\rင\u000b\u000eဆ\f\u0011င\u000e\u0013ဇ\u0005\u0015ࠬ\u0016ခ\u0011\u0017᠌\u0004\u0018᠌\u0003", new Object[]{"d", "c", "b", "e", abkc.class, abip.class, "f", abjb.class, "g", "h", "l", "m", abho.d, "n", "o", "p", abht.class, "r", "s", "t", "k", "q", abho.g, "u", "j", abho.i, "i", abho.k});
        }
        if (i2 == 3) {
            return new abje();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abje.class);
        }
        this.v = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
