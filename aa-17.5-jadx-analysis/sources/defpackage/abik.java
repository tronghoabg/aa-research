package defpackage;

/* loaded from: classes3.dex */
public final class abik extends abnv implements abox {
    public static final abik a;
    public int b;
    public int c = 9;
    public int d = 2;

    static {
        abik abikVar = new abik();
        a = abikVar;
        abnv.P(abik.class, abikVar);
    }

    private abik() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", abce.d, "d", abce.c});
        }
        if (i2 == 3) {
            return new abik();
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
        return abnv.L(abik.class);
    }
}
