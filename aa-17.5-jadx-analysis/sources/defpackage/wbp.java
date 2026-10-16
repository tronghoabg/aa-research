package defpackage;

/* loaded from: classes3.dex */
public final class wbp extends abnv implements abox {
    public static final wbp a;
    public int b;
    public aboh c = abpf.b;
    public String d = "";

    static {
        wbp wbpVar = new wbp();
        a = wbpVar;
        abnv.P(wbp.class, wbpVar);
    }

    private wbp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new wbp();
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
        return abnv.L(wbp.class);
    }
}
