package defpackage;

/* loaded from: classes.dex */
public final class xnz extends abnv implements abox {
    public static final xnz a;
    public int b;
    public int c;
    public xnx d;
    public xko e;
    public xjw f;
    public xkp g;
    public xht h;
    public xnb i;
    public xlo j;
    public xoz k;
    public xpl l;
    public xif m;
    private xkn n;
    private xmf o;
    private xki p;
    private xjm q;
    private xim r;
    private xhu s;
    private xih t;
    private byte u = 2;

    static {
        xnz xnzVar = new xnz();
        a = xnzVar;
        abnv.P(xnz.class, xnzVar);
    }

    private xnz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.u);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0000\t\u0001ᔄ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fᐉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "n", "o", "p", "k", "q", "l", "m", "r", "s", "t"});
        }
        if (i2 == 3) {
            return new xnz();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xnz.class);
        }
        this.u = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
