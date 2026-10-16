package defpackage;

/* loaded from: classes3.dex */
public final class aciq extends abnv implements abox {
    public static final aciq a;
    public int b;
    public acho c;
    public int d;
    public int e;
    private byte g = 2;
    public aboh f = abpf.b;

    static {
        aciq aciqVar = new aciq();
        a = aciqVar;
        abnv.P(aciq.class, aciqVar);
    }

    private aciq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\"%\u0004\u0000\u0001\u0004\"ᔉ\u0000#ᔄ\u0001$ᔄ\u0002%б", new Object[]{"b", "c", "d", "e", "f", acip.class});
        }
        if (i2 == 3) {
            return new aciq();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aciq.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
