package defpackage;

/* loaded from: classes.dex */
public final class xkq extends abnv implements abox {
    public static final xkq a;
    public int b;
    public abnf c;
    public long d;
    public long e;
    public long f;
    public xhe g;
    public xhe h;
    public xhe i;
    public xhe j;
    public long k;
    public long l;
    public xhe m;
    public xhe n;
    public xhe o;
    public long p;
    public long q;

    static {
        xkq xkqVar = new xkq();
        a = xkqVar;
        abnv.P(xkq.class, xkqVar);
    }

    private xkq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဂ\b\nဂ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဂ\r\u000fဂ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
        }
        if (i2 == 3) {
            return new xkq();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(xkq.class);
    }
}
