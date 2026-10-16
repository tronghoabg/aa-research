package defpackage;

/* loaded from: classes2.dex */
public final class pma extends abnv implements abox {
    public static final pma a;
    public int b;
    public long e;
    public acbu f;
    private byte g = 2;
    public String c = "";
    public String d = "";

    static {
        pma pmaVar = new pma();
        a = pmaVar;
        abnv.P(pma.class, pmaVar);
    }

    private pma() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0001\u0002ဂ\u0002\u0003ᐉ\u0003\u0004ဈ\u0000", new Object[]{"b", "d", "e", "f", "c"});
        }
        if (i2 == 3) {
            return new pma();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(pma.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
