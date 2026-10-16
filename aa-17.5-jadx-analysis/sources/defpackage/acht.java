package defpackage;

/* loaded from: classes3.dex */
public final class acht extends abnv implements abox {
    public static final acht a;
    public int b;
    public int c;
    public int d;
    private byte e = 2;

    static {
        acht achtVar = new acht();
        a = achtVar;
        abnv.P(acht.class, achtVar);
    }

    private acht() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new acht();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acht.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
