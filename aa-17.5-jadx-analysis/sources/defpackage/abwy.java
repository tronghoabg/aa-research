package defpackage;

/* loaded from: classes3.dex */
public final class abwy extends abnv implements abox {
    public static final abwy a;
    public aboh b = abpf.b;

    static {
        abwy abwyVar = new abwy();
        a = abwyVar;
        abnv.P(abwy.class, abwyVar);
    }

    private abwy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", abww.class});
        }
        if (i2 == 3) {
            return new abwy();
        }
        if (i2 == 4) {
            return new abwx();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(abwy.class);
    }
}
