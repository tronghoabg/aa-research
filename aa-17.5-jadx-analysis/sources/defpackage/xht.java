package defpackage;

/* loaded from: classes.dex */
public final class xht extends abnv implements abox {
    public static final aboe a = new xhs(0);
    public static final xht b;
    private int e;
    private byte f = 2;
    public String c = "";
    public abod d = abnw.a;

    static {
        xht xhtVar = new xht();
        b = xhtVar;
        abnv.P(xht.class, xhtVar);
    }

    private xht() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᔈ\u0000\u0002ࠬ", new Object[]{"e", "c", "d", otu.l});
        }
        if (i2 == 3) {
            return new xht();
        }
        if (i2 == 4) {
            return new abnp(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 == 6) {
            return abnv.L(xht.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
