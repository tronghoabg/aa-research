package defpackage;

/* loaded from: classes3.dex */
public final class aaqg extends abnv implements abox {
    public static final aaqg a;
    private int b;
    private abkz c;
    private aapc d;
    private byte e = 2;

    static {
        aaqg aaqgVar = new aaqg();
        a = aaqgVar;
        abnv.P(aaqg.class, aaqgVar);
    }

    private aaqg() {
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0001\u0005ᐉ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aaqg();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aaqg.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
