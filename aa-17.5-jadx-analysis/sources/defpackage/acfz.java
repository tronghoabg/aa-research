package defpackage;

/* loaded from: classes3.dex */
public final class acfz extends abnv implements abox {
    public static final acfz a;
    private int b;
    private aapc c;
    private abkz d;
    private byte e = 2;

    static {
        acfz acfzVar = new acfz();
        a = acfzVar;
        abnv.P(acfz.class, acfzVar);
    }

    private acfz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0007\b\u0002\u0000\u0000\u0001\u0007ဉ\t\bᐉ\f", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new acfz();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acfz.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
