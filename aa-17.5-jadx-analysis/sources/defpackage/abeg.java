package defpackage;

/* loaded from: classes3.dex */
public final class abeg extends abns implements abnt {
    public static final abeg a;
    public int b;
    public abej c;
    public abch d;
    public abeh e;
    public long f;
    public int g;
    public abks h;
    public abks i;
    public abks j;
    public int k;
    public int l;
    public boolean m;
    private byte n = 2;

    static {
        abeg abegVar = new abeg();
        a = abegVar;
        abnv.P(abeg.class, abegVar);
    }

    private abeg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004စ\u0003\u0005ဉ\u0005\u0007ဉ\u0006\bင\b\tင\t\nဇ\n\u000bဉ\u0007\fင\u0004", new Object[]{"b", "c", "d", "e", "f", "h", "i", "k", "l", "m", "j", "g"});
        }
        if (i2 == 3) {
            return new abeg();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abeg.class);
        }
        this.n = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
