package defpackage;

/* loaded from: classes.dex */
public final class xnx extends abnv implements abox {
    public static final aboe a = new xhs(3);
    public static final aboe b = new xhs(4);
    public static final xnx c;
    public int e;
    public abod f;
    public abod g;
    private int h;
    private byte i = 2;
    public aboh d = abpf.b;

    static {
        xnx xnxVar = new xnx();
        c = xnxVar;
        abnv.P(xnx.class, xnxVar);
    }

    private xnx() {
        abnw abnwVar = abnw.a;
        this.f = abnwVar;
        this.g = abnwVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abpg(c, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0001\u0001Л\u0002ဋ\u0000\u0003ࠞ\u0004ࠞ", new Object[]{"h", "d", xnw.class, "e", "f", otu.s, "g", otu.p});
        }
        if (i2 == 3) {
            return new xnx();
        }
        if (i2 == 4) {
            return new abnp(c);
        }
        if (i2 == 5) {
            return c;
        }
        if (i2 == 6) {
            return abnv.L(xnx.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
