package defpackage;

/* loaded from: classes3.dex */
public final class xjo extends abnv implements abox {
    public static final xjo a;
    public int b;
    public int c;
    public int d;
    private byte f = 2;
    public aboh e = abpf.b;

    static {
        xjo xjoVar = new xjo();
        a = xjoVar;
        abnv.P(xjo.class, xjoVar);
    }

    private xjo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᔄ\u0000\u0002င\u0001\u0003Л", new Object[]{"b", "c", "d", "e", xjn.class});
        }
        if (i2 == 3) {
            return new xjo();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xjo.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
