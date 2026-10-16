package defpackage;

/* loaded from: classes.dex */
public final class xpd extends abnv implements abox {
    public static final xpd a;
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public xop l;
    public int c = 1;
    public int d = 1;
    public int k = 1;

    static {
        xpd xpdVar = new xpd();
        a = xpdVar;
        abnv.P(xpd.class, xpdVar);
    }

    private xpd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\bဋ\u0007\tဋ\b\n᠌\t\u000bဉ\n", new Object[]{"b", "c", xln.f, "d", xln.h, "e", "f", "g", "h", "i", "j", "k", otu.u, "l"});
        }
        if (i2 == 3) {
            return new xpd();
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
        return abnv.L(xpd.class);
    }
}
