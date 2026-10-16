package defpackage;

/* loaded from: classes3.dex */
public final class acfe extends abnv implements abox {
    public static final acfe a;
    private int c;
    private acff d;
    private byte e = 2;
    public aboh b = abpf.b;

    static {
        acfe acfeVar = new acfe();
        a = acfeVar;
        abnv.P(acfe.class, acfeVar);
    }

    private acfe() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᔉ\u0000\u0002\u001a", new Object[]{"c", "d", "b"});
        }
        if (i2 == 3) {
            return new acfe();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acfe.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
