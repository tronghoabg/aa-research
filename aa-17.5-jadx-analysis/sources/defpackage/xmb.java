package defpackage;

/* loaded from: classes.dex */
public final class xmb extends abnv implements abox {
    public static final xmb a;
    public int b;
    public int c;
    public int d;
    private byte i = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public abms h = abms.d;

    static {
        xmb xmbVar = new xmb();
        a = xmbVar;
        abnv.P(xmb.class, xmbVar);
    }

    private xmb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᔋ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ည\u0005", new Object[]{"b", "c", xku.k, "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new xmb();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xmb.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
