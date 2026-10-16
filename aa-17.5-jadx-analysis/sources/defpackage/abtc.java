package defpackage;

/* loaded from: classes3.dex */
public final class abtc extends abnv implements abox {
    public static final abtc a;
    private int b;
    private aamu c;
    private byte d = 2;

    static {
        abtc abtcVar = new abtc();
        a = abtcVar;
        abnv.P(abtc.class, abtcVar);
    }

    private abtc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abtc();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abtc.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
