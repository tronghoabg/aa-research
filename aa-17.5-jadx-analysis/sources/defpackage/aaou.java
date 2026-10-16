package defpackage;

/* loaded from: classes3.dex */
public final class aaou extends abnv implements abox {
    public static final aaou a;
    private int b;
    private abkz c;
    private byte d = 2;

    static {
        aaou aaouVar = new aaou();
        a = aaouVar;
        abnv.P(aaou.class, aaouVar);
    }

    private aaou() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0003", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aaou();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aaou.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
