package defpackage;

/* loaded from: classes3.dex */
public final class acbu extends abnv implements abox {
    public static final acbu a;
    public int b;
    public long e;
    private aapd f;
    private byte g = 2;
    public aboh c = abpf.b;
    public abms d = abms.d;

    static {
        acbu acbuVar = new acbu();
        a = acbuVar;
        abnv.P(acbu.class, acbuVar);
    }

    private acbu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ည\u0001\u0004ဂ\u0002", new Object[]{"b", "c", aceg.class, "f", "d", "e"});
        }
        if (i2 == 3) {
            return new acbu();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acbu.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
