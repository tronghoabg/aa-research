package defpackage;

/* loaded from: classes3.dex */
public final class abgq extends abns implements abnt {
    public static final abgq a;
    private byte c = 2;
    public aboh b = abpf.b;

    static {
        abgq abgqVar = new abgq();
        a = abgqVar;
        abnv.P(abgq.class, abgqVar);
    }

    private abgq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", abgp.class});
        }
        if (i2 == 3) {
            return new abgq();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abgq.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
