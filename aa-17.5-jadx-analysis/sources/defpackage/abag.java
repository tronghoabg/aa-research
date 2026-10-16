package defpackage;

/* loaded from: classes3.dex */
public final class abag extends abnv implements abox {
    public static final abag a;
    public int b;
    public abah c;
    public int e;
    public int f;
    private abel g;
    private byte h = 2;
    public int d = 1;

    static {
        abag abagVar = new abag();
        a = abagVar;
        abnv.P(abag.class, abagVar);
    }

    private abag() {
        abnw abnwVar = abnw.a;
        this.f = 1;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002᠌\u0001\u0003᠌\u0003\u0004င\u0002\u0005ᐉ\u0004", new Object[]{"b", "c", "d", zli.q, "f", zli.r, "e", "g"});
        }
        if (i2 == 3) {
            return new abag();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abag.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
