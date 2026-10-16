package defpackage;

/* loaded from: classes3.dex */
public final class xog extends abnv implements abox {
    public static final xog a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    private byte f = 2;

    static {
        xog xogVar = new xog();
        a = xogVar;
        abnv.P(xog.class, xogVar);
    }

    private xog() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᔄ\u0000\u0002ဇ\u0001\u0004င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new xog();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xog.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
