package defpackage;

/* loaded from: classes3.dex */
public final class xme extends abnv implements abox {
    public static final xme a;
    public xjy b;
    private int e;
    private byte f = 2;
    public String c = "";
    public String d = "";

    static {
        xme xmeVar = new xme();
        a = xmeVar;
        abnv.P(xme.class, xmeVar);
    }

    private xme() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new xme();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xme.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
