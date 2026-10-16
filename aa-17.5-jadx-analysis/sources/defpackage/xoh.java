package defpackage;

/* loaded from: classes.dex */
public final class xoh extends abnv implements abox {
    public static final xoh a;
    public int b;
    public int c;
    public int d;
    public int e;
    public xkk f;
    private byte g = 2;

    static {
        xoh xohVar = new xoh();
        a = xohVar;
        abnv.P(xoh.class, xohVar);
    }

    private xoh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔋ\u0001\u0003᠌\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", otu.r, "f"});
        }
        if (i2 == 3) {
            return new xoh();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xoh.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
