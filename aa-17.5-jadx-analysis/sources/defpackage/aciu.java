package defpackage;

/* loaded from: classes3.dex */
public final class aciu extends abnv implements abox {
    public static final aciu a;
    private int c;
    private byte d = 2;
    public abms b = abms.d;

    static {
        aciu aciuVar = new aciu();
        a = aciuVar;
        abnv.P(aciu.class, aciuVar);
    }

    private aciu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u001c\u001c\u0001\u0000\u0000\u0001\u001cᔊ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new aciu();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aciu.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
