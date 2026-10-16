package defpackage;

@Deprecated
/* loaded from: classes3.dex */
public final class acfh extends abnv implements abox {
    public static final acfh a;
    private int b;
    private aapc c;
    private abkz d;
    private byte e = 2;

    static {
        acfh acfhVar = new acfh();
        a = acfhVar;
        abnv.P(acfh.class, acfhVar);
    }

    private acfh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0004\u0006\u0002\u0000\u0000\u0001\u0004ဉ\u0002\u0006ᐉ\u0003", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new acfh();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acfh.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
