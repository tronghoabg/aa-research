package defpackage;

/* loaded from: classes3.dex */
public final class tbc extends abnv implements abox {
    public static final tbc a;
    public int b;
    public tbf c;
    public aboh d;
    public String e;
    public aboh f;
    public String g;
    public boolean h;
    public String i;
    public String j;
    public String k;

    static {
        tbc tbcVar = new tbc();
        a = tbcVar;
        abnv.P(tbc.class, tbcVar);
    }

    private tbc() {
        abpf abpfVar = abpf.b;
        this.d = abpfVar;
        this.e = "";
        this.f = abpfVar;
        this.g = "";
        this.i = "";
        this.j = "";
        this.k = "";
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001c\u0003ဈ\u0001\u0004\u001b\u0005ဈ\u0002\u0006ဇ\u0003\u0007ဈ\u0004\bဈ\u0005\tဈ\u0006", new Object[]{"b", "c", "d", "e", "f", taz.class, "g", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new tbc();
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
        return abnv.L(tbc.class);
    }
}
