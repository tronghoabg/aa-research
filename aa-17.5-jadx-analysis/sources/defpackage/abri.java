package defpackage;

/* loaded from: classes.dex */
public final class abri extends abnv implements abox {
    public static final abri a;
    public aboh b = abpf.b;

    static {
        abri abriVar = new abri();
        a = abriVar;
        abnv.P(abri.class, abriVar);
    }

    private abri() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", abrh.class});
        }
        if (i2 == 3) {
            return new abri();
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
        return abnv.L(abri.class);
    }
}
