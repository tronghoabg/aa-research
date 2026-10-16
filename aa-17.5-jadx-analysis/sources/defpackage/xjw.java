package defpackage;

/* loaded from: classes.dex */
public final class xjw extends abnv implements abox {
    public static final aboe a = new xhs(2);
    public static final xjw b;
    public abod c;
    public aboh d;
    public aboh e;
    public abod f;
    public int g;
    private int h;
    private byte i = 2;

    static {
        xjw xjwVar = new xjw();
        b = xjwVar;
        abnv.P(xjw.class, xjwVar);
    }

    private xjw() {
        abnw abnwVar = abnw.a;
        this.c = abnwVar;
        abpf abpfVar = abpf.b;
        this.d = abpfVar;
        this.e = abpfVar;
        this.f = abnwVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abpg(b, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0002\u0001'\u0002Л\u0003Л\u0004ࠞ\u0005ဋ\u0000", new Object[]{"h", "c", "d", xjv.class, "e", xju.class, "f", otu.q, "g"});
        }
        if (i2 == 3) {
            return new xjw();
        }
        if (i2 == 4) {
            return new abnp(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 == 6) {
            return abnv.L(xjw.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
