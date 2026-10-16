package defpackage;

/* loaded from: classes3.dex */
public final class abks extends abnv implements abox {
    public static final abks a;
    public int b;
    public int c;
    public abkt d;
    public int e;

    static {
        abks abksVar = new abks();
        a = abksVar;
        abnv.P(abks.class, abksVar);
    }

    private abks() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002င\u0000\u0003ဉ\u0001\u0004᠌\u0002", new Object[]{"b", "c", "d", "e", abho.n});
        }
        if (i2 == 3) {
            return new abks();
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
        return abnv.L(abks.class);
    }
}
