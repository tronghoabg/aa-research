package defpackage;

/* loaded from: classes3.dex */
public final class abcf extends abns implements abnt {
    public static final abcf a;
    public int b;
    public int c;
    public abaz d;
    public abcv e;
    public abdf f;
    public abfh g;
    public abef h;
    public abdw i;
    private byte j = 2;

    static {
        abcf abcfVar = new abcf();
        a = abcfVar;
        abnv.P(abcf.class, abcfVar);
    }

    private abcf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0001\u0001င\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0006ဉ\u0005\bဉ\u0006\tဉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new abcf();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abcf.class);
        }
        this.j = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
