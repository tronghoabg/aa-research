package defpackage;

/* loaded from: classes3.dex */
public final class zkx extends abnv implements abox {
    public static final zkx a;
    public int b;
    public zkw c;
    public zkv d;
    public zkq e;
    public zky f;
    private byte g = 2;

    static {
        zkx zkxVar = new zkx();
        a = zkxVar;
        abnv.P(zkx.class, zkxVar);
    }

    private zkx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0007ᐉ\u0007", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new zkx();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zkx.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
