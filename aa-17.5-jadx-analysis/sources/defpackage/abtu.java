package defpackage;

/* loaded from: classes3.dex */
public final class abtu extends abnv implements abox {
    public static final abtu a;
    private int b;
    private zkk c;
    private ablb d;
    private byte e = 2;

    static {
        abtu abtuVar = new abtu();
        a = abtuVar;
        abnv.P(abtu.class, abtuVar);
    }

    private abtu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0002\u0002ᐉ\u0003\u0004ᐉ\u0005", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abtu();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abtu.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
