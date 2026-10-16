package defpackage;

/* loaded from: classes3.dex */
public final class zkz extends abnv implements abox {
    public static final zkz a;
    private int c;
    private zna d;
    private znt e;
    private byte f = 2;
    public aboh b = abpf.b;

    static {
        zkz zkzVar = new zkz();
        a = zkzVar;
        abnv.P(zkz.class, zkzVar);
    }

    private zkz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0001\u0003\u0001Л\u0005ᐉ\u0002\bᐉ\u0003", new Object[]{"c", "b", zku.class, "d", "e"});
        }
        if (i2 == 3) {
            return new zkz();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zkz.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
