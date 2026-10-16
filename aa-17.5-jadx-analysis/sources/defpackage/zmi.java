package defpackage;

/* loaded from: classes3.dex */
public final class zmi extends abnv implements abox {
    public static final zmi a;
    private int b;
    private zmp c;
    private byte d = 2;

    static {
        zmi zmiVar = new zmi();
        a = zmiVar;
        abnv.P(zmi.class, zmiVar);
    }

    private zmi() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u0006ᐉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zmi();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zmi.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
