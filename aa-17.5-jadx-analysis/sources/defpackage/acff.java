package defpackage;

/* loaded from: classes3.dex */
public final class acff extends abnv implements abox {
    public static final acff a;
    private int b;
    private byte d = 2;
    private int c = 1;

    static {
        acff acffVar = new acff();
        a = acffVar;
        abnv.P(acff.class, acffVar);
    }

    private acff() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᴌ\u0000", new Object[]{"b", "c", achi.b});
        }
        if (i2 == 3) {
            return new acff();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acff.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
