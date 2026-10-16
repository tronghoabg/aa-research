package defpackage;

/* loaded from: classes3.dex */
public final class abtn extends abns implements abnt {
    public static final abtn a;
    private int b;
    private abtt c;
    private byte d = 2;

    static {
        abtn abtnVar = new abtn();
        a = abtnVar;
        abnv.P(abtn.class, abtnVar);
    }

    private abtn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0007", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abtn();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abtn.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
