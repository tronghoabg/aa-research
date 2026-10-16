package defpackage;

/* loaded from: classes2.dex */
public final class akgd extends abnv implements abox {
    public static final akgd a;
    public aboh b = abpf.b;

    static {
        akgd akgdVar = new akgd();
        a = akgdVar;
        abnv.P(akgd.class, akgdVar);
    }

    private akgd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", akgc.class});
        }
        if (i2 == 3) {
            return new akgd();
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
        return abnv.L(akgd.class);
    }
}
