package defpackage;

/* loaded from: classes3.dex */
public final class aaoa extends abnv implements abox {
    public static final aaoa a;
    private int b;
    private aapc c;
    private abkz d;
    private byte e = 2;

    static {
        aaoa aaoaVar = new aaoa();
        a = aaoaVar;
        abnv.P(aaoa.class, aaoaVar);
    }

    private aaoa() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0005\b\u0002\u0000\u0000\u0001\u0005ဉ\u0001\bᐉ\u0003", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aaoa();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aaoa.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
