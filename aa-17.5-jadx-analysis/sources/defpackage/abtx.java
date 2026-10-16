package defpackage;

/* loaded from: classes3.dex */
public final class abtx extends abnv implements abox {
    public static final abtx a;
    private int b;
    private zkk c;
    private zkm d;
    private zkl e;
    private abtu f;
    private byte g = 2;

    static {
        abtx abtxVar = new abtx();
        a = abtxVar;
        abnv.P(abtx.class, abtxVar);
    }

    private abtx() {
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0003\u000e\u0004\u0000\u0000\u0004\u0003ᐉ\u0002\u0004ᐉ\u0006\rᐉ\u0004\u000eᐉ\u0010", new Object[]{"b", "c", "e", "d", "f"});
        }
        if (i2 == 3) {
            return new abtx();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abtx.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
