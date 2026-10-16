package defpackage;

/* loaded from: classes.dex */
public final class xiu extends abnv implements abox {
    public static final xiu a;
    public int c;
    private int e;
    private byte f = 2;
    public int b = 1;
    public abod d = abnw.a;

    static {
        xiu xiuVar = new xiu();
        a = xiuVar;
        abnv.P(xiu.class, xiuVar);
    }

    private xiu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᴌ\u0000\u0002ဋ\u0001\u0003\u001d", new Object[]{"e", "b", otu.m, "c", "d"});
        }
        if (i2 == 3) {
            return new xiu();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xiu.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
