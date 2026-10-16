package defpackage;

/* loaded from: classes3.dex */
public final class abhn extends abnv implements abox {
    public static final abhn a;
    public static final abnh c;
    private int d;
    private abcs e;
    private byte f = 2;
    public abod b = abnw.a;

    static {
        abhn abhnVar = new abhn();
        a = abhnVar;
        abnv.P(abhn.class, abhnVar);
        c = abnv.W(abje.a, abhnVar, abhnVar, null, 10000, abqd.MESSAGE);
    }

    private abhn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0003'", new Object[]{"d", "e", "b"});
        }
        if (i2 == 3) {
            return new abhn();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abhn.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
