package defpackage;

/* loaded from: classes3.dex */
public final class xkh extends abnv implements abox {
    public static final xkh a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    private byte i = 2;

    static {
        xkh xkhVar = new xkh();
        a = xkhVar;
        abnv.P(xkh.class, xkhVar);
    }

    private xkh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0002\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ဋ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new xkh();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xkh.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
