package defpackage;

/* loaded from: classes3.dex */
public final class achv extends abnv implements abox {
    public static final achv a;
    public int b;
    public long c;
    private byte f = 2;
    public String d = "";
    public String e = "";

    static {
        achv achvVar = new achv();
        a = achvVar;
        abnv.P(achv.class, achvVar);
    }

    private achv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0002\t\u0003\u0000\u0000\u0001\u0002စ\u0000\u0004ᔈ\u0001\tဈ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new achv();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(achv.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
