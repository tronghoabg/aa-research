package defpackage;

/* loaded from: classes3.dex */
public final class acgd extends abnv implements abox {
    public static final acgd a;
    private int b;
    private acgb c;
    private aapc d;
    private byte e = 2;

    static {
        acgd acgdVar = new acgd();
        a = acgdVar;
        abnv.P(acgd.class, acgdVar);
    }

    private acgd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဉ\u0001\u0006ဉ\u0003", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new acgd();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acgd.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
