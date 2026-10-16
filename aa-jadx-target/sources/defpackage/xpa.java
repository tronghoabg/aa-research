package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xpa extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xpa a;
    public int b;
    public int c;
    public defpackage.xoy d;
    public defpackage.xlp e;
    public defpackage.xkx f;
    public defpackage.xlq g;
    public defpackage.xiu h;
    public defpackage.xoc i;
    public defpackage.xmp j;
    public defpackage.xqa k;
    public defpackage.xqm l;
    public defpackage.xjg m;
    private defpackage.xlo n;
    private defpackage.xng o;
    private defpackage.xlj p;
    private defpackage.xkn q;
    private defpackage.xjn r;
    private defpackage.xiv s;
    private defpackage.xji t;
    private byte u = 2;

    static {
        defpackage.xpa xpaVar = new defpackage.xpa();
        a = xpaVar;
        defpackage.abox.P(defpackage.xpa.class, xpaVar);
    }

    private xpa() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.u);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0000\t\u0001ᔄ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fᐉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "n", "o", "p", "k", "q", "l", "m", "r", "s", "t"});
        }
        if (i2 == 3) {
            return new defpackage.xpa();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xpa.class);
        }
        this.u = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
