package defpackage;

/* loaded from: classes3.dex */
public final class acbs extends abnv implements abox {
    public static final acbs a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public abgf h;
    public boolean j;
    public aauw k;
    public acbr p;
    public String i = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";

    static {
        acbs acbsVar = new acbs();
        a = acbsVar;
        abnv.P(acbs.class, acbsVar);
    }

    private acbs() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0003\u0004ဉ\u0005\u0005ဈ\u0006\u0006ဇ\u0004\bဉ\t\tဇ\u0002\nဈ\n\u000bဈ\u000b\fဈ\f\rဈ\r\u000eဇ\b\u000fဉ\u000e", new Object[]{"b", "c", "d", "f", "h", "i", "g", "k", "e", "l", "m", "n", "o", "j", "p"});
        }
        if (i2 == 3) {
            return new acbs();
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
        return abnv.L(acbs.class);
    }
}
