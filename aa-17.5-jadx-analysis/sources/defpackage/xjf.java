package defpackage;

/* loaded from: classes3.dex */
public final class xjf extends abnv implements abox {
    public static final xjf a;
    public int b;
    private int c;
    private byte d = 2;

    static {
        xjf xjfVar = new xjf();
        a = xjfVar;
        abnv.P(xjf.class, xjfVar);
    }

    private xjf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new xjf();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xjf.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
