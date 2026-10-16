package defpackage;

/* loaded from: classes3.dex */
public final class abbl extends abnv implements abox {
    public static final abbl a;
    private int b;
    private float c;
    private float d;
    private byte e = 2;

    static {
        abbl abblVar = new abbl();
        a = abblVar;
        abnv.P(abbl.class, abblVar);
    }

    private abbl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔁ\u0000\u0002ᔁ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abbl();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abbl.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
