package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zpk extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.zpk a;
    public int b;
    public defpackage.zpm c;
    public defpackage.zpm d;
    public defpackage.zpm e;
    public defpackage.zpm f;
    public defpackage.zpm g;
    public defpackage.zpm h;
    public defpackage.zpm i;
    public defpackage.zpm j;
    public defpackage.zpm k;
    public defpackage.zpm l;
    public defpackage.zpm m;
    public int o;
    public boolean s;
    private byte v = 2;
    public java.lang.String n = "";
    public java.lang.String p = "";
    public java.lang.String q = "";
    public java.lang.String r = "";
    public defpackage.abpj t = defpackage.abqh.b;
    public java.lang.String u = "";

    static {
        defpackage.zpk zpkVar = new defpackage.zpk();
        a = zpkVar;
        defpackage.abox.P(defpackage.zpk.class, zpkVar);
    }

    private zpk() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.v);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0013\u0000\u0001\u0001\u001c\u0013\u0000\u0001\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tᔈ\u0011\nင\u0012\u000bဈ\u0013\u000fဈ\u0017\u0010ဈ\u0018\u0012ဇ\u0019\u0013Л\u0015ဉ\b\u0017ဈ\u001b\u0019ဉ\t\u001cဉ\u000b", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "n", "o", "p", "q", "r", "s", "t", defpackage.zpf.class, "k", "u", "l", "m"});
        }
        if (i2 == 3) {
            return new defpackage.zpk();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.zpk.class);
        }
        this.v = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
