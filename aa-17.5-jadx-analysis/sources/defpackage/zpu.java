package defpackage;

/* loaded from: classes3.dex */
public final class zpu extends abnv implements abox {
    public static final zpu a;
    private int b;
    private zpz c;
    private zjv d;
    private zpw e;
    private byte f = 2;

    static {
        zpu zpuVar = new zpu();
        a = zpuVar;
        abnv.P(zpu.class, zpuVar);
    }

    private zpu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0000\u0002\u0003ဉ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new zpu();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zpu.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
