package defpackage;

/* loaded from: classes3.dex */
public final class aalo extends abnv implements abox {
    public static final aalo a;
    private int b;
    private abkz c;
    private aapc d;
    private byte e = 2;

    static {
        aalo aaloVar = new aalo();
        a = aaloVar;
        abnv.P(aalo.class, aaloVar);
    }

    private aalo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\t\n\u0002\u0000\u0000\u0001\tᐉ\u0005\nဉ\u0006", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aalo();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aalo.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
