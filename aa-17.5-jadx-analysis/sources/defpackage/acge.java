package defpackage;

/* loaded from: classes3.dex */
public final class acge extends abnv implements abox {
    public static final acge a;
    private int b;
    private abkz c;
    private aapc d;
    private byte e = 2;

    static {
        acge acgeVar = new acge();
        a = acgeVar;
        abnv.P(acge.class, acgeVar);
    }

    private acge() {
        Object[] objArr = abpf.a;
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0011\u0012\u0002\u0000\u0000\u0001\u0011ဉ\u000e\u0012ᐉ\r", new Object[]{"b", "d", "c"});
        }
        if (i2 == 3) {
            return new acge();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acge.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
