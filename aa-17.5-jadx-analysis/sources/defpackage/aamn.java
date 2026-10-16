package defpackage;

/* loaded from: classes3.dex */
public final class aamn extends abnv implements abox {
    public static final aamn a;
    private int b;
    private abkz c;
    private aapc d;
    private byte e = 2;

    static {
        aamn aamnVar = new aamn();
        a = aamnVar;
        abnv.P(aamn.class, aamnVar);
    }

    private aamn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0000\u0001\u0003ᐉ\u0007\u0006ဉ\b", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aamn();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aamn.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
