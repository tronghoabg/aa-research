package defpackage;

/* loaded from: classes3.dex */
public final class acix extends abnv implements abox {
    public static final acix a;
    public int b;
    public int c;
    public int d;
    private int f;
    private byte g = 2;
    public aboh e = abpf.b;

    static {
        acix acixVar = new acix();
        a = acixVar;
        abnv.P(acix.class, acixVar);
    }

    private acix() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0013\u0016\u0004\u0000\u0001\u0004\u0013ᔄ\u0000\u0014ᔄ\u0001\u0015ᔄ\u0002\u0016б", new Object[]{"f", "b", "c", "d", "e", aciw.class});
        }
        if (i2 == 3) {
            return new acix();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acix.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
