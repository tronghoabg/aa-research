package defpackage;

/* loaded from: classes3.dex */
public final class aban extends abnv implements abox {
    public static final aban a;
    public aboh b = abpf.b;

    static {
        aban abanVar = new aban();
        a = abanVar;
        abnv.P(aban.class, abanVar);
    }

    private aban() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", abaw.class});
        }
        if (i2 == 3) {
            return new aban();
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
        return abnv.L(aban.class);
    }
}
