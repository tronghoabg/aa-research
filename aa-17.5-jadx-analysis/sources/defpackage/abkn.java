package defpackage;

/* loaded from: classes3.dex */
public final class abkn extends abnv implements abox {
    public static final abkn a;
    private int b;
    private abkw c;
    private aaif d;
    private byte e = 2;

    static {
        abkn abknVar = new abkn();
        a = abknVar;
        abnv.P(abkn.class, abknVar);
    }

    private abkn() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0002\r\u0002\u0000\u0000\u0002\u0002ᐉ\u0000\rᐉ\b", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abkn();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abkn.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
