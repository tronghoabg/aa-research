package defpackage;

/* loaded from: classes3.dex */
public final class aauz extends abnv implements abox {
    public static final aauz a;
    public abgk b;
    public String c;
    private int d;
    private byte e = 2;

    static {
        aauz aauzVar = new aauz();
        a = aauzVar;
        abnv.P(aauz.class, aauzVar);
    }

    private aauz() {
        Object[] objArr = abpf.a;
        this.c = "";
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ᐉ\u0000\u0003ဈ\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new aauz();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aauz.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
