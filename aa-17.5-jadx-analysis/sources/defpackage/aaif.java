package defpackage;

/* loaded from: classes3.dex */
public final class aaif extends abnv implements abox {
    public static final aaif a;
    private int b;
    private abfs c;
    private abfs d;
    private byte e = 2;

    static {
        aaif aaifVar = new aaif();
        a = aaifVar;
        abnv.P(aaif.class, aaifVar);
    }

    private aaif() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003ᐉ\u0000\u0004ᐉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aaif();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aaif.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
