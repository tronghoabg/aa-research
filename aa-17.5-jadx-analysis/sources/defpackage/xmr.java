package defpackage;

/* loaded from: classes3.dex */
public final class xmr extends abnv implements abox {
    public static final xmr a;
    public int b;
    public xna f;
    public xmq g;
    public xne h;
    public int k;
    public boolean l;
    public boolean m;
    public boolean o;
    public String c = "";
    public String d = "";
    public String e = "";
    public String i = "";
    public String j = "";
    public String n = "";

    static {
        xmr xmrVar = new xmr();
        a = xmrVar;
        abnv.P(xmr.class, xmrVar);
    }

    private xmr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဈ\u0006\bဈ\u0007\tဋ\b\nဇ\t\u000bဇ\n\fဈ\u000b\rဇ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        }
        if (i2 == 3) {
            return new xmr();
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
        return abnv.L(xmr.class);
    }
}
