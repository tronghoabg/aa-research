package defpackage;

/* loaded from: classes3.dex */
public final class taa extends abnv implements abox {
    public static final taa a;
    public int b;
    public aboh c = abpf.b;
    public tau d;

    static {
        taa taaVar = new taa();
        a = taaVar;
        abnv.P(taa.class, taaVar);
    }

    private taa() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", tbc.class, "d"});
        }
        if (i2 == 3) {
            return new taa();
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
        return abnv.L(taa.class);
    }
}
