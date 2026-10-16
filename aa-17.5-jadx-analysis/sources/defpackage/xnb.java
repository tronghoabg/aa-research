package defpackage;

/* loaded from: classes.dex */
public final class xnb extends abnv implements abox {
    public static final xnb a;
    public int b;
    public xmn c;
    private byte d = 2;

    static {
        xnb xnbVar = new xnb();
        a = xnbVar;
        abnv.P(xnb.class, xnbVar);
    }

    private xnb() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new xnb();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xnb.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
