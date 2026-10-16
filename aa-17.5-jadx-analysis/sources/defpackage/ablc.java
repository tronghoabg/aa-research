package defpackage;

/* loaded from: classes3.dex */
public final class ablc extends abnv implements abox {
    public static final ablc a;
    private int b;
    private abkz c;
    private abll d;
    private byte e = 2;

    static {
        ablc ablcVar = new ablc();
        a = ablcVar;
        abnv.P(ablc.class, ablcVar);
    }

    private ablc() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0003\r\u0002\u0000\u0000\u0002\u0003ᐉ\u0003\rᐉ\b", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ablc();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ablc.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
