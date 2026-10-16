package defpackage;

/* loaded from: classes3.dex */
public final class tab extends abnv implements abox {
    public static final tab a;
    public aboh b = abpf.b;

    static {
        tab tabVar = new tab();
        a = tabVar;
        abnv.P(tab.class, tabVar);
    }

    private tab() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", szu.class});
        }
        if (i2 == 3) {
            return new tab();
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
        return abnv.L(tab.class);
    }
}
