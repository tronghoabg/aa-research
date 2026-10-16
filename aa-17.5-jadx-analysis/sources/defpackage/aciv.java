package defpackage;

/* loaded from: classes3.dex */
public final class aciv extends abnv implements abox {
    public static final aciv a;
    public int b;
    public int c;
    private int e;
    private byte f = 2;
    public abms d = abms.d;

    static {
        aciv acivVar = new aciv();
        a = acivVar;
        abnv.P(aciv.class, acivVar);
    }

    private aciv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001$&\u0003\u0000\u0000\u0003$ᔄ\u0000%ᔄ\u0001&ᔊ\u0002", new Object[]{"e", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new aciv();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aciv.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
