package defpackage;

/* loaded from: classes3.dex */
public final class aaqd extends abnv implements abox {
    public static final aaqd a;
    private int b;
    private abkz c;
    private byte d = 2;

    static {
        aaqd aaqdVar = new aaqd();
        a = aaqdVar;
        abnv.P(aaqd.class, aaqdVar);
    }

    private aaqd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0004", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aaqd();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aaqd.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
