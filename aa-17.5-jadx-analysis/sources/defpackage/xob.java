package defpackage;

/* loaded from: classes.dex */
public final class xob extends abnv implements abox {
    public static final xob a;
    public int b;
    public int h;
    public boolean m;
    public int n;
    public boolean p;
    public xgr q;
    private byte r = 2;
    public aboh c = abpf.b;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String o = "";

    static {
        xob xobVar = new xob();
        a = xobVar;
        abnv.P(xob.class, xobVar);
    }

    private xob() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.r);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006᠌\u0004\u0007ဈ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဇ\t\rင\n\u000eဈ\u000b\u000fဇ\f\u0011ဉ\u000e", new Object[]{"b", "c", xnz.class, "d", "e", "f", "g", "h", otu.o, "i", "j", "k", "l", "m", "n", "o", "p", "q"});
        }
        if (i2 == 3) {
            return new xob();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xob.class);
        }
        this.r = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
