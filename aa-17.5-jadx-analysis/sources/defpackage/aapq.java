package defpackage;

/* loaded from: classes3.dex */
public final class aapq extends abnv implements abox {
    public static final aapq a;
    private int b;
    private abkz c;
    private aapc d;
    private byte e = 2;

    static {
        aapq aapqVar = new aapq();
        a = aapqVar;
        abnv.P(aapq.class, aapqVar);
    }

    private aapq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0001\u0003ဉ\u0003\u0004ᐉ\u0002", new Object[]{"b", "d", "c"});
        }
        if (i2 == 3) {
            return new aapq();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aapq.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
