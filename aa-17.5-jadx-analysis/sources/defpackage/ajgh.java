package defpackage;

/* loaded from: classes2.dex */
public final class ajgh extends abnv implements abox {
    public static final ajgh a;
    public int b;
    public boolean c;
    public ajfx d;
    public int g;
    public zcb i;
    public ajgg j;
    public ajge k;
    private byte l = 2;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        ajgh ajghVar = new ajgh();
        a = ajghVar;
        abnv.P(ajgh.class, ajghVar);
    }

    private ajgh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0007ဈ\u0007\tᐉ\b\u000bဉ\n\fဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", ajfp.d, "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new ajgh();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajgh.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
