package defpackage;

/* loaded from: classes3.dex */
public final class zat extends abnv implements abox {
    public static final zat a;
    private int b;
    private zar c;
    private byte d = 2;

    static {
        zat zatVar = new zat();
        a = zatVar;
        abnv.P(zat.class, zatVar);
    }

    private zat() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zat();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zat.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
