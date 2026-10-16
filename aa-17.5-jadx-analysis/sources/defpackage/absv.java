package defpackage;

/* loaded from: classes3.dex */
public final class absv extends abnv implements abox {
    public static final absv a;
    private int b;
    private int c;
    private abtx d;
    private absz e;
    private abtf f;
    private abuc g;
    private abtd h;
    private abta i;
    private abtz j;
    private abub k;
    private abtm l;
    private abte m;
    private absw n;
    private abtj o;
    private abtl p;
    private abth q;
    private abtk r;
    private abtg s;
    private abti t;
    private abtc u;
    private byte v = 2;

    static {
        absv absvVar = new absv();
        a = absvVar;
        abnv.P(absv.class, absvVar);
    }

    private absv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.v);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0012\u0000\u0002\u0001/\u0012\u0000\u0000\u000f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0005\u000fᐉ\u000e\u0010ᐉ\u000f\u0012ᐉ\u0011\u0015ᐉ\u0014\u0017ဉ\u0016\u0018ᐉ\u0017\u001eᐉ\u001c\u001fဉ\u001d!ဉ\u001f'ᐉ%+ᐉ),ᐉ*-ᐉ+/ᐉ-", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"});
        }
        if (i2 == 3) {
            return new absv();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(absv.class);
        }
        this.v = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
