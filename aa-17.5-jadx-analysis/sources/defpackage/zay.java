package defpackage;

/* loaded from: classes3.dex */
public final class zay extends abnv implements abox {
    public static final zay a;
    private int b;
    private zbp c;
    private zbp d;
    private zbo e;
    private byte f = 2;

    static {
        zay zayVar = new zay();
        a = zayVar;
        abnv.P(zay.class, zayVar);
    }

    private zay() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new zay();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zay.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
