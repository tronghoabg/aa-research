package defpackage;

/* loaded from: classes3.dex */
public final class achy extends abnv implements abox {
    public static final achy a;
    public int b;
    public int c;
    public int h;
    private byte i = 2;
    public String d = "";
    public int e = -2130839438;
    public String f = "";
    public String g = "";

    static {
        achy achyVar = new achy();
        a = achyVar;
        abnv.P(achy.class, achyVar);
    }

    private achy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u00015>\u0006\u0000\u0000\u00015င\u00006ᔈ\u00017င\u00028ဈ\u00039ဈ\u0004>᠌\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", achi.g});
        }
        if (i2 == 3) {
            return new achy();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(achy.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
