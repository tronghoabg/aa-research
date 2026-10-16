package defpackage;

/* loaded from: classes3.dex */
public final class acbj extends abnv implements abox {
    public static final acbj a;
    private int b;
    private abkz c;
    private aapc d;
    private byte e = 2;

    static {
        acbj acbjVar = new acbj();
        a = acbjVar;
        abnv.P(acbj.class, acbjVar);
    }

    private acbj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0004\u0007\u0002\u0000\u0000\u0001\u0004ဉ\u0007\u0007ᐉ\u0006", new Object[]{"b", "d", "c"});
        }
        if (i2 == 3) {
            return new acbj();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acbj.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
