package defpackage;

/* loaded from: classes3.dex */
public final class acia extends abnv implements abox {
    public static final acia a;
    public int b;
    public boolean c;
    public int d;
    public int f;
    public int g;
    public acht l;
    public int p;
    public int q;
    public int s;
    private byte t = 2;
    public int e = 2000;
    public int h = sk.AUDIO_CONTENT_BUFFER_SIZE;
    public int i = sk.AUDIO_CONTENT_BUFFER_SIZE;
    public String j = "";
    public int k = 4;
    public String m = "";
    public String n = "";
    public String o = "";
    public int r = 1;

    static {
        acia aciaVar = new acia();
        a = aciaVar;
        abnv.P(acia.class, aciaVar);
    }

    private acia() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.t);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0011\u0000\u0001\u0002=\u0011\u0000\u0000\u0006\u0002ဇ\u0000\u0003င\u0001\u0004ᔄ\u0003\u0005ᔄ\u0004\u0006င\u0005\u0007င\u0006\bᔈ\u0007\tင\b\nᔉ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eᔄ\r\u000fᔄ\u000e\u0010᠌\u000f\u0011င\u0002=᠌\u0010", new Object[]{"b", "c", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", achi.e, "e", "s", achi.g});
        }
        if (i2 == 3) {
            return new acia();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acia.class);
        }
        this.t = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
