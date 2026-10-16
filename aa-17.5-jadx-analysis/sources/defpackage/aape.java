package defpackage;

/* loaded from: classes3.dex */
public final class aape extends abnv implements abox {
    public static final aape a;
    private int b;
    private abkz c;
    private aapc d;
    private byte e = 2;

    static {
        aape aapeVar = new aape();
        a = aapeVar;
        abnv.P(aape.class, aapeVar);
    }

    private aape() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0001\u0004ᐉ\u0005\u0005ဉ\u0006", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aape();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aape.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
