package defpackage;

/* loaded from: classes3.dex */
public final class abfq extends abnv implements abox {
    public static final abfq a;
    private abot b;
    private abot c;
    private abot d;
    private abot e;
    private byte f;

    static {
        abfq abfqVar = new abfq();
        a = abfqVar;
        abnv.P(abfq.class, abfqVar);
    }

    private abfq() {
        abot abotVar = abot.a;
        this.b = abotVar;
        this.c = abotVar;
        this.d = abotVar;
        this.e = abotVar;
        this.f = (byte) 2;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            abqd abqdVar = abqd.INT32;
            return new abpg(a, "\u0004\u0004\u0000\u0000\u0004\u0007\u0004\u0004\u0000\u0000\u00042\u00052\u00062\u0007࠲", new Object[]{"b", new lds(abqdVar, 0, abqdVar, 0), "c", new lds(abqdVar, 0, abqd.MESSAGE, abfr.a), "d", new lds(abqdVar, 0, abqdVar, 0), "e", new lds(abqdVar, 0, abqd.ENUM, 0), abce.n});
        }
        if (i2 == 3) {
            return new abfq();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abfq.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
