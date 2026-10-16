package defpackage;

/* loaded from: classes3.dex */
public final class aany extends abnv implements abox {
    public static final aany a;
    private int b;
    private abkz c;
    private aapc d;
    private byte e = 2;

    static {
        aany aanyVar = new aany();
        a = aanyVar;
        abnv.P(aany.class, aanyVar);
    }

    private aany() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0001\u0003ᐉ\u0000\u0005ဉ\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aany();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aany.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
