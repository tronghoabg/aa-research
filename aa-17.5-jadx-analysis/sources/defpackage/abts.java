package defpackage;

/* loaded from: classes3.dex */
public final class abts extends abns implements abnt {
    public static final abts a;
    private int b;
    private abto c;
    private absx d;
    private abty e;
    private abtr f;
    private abtv g;
    private byte h = 2;

    static {
        abts abtsVar = new abts();
        a = abtsVar;
        abnv.P(abts.class, abtsVar);
    }

    private abts() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0003Ϫ\u0005\u0000\u0000\u0005\u0003ᐉ\u0002\tᐉ\u0005/ᐉ\t1ᐉ\u0007Ϫᐉ\u000e", new Object[]{"b", "c", "d", "f", "e", "g"});
        }
        if (i2 == 3) {
            return new abts();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abts.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
