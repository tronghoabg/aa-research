package defpackage;

/* loaded from: classes.dex */
public final class acam extends abns implements abnt {
    public static final acam a;
    public int b;
    public long c;
    public long d;
    public int e;
    public abms f;
    public long g;
    public boolean h;
    public String i;
    public double j;
    public acal k;
    public acan l;
    private byte m = 2;

    static {
        acam acamVar = new acam();
        a = acamVar;
        abnv.P(acam.class, acamVar);
    }

    private acam() {
        Object[] objArr = abpf.a;
        abms abmsVar = abms.d;
        this.f = abms.d;
        this.g = 180000L;
        abnw abnwVar = abnw.a;
        this.i = "";
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\n\u0000\u0001\u0001#\n\u0000\u0000\u0001\u0001ဂ\u0000\u0006ည\u000b\u000bင\u0005\u000fတ\u0011\u0011ဂ\u0001\u0019ဇ\u0017\u001cဈ\u0018 က\u001a!ᐉ\u001c#ဉ\u001b", new Object[]{"b", "c", "f", "e", "g", "d", "h", "i", "j", "l", "k"});
        }
        if (i2 == 3) {
            return new acam();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acam.class);
        }
        this.m = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
