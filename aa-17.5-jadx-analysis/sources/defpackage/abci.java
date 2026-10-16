package defpackage;

/* loaded from: classes3.dex */
public final class abci extends abnv implements abox {
    public static final abci a;
    private byte c = 2;
    public aboh b = abpf.b;

    static {
        abci abciVar = new abci();
        a = abciVar;
        abnv.P(abci.class, abciVar);
    }

    private abci() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", abcn.class});
        }
        if (i2 == 3) {
            return new abci();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abci.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
