package defpackage;

/* loaded from: classes3.dex */
public final class zpd extends abnv implements abox {
    public static final zpd a;
    public int b;
    public int c;
    public long d;
    public boolean f;
    public int i;
    private byte k = 2;
    public String e = "";
    public int g = 1;
    public String h = "";
    public String j = "";

    static {
        zpd zpdVar = new zpd();
        a = zpdVar;
        abnv.P(zpd.class, zpdVar);
    }

    private zpd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔃ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0005\u0006᠌\u0006\u0007ဈ\u0007\bင\u0004", new Object[]{"b", "c", "d", "e", "f", "h", "i", zli.d, "j", "g"});
        }
        if (i2 == 3) {
            return new zpd();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zpd.class);
        }
        this.k = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
