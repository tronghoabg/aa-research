package defpackage;

/* loaded from: classes3.dex */
public final class abat extends abnv implements abox {
    public static final abat a;
    public aboh b = abpf.b;
    public int c = 2;
    private int d;

    static {
        abat abatVar = new abat();
        a = abatVar;
        abnv.P(abat.class, abatVar);
    }

    private abat() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002᠌\u0001", new Object[]{"d", "b", abar.class, "c", zli.s});
        }
        if (i2 == 3) {
            return new abat();
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
        return abnv.L(abat.class);
    }
}
