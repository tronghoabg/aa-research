package defpackage;

/* loaded from: classes3.dex */
public final class abgd extends abns implements abnt {
    public static final abgd a;
    public int b;
    public int c;
    public int e;
    public abkk g;
    private byte h = 2;
    public String d = "";
    public aboh f = abpf.b;

    static {
        abgd abgdVar = new abgd();
        a = abgdVar;
        abnv.P(abgd.class, abgdVar);
    }

    private abgd() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0002\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002\u0004Л\bᐉ\u0007", new Object[]{"b", "c", abce.p, "d", "e", "f", abgc.class, "g"});
        }
        if (i2 == 3) {
            return new abgd();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abgd.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
