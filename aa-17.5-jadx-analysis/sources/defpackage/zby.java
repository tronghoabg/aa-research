package defpackage;

/* loaded from: classes3.dex */
public final class zby extends abnv implements abox {
    public static final zby a;
    public int b;
    public long e;
    private byte g = 2;
    public String c = "";
    public String d = "";
    public aboh f = abpf.b;

    static {
        zby zbyVar = new zby();
        a = zbyVar;
        abnv.P(zby.class, zbyVar);
    }

    private zby() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new Object[]{"b", "c", "d", "e", "f", zbx.class});
        }
        if (i2 == 3) {
            return new zby();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zby.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
