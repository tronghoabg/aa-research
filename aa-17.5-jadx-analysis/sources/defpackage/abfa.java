package defpackage;

/* loaded from: classes3.dex */
public final class abfa extends abnv implements abox {
    public static final abfa a;
    private int b;
    private zkk c;
    private byte d = 2;

    static {
        abfa abfaVar = new abfa();
        a = abfaVar;
        abnv.P(abfa.class, abfaVar);
    }

    private abfa() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abfa();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abfa.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
