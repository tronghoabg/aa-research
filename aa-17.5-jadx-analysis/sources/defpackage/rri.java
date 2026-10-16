package defpackage;

/* loaded from: classes.dex */
public final class rri extends abnv implements abox {
    public static final rri a;
    public aboh b = abpf.b;

    static {
        rri rriVar = new rri();
        a = rriVar;
        abnv.P(rri.class, rriVar);
    }

    private rri() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", rrh.class});
        }
        if (i2 == 3) {
            return new rri();
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
        return abnv.L(rri.class);
    }
}
