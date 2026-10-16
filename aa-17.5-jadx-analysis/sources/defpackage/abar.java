package defpackage;

/* loaded from: classes3.dex */
public final class abar extends abnv implements abox {
    public static final abar a;
    public aboh b = abpf.b;
    public int c = 1;
    private int d;

    static {
        abar abarVar = new abar();
        a = abarVar;
        abnv.P(abar.class, abarVar);
    }

    private abar() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002᠌\u0000", new Object[]{"d", "b", abao.class, "c", zli.s});
        }
        if (i2 == 3) {
            return new abar();
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
        return abnv.L(abar.class);
    }
}
