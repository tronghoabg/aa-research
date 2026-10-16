package defpackage;

/* loaded from: classes3.dex */
public final class xjt extends abnv implements abox {
    public static final xjt a;
    public int b;
    public xom c;
    public xkf d;
    public xgx e;
    public xnp f;
    public xom g;
    private long h;
    private byte i = 2;

    static {
        xjt xjtVar = new xjt();
        a = xjtVar;
        abnv.P(xjt.class, xjtVar);
    }

    private xjt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001ᔃ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "h", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new xjt();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xjt.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
