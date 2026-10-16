package defpackage;

/* loaded from: classes3.dex */
public final class aaql extends abnv implements abox {
    public static final aaql a;
    private int b;
    private abkz c;
    private byte d = 2;

    static {
        aaql aaqlVar = new aaql();
        a = aaqlVar;
        abnv.P(aaql.class, aaqlVar);
    }

    private aaql() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0004", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aaql();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aaql.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
