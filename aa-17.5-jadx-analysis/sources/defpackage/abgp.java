package defpackage;

/* loaded from: classes3.dex */
public final class abgp extends abns implements abnt {
    public static final abgp a;
    public int b;
    public int c;
    public abms d;
    public int e;
    public abms f;
    public String g;
    public abuf h;
    public String i;
    private byte j = 2;

    static {
        abgp abgpVar = new abgp();
        a = abgpVar;
        abnv.P(abgp.class, abgpVar);
    }

    private abgp() {
        abms abmsVar = abms.d;
        this.d = abmsVar;
        this.f = abmsVar;
        this.g = "";
        this.i = "";
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0001\u0001᠌\u0000\u0003ည\u0005\u0005ᐉ\u000b\u0007ဈ\f\bင\u0006\tဈ\n\u000bည\t", new Object[]{"b", "c", abce.s, "d", "h", "i", "e", "g", "f"});
        }
        if (i2 == 3) {
            return new abgp();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abgp.class);
        }
        this.j = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
