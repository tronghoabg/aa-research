package defpackage;

/* loaded from: classes3.dex */
public final class ablv extends abns implements abnt {
    public static final ablv a;
    private int b;
    private byte d = 2;
    private String c = "";

    static {
        ablv ablvVar = new ablv();
        a = ablvVar;
        abnv.P(ablv.class, ablvVar);
    }

    private ablv() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ablv();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ablv.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
