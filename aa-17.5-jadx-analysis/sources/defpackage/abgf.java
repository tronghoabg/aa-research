package defpackage;

/* loaded from: classes3.dex */
public final class abgf extends abnv implements abox {
    public static final abgf a;
    public int b;
    public float l;
    public boolean n;
    public abgv o;
    public int p;
    public boolean s;
    public int t;
    public boolean u;
    public boolean v;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public abod m = abnw.a;
    public aboh q = abpf.b;
    public String r = "";

    static {
        abgf abgfVar = new abgf();
        a = abgfVar;
        abnv.P(abgf.class, abgfVar);
    }

    private abgf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0014\u0000\u0001\u0001\u001b\u0014\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\bဈ\t\tခ\n\n\u0016\u000bဇ\u000b\fဈ\u0006\rဈ\u0007\u000eဉ\f\u000f᠌\r\u0010ဈ\b\u0012\u001a\u0013ဈ\u0011\u0016ဇ\u0014\u0018င\u0015\u001aဇ\u0016\u001bဇ\u0017", new Object[]{"b", "c", "d", "e", "f", "g", "k", "l", "m", "n", "h", "i", "o", "p", abce.o, "j", "q", "r", "s", "t", "u", "v"});
        }
        if (i2 == 3) {
            return new abgf();
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
        return abnv.L(abgf.class);
    }
}
