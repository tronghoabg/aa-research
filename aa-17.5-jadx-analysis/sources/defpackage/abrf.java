package defpackage;

/* loaded from: classes.dex */
public final class abrf extends abnv implements abox {
    public static final abrf a;
    public aboh b = abpf.b;

    static {
        abrf abrfVar = new abrf();
        a = abrfVar;
        abnv.P(abrf.class, abrfVar);
    }

    private abrf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", abre.class});
        }
        if (i2 == 3) {
            return new abrf();
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
        return abnv.L(abrf.class);
    }
}
