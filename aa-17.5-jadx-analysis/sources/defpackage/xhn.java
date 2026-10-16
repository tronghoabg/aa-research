package defpackage;

/* loaded from: classes3.dex */
public final class xhn extends abnv implements abox {
    public static final xhn a;
    public int b;
    private byte d = 2;
    public String c = "";

    static {
        xhn xhnVar = new xhn();
        a = xhnVar;
        abnv.P(xhn.class, xhnVar);
    }

    private xhn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new xhn();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xhn.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
