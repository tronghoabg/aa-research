package defpackage;

/* loaded from: classes3.dex */
public final class abay extends abns implements abnt {
    public static final abay a;
    private byte c = 2;
    public aboh b = abpf.b;

    static {
        abay abayVar = new abay();
        a = abayVar;
        abnv.P(abay.class, abayVar);
    }

    private abay() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", abax.class});
        }
        if (i2 == 3) {
            return new abay();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abay.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
