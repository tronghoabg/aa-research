package defpackage;

/* loaded from: classes3.dex */
public final class zlo extends abnv implements abox {
    public static final zlo a;
    private int b;
    private zpl c;
    private byte d = 2;

    static {
        zlo zloVar = new zlo();
        a = zloVar;
        abnv.P(zlo.class, zloVar);
    }

    private zlo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\u0007ᐉ\u0005", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zlo();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zlo.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
