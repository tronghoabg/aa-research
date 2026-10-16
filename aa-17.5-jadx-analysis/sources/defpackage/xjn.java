package defpackage;

/* loaded from: classes3.dex */
public final class xjn extends abnv implements abox {
    public static final xjn a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    private byte h = 2;

    static {
        xjn xjnVar = new xjn();
        a = xjnVar;
        abnv.P(xjn.class, xjnVar);
    }

    private xjn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔇ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new xjn();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xjn.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
