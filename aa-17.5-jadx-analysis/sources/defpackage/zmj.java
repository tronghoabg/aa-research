package defpackage;

/* loaded from: classes3.dex */
public final class zmj extends abnv implements abox {
    public static final zmj a;
    private int b;
    private zlb c;
    private byte d = 2;

    static {
        zmj zmjVar = new zmj();
        a = zmjVar;
        abnv.P(zmj.class, zmjVar);
    }

    private zmj() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\n\n\u0001\u0000\u0000\u0001\nᐉ\u0004", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zmj();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zmj.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
