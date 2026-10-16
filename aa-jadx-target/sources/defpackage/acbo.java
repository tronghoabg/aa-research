package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acbo extends defpackage.abou implements defpackage.abov {
    public static final defpackage.acbo a;
    public int b;
    public long c;
    public long d;
    public int e;
    public defpackage.abnv f;
    public long g;
    public boolean h;
    public java.lang.String i;
    public double j;
    public defpackage.acbn k;
    public defpackage.acbp l;
    private byte m = 2;

    static {
        defpackage.acbo acboVar = new defpackage.acbo();
        a = acboVar;
        defpackage.abox.P(defpackage.acbo.class, acboVar);
    }

    private acbo() {
        java.lang.Object[] objArr = defpackage.abqh.a;
        defpackage.abnv abnvVar = defpackage.abnv.d;
        this.f = defpackage.abnv.d;
        this.g = 180000L;
        defpackage.aboy aboyVar = defpackage.aboy.a;
        this.i = "";
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\n\u0000\u0001\u0001#\n\u0000\u0000\u0001\u0001ဂ\u0000\u0006ည\u000b\u000bင\u0005\u000fတ\u0011\u0011ဂ\u0001\u0019ဇ\u0017\u001cဈ\u0018 က\u001a!ᐉ\u001c#ဉ\u001b", new java.lang.Object[]{"b", "c", "f", "e", "g", "d", "h", "i", "j", "l", "k"});
        }
        if (i2 == 3) {
            return new defpackage.acbo();
        }
        if (i2 == 4) {
            return new defpackage.abot(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.acbo.class);
        }
        this.m = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
