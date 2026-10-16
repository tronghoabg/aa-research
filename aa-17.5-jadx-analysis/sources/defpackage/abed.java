package defpackage;

/* loaded from: classes3.dex */
public final class abed extends abns implements abnt {
    public static final abed a;
    public int b;
    public int f;
    public int g;
    public abdl h;
    private byte i = 2;
    public abms c = abms.d;
    public int d = -1;
    public long e = -1;

    static {
        abed abedVar = new abed();
        a = abedVar;
        abnv.P(abed.class, abedVar);
    }

    private abed() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ည\u0000\u0003င\u0001\u0004င\u0003\u0005ဆ\u0004\u0006ဂ\u0002\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "f", "g", "e", "h"});
        }
        if (i2 == 3) {
            return new abed();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abed.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
