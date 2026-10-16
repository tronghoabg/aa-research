package defpackage;

/* loaded from: classes3.dex */
public final class aaqj extends abnv implements abox {
    public static final aaqj a;
    private int b;
    private aapc c;
    private abkz d;
    private byte e = 2;

    static {
        aaqj aaqjVar = new aaqj();
        a = aaqjVar;
        abnv.P(aaqj.class, aaqjVar);
    }

    private aaqj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0005\u000e\u0002\u0000\u0000\u0001\u0005ဉ\u0006\u000eᐉ\u0007", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aaqj();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aaqj.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
