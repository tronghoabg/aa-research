package defpackage;

/* loaded from: classes3.dex */
public final class acgu extends abnv implements abox {
    public static final acgu a;
    private int b;
    private aapc c;
    private abkz d;
    private byte e = 2;

    static {
        acgu acguVar = new acgu();
        a = acguVar;
        abnv.P(acgu.class, acguVar);
    }

    private acgu() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0001\u0004ဉ\u0001\u0005ᐉ\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new acgu();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acgu.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
