package defpackage;

/* loaded from: classes3.dex */
public final class aapr extends abnv implements abox {
    public static final aapr a;
    private int b;
    private abkz c;
    private aapc d;
    private byte e = 2;

    static {
        aapr aaprVar = new aapr();
        a = aaprVar;
        abnv.P(aapr.class, aaprVar);
    }

    private aapr() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\b\u0011\u0002\u0000\u0000\u0001\bᐉ\u000b\u0011ဉ\u0011", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aapr();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aapr.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
