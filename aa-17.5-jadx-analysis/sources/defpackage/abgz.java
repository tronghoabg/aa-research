package defpackage;

/* loaded from: classes3.dex */
public final class abgz extends abnv implements abox {
    public static final abgz a;
    public int b;
    private byte e = 2;
    public String c = "";
    public String d = "";

    static {
        abgz abgzVar = new abgz();
        a = abgzVar;
        abnv.P(abgz.class, abgzVar);
    }

    private abgz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abgz();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abgz.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
