package defpackage;

/* loaded from: classes3.dex */
public final class abtb extends abnv implements abox {
    public static final abtb a;
    private int b;
    private abtf c;
    private abtf d;
    private abtf e;
    private zkm f;
    private byte g = 2;

    static {
        abtb abtbVar = new abtb();
        a = abtbVar;
        abnv.P(abtb.class, abtbVar);
    }

    private abtb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001Ϫ\u0004\u0000\u0000\u0004\u0001ᐉ\u0001\u0002ᐉ\u0002\u0005ᐉ\u0003Ϫᐉ\u0010", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new abtb();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abtb.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
