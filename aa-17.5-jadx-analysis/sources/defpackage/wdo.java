package defpackage;

/* loaded from: classes3.dex */
public final class wdo extends abnv implements abox {
    public static final wdo a;
    public int b;
    public long f;
    public String c = "";
    public abms d = abms.d;
    public String e = "";
    public aboh g = abpf.b;

    static {
        wdo wdoVar = new wdo();
        a = wdoVar;
        abnv.P(wdo.class, wdoVar);
    }

    private wdo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", "g", wdp.class});
        }
        if (i2 == 3) {
            return new wdo();
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
        return abnv.L(wdo.class);
    }
}
