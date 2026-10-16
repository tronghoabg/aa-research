package defpackage;

/* loaded from: classes3.dex */
public final class xnm extends abnv implements abox {
    public static final xnm a;
    public aboh b = abpf.b;

    static {
        xnm xnmVar = new xnm();
        a = xnmVar;
        abnv.P(xnm.class, xnmVar);
    }

    private xnm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", xgi.class});
        }
        if (i2 == 3) {
            return new xnm();
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
        return abnv.L(xnm.class);
    }
}
