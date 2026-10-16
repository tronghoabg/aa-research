package defpackage;

/* loaded from: classes3.dex */
public final class aapl extends abnv implements abox {
    public static final aapl a;
    private int b;
    private abkz d;
    private abot c = abot.a;
    private byte e = 2;

    static {
        aapl aaplVar = new aapl();
        a = aaplVar;
        abnv.P(aapl.class, aaplVar);
    }

    private aapl() {
        Object[] objArr = abpf.a;
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            abqd abqdVar = abqd.STRING;
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u000b\u0002\u0001\u0000\u0001\u0001ᐉ\t\u000b2", new Object[]{"b", "d", "c", new lds(abqdVar, "", abqdVar, "")});
        }
        if (i2 == 3) {
            return new aapl();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aapl.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
