package defpackage;

/* loaded from: classes3.dex */
public final class aaob extends abnv implements abox {
    public static final aaob a;
    private int b;
    private aapc c;
    private abkz d;
    private byte e = 2;

    static {
        aaob aaobVar = new aaob();
        a = aaobVar;
        abnv.P(aaob.class, aaobVar);
    }

    private aaob() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aaob();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aaob.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
