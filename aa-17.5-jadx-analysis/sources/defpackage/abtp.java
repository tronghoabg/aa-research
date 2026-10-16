package defpackage;

/* loaded from: classes3.dex */
public final class abtp extends abns implements abnt {
    public static final abtp a;
    private int b;
    private abtb c;
    private abtu d;
    private absv e;
    private abtq f;
    private byte g = 2;

    static {
        abtp abtpVar = new abtp();
        a = abtpVar;
        abnv.P(abtp.class, abtpVar);
    }

    private abtp() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0004\u0016\u0004\u0000\u0000\u0004\u0004ᐉ\b\u000fᐉ\u0012\u0010ᐉ\t\u0016ᐉ\u0005", new Object[]{"b", "d", "f", "e", "c"});
        }
        if (i2 == 3) {
            return new abtp();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abtp.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
