package defpackage;

/* loaded from: classes3.dex */
public final class abdy extends abnv implements abox {
    public static final abdy a;
    public int c;
    public int d;
    public int f;
    private int g;
    private byte h = 2;
    public abms b = abms.d;
    public int e = 1;

    static {
        abdy abdyVar = new abdy();
        a = abdyVar;
        abnv.P(abdy.class, abdyVar);
    }

    private abdy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0002\u0003င\u0001\u0004᠌\u0003\u0005င\u0004", new Object[]{"g", "b", "d", "c", "e", abce.i, "f"});
        }
        if (i2 == 3) {
            return new abdy();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abdy.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
