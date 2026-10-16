package defpackage;

/* loaded from: classes3.dex */
public final class aaqa extends abnv implements abox {
    public static final aaqa a;
    private int b;
    private able c;
    private aapc d;
    private abkz e;
    private byte f = 2;

    static {
        aaqa aaqaVar = new aaqa();
        a = aaqaVar;
        abnv.P(aaqa.class, aaqaVar);
    }

    private aaqa() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0005ဉ\u0004\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new aaqa();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aaqa.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
