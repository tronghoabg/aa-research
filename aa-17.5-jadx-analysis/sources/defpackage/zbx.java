package defpackage;

/* loaded from: classes3.dex */
public final class zbx extends abnv implements abox {
    public static final zbx a;
    public int b;
    public int f;
    private byte g = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        zbx zbxVar = new zbx();
        a = zbxVar;
        abnv.P(zbx.class, zbxVar);
    }

    private zbx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0003\u0005ᔈ\u0000\u0006ᔈ\u0001\u0007ဈ\u0002\bᔄ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new zbx();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zbx.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
