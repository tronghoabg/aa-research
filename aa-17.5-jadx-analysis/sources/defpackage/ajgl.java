package defpackage;

/* loaded from: classes2.dex */
public final class ajgl extends abns implements abnt {
    public static final ajgl a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ajgp j;
    public int l;
    public int m;
    public int n;
    public ajgp o;
    public int p;
    private byte q = 2;
    public aboh k = abpf.b;

    static {
        ajgl ajglVar = new ajgl();
        a = ajglVar;
        abnv.P(ajgl.class, ajglVar);
    }

    private ajgl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.q);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0006င\b\u0007င\u0002\bင\u0004\tင\u0005\nဉ\u0007\u000bင\t\fင\n\rဉ\u000b\u000eင\f", new Object[]{"b", "c", "d", "f", "i", "k", ajgk.class, "l", "e", "g", "h", "j", "m", "n", "o", "p"});
        }
        if (i2 == 3) {
            return new ajgl();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajgl.class);
        }
        this.q = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
