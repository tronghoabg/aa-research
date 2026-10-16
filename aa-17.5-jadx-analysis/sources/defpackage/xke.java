package defpackage;

/* loaded from: classes3.dex */
public final class xke extends abnv implements abox {
    public static final xke a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    private byte g = 2;

    static {
        xke xkeVar = new xke();
        a = xkeVar;
        abnv.P(xke.class, xkeVar);
    }

    private xke() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔇ\u0001\u0003ᔋ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new xke();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xke.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
