package defpackage;

/* loaded from: classes2.dex */
public final class pbb extends abnv implements abox {
    public static final pbb a;
    public aboh b = abpf.b;

    static {
        pbb pbbVar = new pbb();
        a = pbbVar;
        abnv.P(pbb.class, pbbVar);
    }

    private pbb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", pba.class});
        }
        if (i2 == 3) {
            return new pbb();
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
        return abnv.L(pbb.class);
    }
}
