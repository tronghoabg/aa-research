package defpackage;

/* loaded from: classes3.dex */
public final class zoi extends abnv implements abox {
    public static final zoi a;
    public int b;
    public zok c;
    public zok d;
    public zok e;
    public zok f;
    public zok g;
    public zok h;
    public zok i;
    public zok j;
    public zok k;
    public zok l;
    public zok m;
    public int o;
    public boolean s;
    private byte v = 2;
    public String n = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public aboh t = abpf.b;
    public String u = "";

    static {
        zoi zoiVar = new zoi();
        a = zoiVar;
        abnv.P(zoi.class, zoiVar);
    }

    private zoi() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.v);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0013\u0000\u0001\u0001\u001c\u0013\u0000\u0001\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tᔈ\u0011\nင\u0012\u000bဈ\u0013\u000fဈ\u0017\u0010ဈ\u0018\u0012ဇ\u0019\u0013Л\u0015ဉ\b\u0017ဈ\u001b\u0019ဉ\t\u001cဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "n", "o", "p", "q", "r", "s", "t", zod.class, "k", "u", "l", "m"});
        }
        if (i2 == 3) {
            return new zoi();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zoi.class);
        }
        this.v = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
