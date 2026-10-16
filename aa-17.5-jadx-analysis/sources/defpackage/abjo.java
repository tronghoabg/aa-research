package defpackage;

/* loaded from: classes3.dex */
public final class abjo extends abnv implements abox {
    public static final abjo a;
    public int b = -1;
    public int c;
    private int d;

    static {
        abjo abjoVar = new abjo();
        a = abjoVar;
        abnv.P(abjo.class, abjoVar);
    }

    private abjo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001", new Object[]{"d", "b", "c", abho.f});
        }
        if (i2 == 3) {
            return new abjo();
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
        return abnv.L(abjo.class);
    }
}
