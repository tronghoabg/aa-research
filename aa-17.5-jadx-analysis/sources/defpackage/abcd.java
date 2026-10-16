package defpackage;

/* loaded from: classes3.dex */
public final class abcd extends abnv implements abox {
    public static final abcd a;
    public int b;
    public long f;
    public long g;
    public ablp h;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public boolean q;
    public String c = "";
    public String d = "";
    public String e = "";
    public String i = "";
    public String j = "";

    static {
        abcd abcdVar = new abcd();
        a = abcdVar;
        abnv.P(abcd.class, abcdVar);
    }

    private abcd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u000f\u0000\u0001\u0001\u0016\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003စ\u0004\u0004စ\u0005\u0005ဈ\t\u0006ဇ\u000b\bဇ\u000e\tဈ\u0003\nဇ\u000f\rဈ\n\u000eင\u0010\u000fင\u0012\u0010ဇ\f\u0014ဉ\u0007\u0016ဇ\u0015", new Object[]{"b", "c", "d", "f", "g", "i", "k", "m", "e", "n", "j", "o", "p", "l", "h", "q"});
        }
        if (i2 == 3) {
            return new abcd();
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
        return abnv.L(abcd.class);
    }
}
