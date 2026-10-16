package defpackage;

/* loaded from: classes3.dex */
public final class achc extends abnv implements abox {
    public static final achc a;
    private int b;
    private aapc c;
    private byte d = 2;

    static {
        achc achcVar = new achc();
        a = achcVar;
        abnv.P(achc.class, achcVar);
    }

    private achc() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new achc();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(achc.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
