package defpackage;

/* loaded from: classes3.dex */
public final class aazv extends abnv implements abox {
    public static final aazv a;
    public static final abnh e;
    public int b;
    public int c;
    public boolean d;
    private byte f = 2;

    static {
        aazv aazvVar = new aazv();
        a = aazvVar;
        abnv.P(aazv.class, aazvVar);
        e = abnv.W(abab.a, aazvVar, aazvVar, null, 421707520, abqd.MESSAGE);
    }

    private aazv() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\t\n\u0002\u0000\u0000\u0000\t᠌\u0000\nဇ\b", new Object[]{"b", "c", zli.o, "d"});
        }
        if (i2 == 3) {
            return new aazv();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aazv.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
