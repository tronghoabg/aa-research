package defpackage;

/* loaded from: classes3.dex */
public final class xgz extends abnv implements abox {
    public static final xgz a;
    public int b;
    public int c;
    public int d;
    private byte f = 2;
    public abog e = abor.a;

    static {
        xgz xgzVar = new xgz();
        a = xgzVar;
        abnv.P(xgz.class, xgzVar);
    }

    private xgz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᔄ\u0000\u0002ဋ\u0001\u0003\u0015", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new xgz();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xgz.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
