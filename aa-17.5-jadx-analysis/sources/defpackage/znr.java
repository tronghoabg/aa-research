package defpackage;

/* loaded from: classes3.dex */
public final class znr extends abnv implements abox {
    public static final znr a;
    private int b;
    private ablv c;
    private byte d = 2;

    static {
        znr znrVar = new znr();
        a = znrVar;
        abnv.P(znr.class, znrVar);
    }

    private znr() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0001\tᐉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new znr();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(znr.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
