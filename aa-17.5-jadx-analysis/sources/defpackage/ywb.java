package defpackage;

/* loaded from: classes3.dex */
public final class ywb extends abnv implements abox {
    public static final ywb a;
    public int b;
    public zbe c;
    public zaz d;
    private int e;
    private zag f;
    private ywc g;
    private zaq h;
    private zbb i;
    private zbk j;
    private zbl k;
    private byte l = 2;

    static {
        ywb ywbVar = new ywb();
        a = ywbVar;
        abnv.P(ywb.class, ywbVar);
    }

    private ywb() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\b\u0000\u0002\u0004/\b\u0000\u0000\u0002\u0004ဉ\u0003\nဉ\u0007\u000fᐉ\u000e\u0013ᐉ\u0012%ဉ#+ဉ)-ဉ+/ဉ-", new Object[]{"b", "e", "c", "d", "f", "g", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new ywb();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ywb.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
