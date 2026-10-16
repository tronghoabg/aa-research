package defpackage;

/* loaded from: classes3.dex */
public final class abty extends abnv implements abox {
    public static final abty a;
    private int b;
    private zkk c;
    private byte d = 2;

    static {
        abty abtyVar = new abty();
        a = abtyVar;
        abnv.P(abty.class, abtyVar);
    }

    private abty() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abty();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abty.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
