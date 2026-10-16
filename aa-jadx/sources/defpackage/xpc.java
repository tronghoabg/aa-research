package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xpc extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xpc a;
    public int b;
    public int h;
    public boolean m;
    public int n;
    public boolean p;
    public defpackage.xhs q;
    private byte r = 2;
    public defpackage.abpj c = defpackage.abqh.b;
    public java.lang.String d = "";
    public java.lang.String e = "";
    public java.lang.String f = "";
    public java.lang.String g = "";
    public java.lang.String i = "";
    public java.lang.String j = "";
    public java.lang.String k = "";
    public java.lang.String l = "";
    public java.lang.String o = "";

    static {
        defpackage.xpc xpcVar = new defpackage.xpc();
        a = xpcVar;
        defpackage.abox.P(defpackage.xpc.class, xpcVar);
    }

    private xpc() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.r);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006᠌\u0004\u0007ဈ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဇ\t\rင\n\u000eဈ\u000b\u000fဇ\f\u0011ဉ\u000e", new java.lang.Object[]{"b", "c", defpackage.xpa.class, "d", "e", "f", "g", "h", defpackage.our.o, "i", "j", "k", "l", "m", "n", "o", "p", "q"});
        }
        if (i2 == 3) {
            return new defpackage.xpc();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xpc.class);
        }
        this.r = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
