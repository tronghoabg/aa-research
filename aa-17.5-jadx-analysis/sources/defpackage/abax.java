package defpackage;

/* loaded from: classes3.dex */
public final class abax extends abns implements abnt {
    public static final abax a;
    public int b;
    public abdx c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int k;
    public int l;
    public abdl m;
    private byte n = 2;
    public int i = -1;
    public long j = -1;

    static {
        abax abaxVar = new abax();
        a = abaxVar;
        abnv.P(abax.class, abaxVar);
    }

    private abax() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဇ\u0002\u0003င\u0007\u0004င\t\u0005ဆ\n\u0007ဇ\u0001\bဂ\b\u000bင\u0005\fင\u0006\r᠌\u0003\u000fᐉ\f", new Object[]{"b", "c", "e", "i", "k", "l", "d", "j", "g", "h", "f", abce.a, "m"});
        }
        if (i2 == 3) {
            return new abax();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abax.class);
        }
        this.n = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
