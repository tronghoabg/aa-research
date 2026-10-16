package defpackage;

/* loaded from: classes3.dex */
public final class acgg extends abnv implements abox {
    public static final acgg a;
    private int b;
    private ablg c;
    private abkz d;
    private aapc e;
    private byte f = 2;

    static {
        acgg acggVar = new acgg();
        a = acggVar;
        abnv.P(acgg.class, acggVar);
    }

    private acgg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0005\u0013\u0003\u0000\u0000\u0001\u0005ဉ\u0005\tᐉ\t\u0013ဉ\u0011", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new acgg();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acgg.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
