package defpackage;

/* loaded from: classes2.dex */
public final class lbp extends abnv implements abox {
    public static final lbp a;
    public int b;
    public long e;
    public aboh k;
    public aboh l;
    public boolean m;
    public boolean n;
    public String o;
    public String p;
    public String c = "";
    public String d = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";

    static {
        lbp lbpVar = new lbp();
        a = lbpVar;
        abnv.P(lbp.class, lbpVar);
    }

    private lbp() {
        abpf abpfVar = abpf.b;
        this.k = abpfVar;
        this.l = abpfVar;
        this.o = "";
        this.p = "";
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u000e\u0000\u0001\u0001\u0016\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဃ\u0002\u0005ဈ\u0003\fဈ\u0004\rဈ\u0005\u000eဈ\u0006\u000fဈ\u0007\u0011\u001b\u0012\u001b\u0013ဇ\t\u0014ဇ\n\u0015ဈ\u000b\u0016ဈ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", lbq.class, "l", lbr.class, "m", "n", "o", "p"});
        }
        if (i2 == 3) {
            return new lbp();
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
        return abnv.L(lbp.class);
    }
}
