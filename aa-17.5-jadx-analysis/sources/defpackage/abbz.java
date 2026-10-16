package defpackage;

/* loaded from: classes3.dex */
public final class abbz extends abns implements abnt {
    public static final abbz a;
    public int b;
    public int d;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int o;
    public int p;
    private byte q = 2;
    public String c = "";
    public int e = -1;
    public int f = 1;
    public float g = 1.0f;
    public int n = -16777216;

    static {
        abbz abbzVar = new abbz();
        a = abbzVar;
        abnv.P(abbz.class, abbzVar);
    }

    private abbz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.q);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0003\u0003င\u0005\u0004င\u0006\u0005င\u0002\u0006ဆ\u000b\u0007ဆ\r\bဋ\u0001\tင\u0007\nင\b\u000bင\t\fင\n\rဋ\f\u000eခ\u0004", new Object[]{"b", "c", "f", "h", "i", "e", "n", "p", "d", "j", "k", "l", "m", "o", "g"});
        }
        if (i2 == 3) {
            return new abbz();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abbz.class);
        }
        this.q = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
