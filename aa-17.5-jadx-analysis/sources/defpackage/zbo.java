package defpackage;

/* loaded from: classes3.dex */
public final class zbo extends abnv implements abox {
    public static final zbo a;
    public int b;
    public zbp c;
    private byte d = 2;

    static {
        zbo zboVar = new zbo();
        a = zboVar;
        abnv.P(zbo.class, zboVar);
    }

    private zbo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0001\rᐉ\u000b", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zbo();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zbo.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
