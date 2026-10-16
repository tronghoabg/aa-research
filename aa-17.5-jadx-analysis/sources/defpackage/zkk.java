package defpackage;

/* loaded from: classes3.dex */
public final class zkk extends abnv implements abox {
    public static final zkk a;
    public int b;
    public long c;
    public long d;
    private byte e = 2;

    static {
        zkk zkkVar = new zkk();
        a = zkkVar;
        abnv.P(zkk.class, zkkVar);
    }

    private zkk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔅ\u0000\u0002ᔅ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new zkk();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zkk.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
