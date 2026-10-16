package defpackage;

/* loaded from: classes3.dex */
public final class abiq extends abnv implements abox {
    public static final abiq a;
    public int b;
    public long c;
    public abid d;
    public float e;
    public int f;
    public int g;

    static {
        abiq abiqVar = new abiq();
        a = abiqVar;
        abnv.P(abiq.class, abiqVar);
    }

    private abiq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001\u0003ခ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new abiq();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(abiq.class);
    }
}
