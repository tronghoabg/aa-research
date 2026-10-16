package defpackage;

/* loaded from: classes2.dex */
public final class pjz extends abnv implements abox {
    public static final pjz a;
    public pka b;
    private int d;
    private byte e = 2;
    public abms c = abms.d;

    static {
        pjz pjzVar = new pjz();
        a = pjzVar;
        abnv.P(pjz.class, pjzVar);
    }

    private pjz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ည\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new pjz();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(pjz.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
