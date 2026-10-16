package defpackage;

/* loaded from: classes3.dex */
public final class aaom extends abnv implements abox {
    public static final aaom a;
    private int b;
    private int c;
    private acgb d;
    private abkz e;
    private aapc f;
    private byte g = 2;

    static {
        aaom aaomVar = new aaom();
        a = aaomVar;
        abnv.P(aaom.class, aaomVar);
    }

    private aaom() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0002\u0002\u0016\u0003\u0000\u0000\u0001\u0002ဉ\u0002\u0003ᐉ\u0004\u0016ဉ#", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new aaom();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aaom.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
