package defpackage;

/* loaded from: classes3.dex */
public final class abxm extends abnv implements abox {
    public static final abxm a;
    public aboh b = abpf.b;

    static {
        abxm abxmVar = new abxm();
        a = abxmVar;
        abnv.P(abxm.class, abxmVar);
    }

    private abxm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", abxl.class});
        }
        if (i2 == 3) {
            return new abxm();
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
        return abnv.L(abxm.class);
    }
}
