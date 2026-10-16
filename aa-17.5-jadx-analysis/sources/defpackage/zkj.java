package defpackage;

/* loaded from: classes3.dex */
public final class zkj extends abnv implements abox {
    public static final zkj a;
    private int b;
    private zkk c;
    private byte d = 2;

    static {
        zkj zkjVar = new zkj();
        a = zkjVar;
        abnv.P(zkj.class, zkjVar);
    }

    private zkj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zkj();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zkj.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
