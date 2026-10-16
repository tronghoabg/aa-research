package defpackage;

/* loaded from: classes2.dex */
public final class pjy extends abnv implements abox {
    public static final pjy a;
    public int b;
    public abls f;
    private byte l = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";

    static {
        pjy pjyVar = new pjy();
        a = pjyVar;
        abnv.P(pjy.class, pjyVar);
    }

    private pjy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\t\u0000\u0001\u0001\f\t\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\nဈ\t\u000bဈ\n\fဈ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new pjy();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(pjy.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
