package defpackage;

/* loaded from: classes3.dex */
public final class abun extends abnv implements abox {
    public static final abun a;
    public int b;
    public abum c;
    public abnf d;

    static {
        abun abunVar = new abun();
        a = abunVar;
        abnv.P(abun.class, abunVar);
    }

    private abun() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abun();
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
        return abnv.L(abun.class);
    }
}
