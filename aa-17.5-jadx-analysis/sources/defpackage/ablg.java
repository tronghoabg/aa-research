package defpackage;

/* loaded from: classes3.dex */
public final class ablg extends abnv implements abox {
    public static final ablg a;
    private int b;
    private ablk c;

    static {
        ablg ablgVar = new ablg();
        a = ablgVar;
        abnv.P(ablg.class, ablgVar);
    }

    private ablg() {
        Object[] objArr = abpf.a;
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0014\u0014\u0001\u0000\u0000\u0000\u0014ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ablg();
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
        return abnv.L(ablg.class);
    }
}
