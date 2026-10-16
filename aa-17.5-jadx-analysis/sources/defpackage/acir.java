package defpackage;

/* loaded from: classes3.dex */
public final class acir extends abnv implements abox {
    public static final acir a;
    public int b;
    public acht d;
    public int e;
    public int f;
    public acij h;
    public acim i;
    public aciq j;
    public acio k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    private byte q = 2;
    public String c = "";
    public int g = -1;
    public abod p = abnw.a;

    static {
        acir acirVar = new acir();
        a = acirVar;
        abnv.P(acir.class, acirVar);
    }

    private acir() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.q);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u000e\u0000\u0001\u0001@\u000e\u0000\u0001\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0011ထ\u0005!ᐑ\u00071ဇ\t2ဇ\n3ဇ\u000b4င\u00045ᐑ\b:င\f;ࠞ=ထ\u0006?င\u0002@᠌\u0003", new Object[]{"b", "c", "d", "h", "j", "l", "m", "n", "g", "k", "o", "p", achi.i, "i", "e", "f", achi.j});
        }
        if (i2 == 3) {
            return new acir();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acir.class);
        }
        this.q = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
