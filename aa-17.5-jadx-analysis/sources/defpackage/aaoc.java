package defpackage;

/* loaded from: classes3.dex */
public final class aaoc extends abnv implements abox {
    public static final aaoc a;
    private int b;
    private acht c;
    private aapc d;
    private abkz e;
    private byte f = 2;

    static {
        aaoc aaocVar = new aaoc();
        a = aaocVar;
        abnv.P(aaoc.class, aaocVar);
    }

    private aaoc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0002\u0002ᐉ\u0000\u0003ဉ\u0001\u0004ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new aaoc();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aaoc.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
