package defpackage;

/* loaded from: classes2.dex */
public final class ajei extends abnv implements abox {
    public static final ajei a;
    public int b;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public ajeh l;
    public ajey m;
    public ajgx n;
    public ajgz o;
    public absp p;
    private byte q = 2;
    public String c = "";

    static {
        ajei ajeiVar = new ajei();
        a = ajeiVar;
        abnv.P(ajei.class, ajeiVar);
    }

    private ajei() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.q);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0002\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0006\u0007ဂ\u0007\bဇ\b\tဉ\t\nဂ\u0005\u000bᐉ\n\fᐉ\u000b\rဉ\f\u000eဉ\r", new Object[]{"b", "c", "d", xln.m, "e", "f", xln.l, "g", "i", "j", "k", "l", "h", "m", "n", "o", "p"});
        }
        if (i2 == 3) {
            return new ajei();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajei.class);
        }
        this.q = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
