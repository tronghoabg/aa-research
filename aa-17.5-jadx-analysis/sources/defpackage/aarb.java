package defpackage;

/* loaded from: classes3.dex */
public final class aarb extends abnv implements abox {
    public static final aarb a;
    private int b;
    private aapc c;
    private abkz d;
    private byte e = 2;

    static {
        aarb aarbVar = new aarb();
        a = aarbVar;
        abnv.P(aarb.class, aarbVar);
    }

    private aarb() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0001\u0003ဉ\u0001\u0005ᐉ\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aarb();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aarb.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
