package defpackage;

/* loaded from: classes3.dex */
public final class zbc extends abnv implements abox {
    public static final zbc a;
    public int b;
    public zbp c;
    private zbp d;
    private zbo e;
    private byte f = 2;

    static {
        zbc zbcVar = new zbc();
        a = zbcVar;
        abnv.P(zbc.class, zbcVar);
    }

    private zbc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new zbc();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zbc.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
