package defpackage;

/* loaded from: classes3.dex */
public final class abdd extends abns implements abnt {
    public static final abdd a;
    public int b;
    public int d;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public long n;
    public int o;
    public int p;
    public abdl q;
    private byte r = 2;
    public abms c = abms.d;
    public abod e = abnw.a;
    public abog f = abor.a;
    public int g = 1;
    public int h = 1;

    static {
        abdd abddVar = new abdd();
        a = abddVar;
        abnv.P(abdd.class, abddVar);
    }

    private abdd() {
        Object[] objArr = abpf.a;
        this.m = -1;
        this.n = -1L;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.r);
        }
        if (i2 == 2) {
            abob abobVar = abce.h;
            return new abpg(a, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0002\u0001\u0001ည\u0000\u0002'\u0003င\t\u0004င\u000b\u0005ဆ\f\u0006᠌\u0003\u0007င\u0001\b᠌\u0004\nင\u0006\u000bဂ\n\f%\rင\u0007\u000eင\b\u000f᠌\u0005\u0011ᐉ\u000e", new Object[]{"b", "c", "e", "m", "o", "p", "g", abobVar, "d", "h", abobVar, "j", "n", "f", "k", "l", "i", abce.a, "q"});
        }
        if (i2 == 3) {
            return new abdd();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abdd.class);
        }
        this.r = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
