package defpackage;

/* loaded from: classes3.dex */
public final class abtf extends abns implements abnt {
    public static final abtf a;
    private int b;
    private zkk c;
    private abty d;
    private byte e = 2;

    static {
        abtf abtfVar = new abtf();
        a = abtfVar;
        abnv.P(abtf.class, abtfVar);
    }

    private abtf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\n\r\u0002\u0000\u0000\u0002\nᐉ\u0007\rᐉ\t", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abtf();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abtf.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
