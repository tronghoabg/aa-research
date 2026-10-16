package defpackage;

/* loaded from: classes3.dex */
public final class abex extends abnv implements abox {
    public static final abex a;
    public int b;
    public int c;
    public abam d;

    static {
        abex abexVar = new abex();
        a = abexVar;
        abnv.P(abex.class, abexVar);
    }

    private abex() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abex();
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
        return abnv.L(abex.class);
    }
}
