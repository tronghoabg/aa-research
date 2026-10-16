package defpackage;

/* loaded from: classes3.dex */
public final class waw extends abnv implements abox {
    public static final waw a;
    public int b;
    public String c = "";
    public abms d = abms.d;
    public String e = "";
    public aboh f;
    public aboh g;
    public boolean h;
    public long i;

    static {
        waw wawVar = new waw();
        a = wawVar;
        abnv.P(waw.class, wawVar);
    }

    private waw() {
        abpf abpfVar = abpf.b;
        this.f = abpfVar;
        this.g = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"b", "e", "c", "d", "f", wax.class, "g", "h", "i"});
        }
        if (i2 == 3) {
            return new waw();
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
        return abnv.L(waw.class);
    }
}
