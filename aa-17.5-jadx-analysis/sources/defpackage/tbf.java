package defpackage;

/* loaded from: classes3.dex */
public final class tbf extends abnv implements abox {
    public static final tbf a;
    public int b;
    public long d;
    public boolean f;
    public int j;
    public tba m;
    public int n;
    public String c = "";
    public String e = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public abms k = abms.d;
    public String l = "";

    static {
        tbf tbfVar = new tbf();
        a = tbfVar;
        abnv.P(tbf.class, tbfVar);
    }

    private tbf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007\tည\b\nဈ\t\u000bဉ\n\fင\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        }
        if (i2 == 3) {
            return new tbf();
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
        return abnv.L(tbf.class);
    }
}
