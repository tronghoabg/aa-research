package defpackage;

/* loaded from: classes.dex */
public final class acas extends abnv implements abox {
    public static final acas a;
    public aboh b = abpf.b;

    static {
        acas acasVar = new acas();
        a = acasVar;
        abnv.P(acas.class, acasVar);
    }

    private acas() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", acar.class});
        }
        if (i2 == 3) {
            return new acas();
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
        return abnv.L(acas.class);
    }
}
