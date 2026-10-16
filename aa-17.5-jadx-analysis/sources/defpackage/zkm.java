package defpackage;

/* loaded from: classes3.dex */
public final class zkm extends abnv implements abox {
    public static final zkm a;
    public zkl b;
    public zkl c;
    private int d;
    private byte e = 2;

    static {
        zkm zkmVar = new zkm();
        a = zkmVar;
        abnv.P(zkm.class, zkmVar);
    }

    private zkm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔉ\u0000\u0002ᔉ\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new zkm();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zkm.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
