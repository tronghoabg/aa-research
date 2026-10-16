package defpackage;

/* loaded from: classes.dex */
public final class xhf extends abnv implements abox {
    public static final xhf a;
    public int b;
    public int c;
    public int d;
    public int e;
    private byte f = 2;

    static {
        xhf xhfVar = new xhf();
        a = xhfVar;
        abnv.P(xhf.class, xhfVar);
    }

    private xhf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new xhf();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xhf.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
