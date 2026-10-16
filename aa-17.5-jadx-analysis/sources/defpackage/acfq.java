package defpackage;

/* loaded from: classes3.dex */
public final class acfq extends abnv implements abox {
    public static final acfq a;
    private int b;
    private aapc d;
    private byte e = 2;
    private String c = "";

    static {
        acfq acfqVar = new acfq();
        a = acfqVar;
        abnv.P(acfq.class, acfqVar);
    }

    private acfq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0004ဉ\u0005", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new acfq();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acfq.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
