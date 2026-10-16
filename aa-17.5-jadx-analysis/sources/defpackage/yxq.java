package defpackage;

/* loaded from: classes.dex */
public final class yxq extends abnv implements abox {
    public static final yxq a;
    public int b;
    public int j;
    public int k;
    public int m;
    public abod n;
    public abod o;
    public abod p;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String l = "";

    static {
        yxq yxqVar = new yxq();
        a = yxqVar;
        abnv.P(yxq.class, yxqVar);
    }

    private yxq() {
        abnw abnwVar = abnw.a;
        this.n = abnwVar;
        this.o = abnwVar;
        this.p = abnwVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\nင\t\u000bင\n\fဈ\u000b\rင\f\u000e\u0016\u000f\u0016\u0010\u0016", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        }
        if (i2 == 3) {
            return new yxq();
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
        return abnv.L(yxq.class);
    }
}
