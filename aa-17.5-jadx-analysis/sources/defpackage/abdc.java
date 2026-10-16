package defpackage;

/* loaded from: classes3.dex */
public final class abdc extends abns implements abnt {
    public static final abdc a;
    private int b;
    private abdl c;
    private byte d = 2;

    static {
        abdc abdcVar = new abdc();
        a = abdcVar;
        abnv.P(abdc.class, abdcVar);
    }

    private abdc() {
        abms abmsVar = abms.d;
        abnw abnwVar = abnw.a;
        abor aborVar = abor.a;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0001\u000fᐉ\f", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abdc();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abdc.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
