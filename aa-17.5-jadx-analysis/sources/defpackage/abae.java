package defpackage;

/* loaded from: classes3.dex */
public final class abae extends abnv implements abox {
    public static final abae a;
    private int b;
    private abaa c;
    private byte d = 2;

    static {
        abae abaeVar = new abae();
        a = abaeVar;
        abnv.P(abae.class, abaeVar);
    }

    private abae() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\u0007ᐉ\u0006", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abae();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abae.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
