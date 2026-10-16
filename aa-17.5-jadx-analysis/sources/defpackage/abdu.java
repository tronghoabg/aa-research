package defpackage;

/* loaded from: classes3.dex */
public final class abdu extends abns implements abnt {
    public static final abdu a;
    public int b;
    public abah c;
    public int d;
    public int e;
    public int h;
    public int i;
    private abdl j;
    private byte k = 2;
    public int f = -1;
    public long g = -1;

    static {
        abdu abduVar = new abdu();
        a = abduVar;
        abnv.P(abdu.class, abduVar);
    }

    private abdu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0002\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဆ\u0006\bᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new abdu();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abdu.class);
        }
        this.k = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
