package defpackage;

/* loaded from: classes3.dex */
public final class achw extends abnv implements abox {
    public static final achw a;
    public int b;
    public int d;
    public long e;
    private byte h = 2;
    public String c = "";
    public abms f = abms.d;
    public String g = "";

    static {
        achw achwVar = new achw();
        a = achwVar;
        abnv.P(achw.class, achwVar);
    }

    private achw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0004\u0002ᔈ\u0000\u0003ᔄ\u0001\u0004ᔅ\u0002\u0006ည\u0003\u0007ᔈ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new achw();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(achw.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
