package defpackage;

/* loaded from: classes3.dex */
public final class aaqy extends abnv implements abox {
    public static final aaqy a;
    private int b;
    private aapc c;
    private abkz d;
    private byte e = 2;

    static {
        aaqy aaqyVar = new aaqy();
        a = aaqyVar;
        abnv.P(aaqy.class, aaqyVar);
    }

    private aaqy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0003\u0007\u0002\u0000\u0000\u0001\u0003ဉ\u0004\u0007ᐉ\u0006", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aaqy();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aaqy.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
