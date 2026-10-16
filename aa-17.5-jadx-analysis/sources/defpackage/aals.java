package defpackage;

/* loaded from: classes3.dex */
public final class aals extends abnv implements abox {
    public static final aals a;
    private int b;
    private abkz c;
    private aapc d;
    private byte e = 2;

    static {
        aals aalsVar = new aals();
        a = aalsVar;
        abnv.P(aals.class, aalsVar);
    }

    private aals() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aals();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aals.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
