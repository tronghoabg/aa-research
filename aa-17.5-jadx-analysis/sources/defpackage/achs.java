package defpackage;

/* loaded from: classes3.dex */
public final class achs extends abnv implements abox {
    public static final achs a;
    public int b;
    public acht c;
    public int d;
    public int e;
    public int f;
    private byte g = 2;

    static {
        achs achsVar = new achs();
        a = achsVar;
        abnv.P(achs.class, achsVar);
    }

    private achs() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᔉ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new achs();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(achs.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
