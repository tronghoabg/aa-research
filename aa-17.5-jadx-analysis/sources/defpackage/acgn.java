package defpackage;

/* loaded from: classes3.dex */
public final class acgn extends abnv implements abox {
    public static final acgn a;
    private int b;
    private aapc c;
    private abkz d;
    private byte e = 2;

    static {
        acgn acgnVar = new acgn();
        a = acgnVar;
        abnv.P(acgn.class, acgnVar);
    }

    private acgn() {
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0001\u0004ဉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new acgn();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acgn.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
