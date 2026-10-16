package defpackage;

/* loaded from: classes3.dex */
public final class abku extends abnv implements abox {
    public static final abku a;
    private int b;
    private abkw c;
    private byte d = 2;

    static {
        abku abkuVar = new abku();
        a = abkuVar;
        abnv.P(abku.class, abkuVar);
    }

    private abku() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abku();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abku.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
