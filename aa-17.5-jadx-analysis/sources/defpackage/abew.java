package defpackage;

/* loaded from: classes3.dex */
public final class abew extends abnv implements abox {
    public static final aboe a = new wbk(13);
    public static final abew b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public abod j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public aboh r;
    public abod s;
    public float t;
    public float u;
    private byte v = 2;

    static {
        abew abewVar = new abew();
        b = abewVar;
        abnv.P(abew.class, abewVar);
    }

    private abew() {
        abnw abnwVar = abnw.a;
        this.j = abnwVar;
        Object[] objArr = abpf.a;
        this.p = 1;
        this.r = abpf.b;
        this.s = abnwVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.v);
        }
        if (i2 == 2) {
            return new abpg(b, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0003\u0001\u0001ဆ\u0000\u0002င\u0001\u0003ဆ\u0002\u0004င\u0003\u0005င\u0007\u0006Л\u0007ခ\u0012\bခ\u0013\t'\nင\u0004\u000bင\u0005\fࠞ\rင\n\u000eင\u000f\u000f᠌\u0010\u0010င\b\u0011ဆ\t\u0012ဇ\u0011", new Object[]{"c", "d", "e", "f", "g", "k", "r", abbz.class, "t", "u", "s", "h", "i", "j", zli.q, "n", "o", "p", abce.j, "l", "m", "q"});
        }
        if (i2 == 3) {
            return new abew();
        }
        if (i2 == 4) {
            return new abnp(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 == 6) {
            return abnv.L(abew.class);
        }
        this.v = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
