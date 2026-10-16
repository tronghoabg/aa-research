package defpackage;

/* loaded from: classes3.dex */
public final class abec extends abnv implements abox {
    public static final abec a;
    public aboh b = abpf.b;

    static {
        abec abecVar = new abec();
        a = abecVar;
        abnv.P(abec.class, abecVar);
    }

    private abec() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", abeb.class});
        }
        if (i2 == 3) {
            return new abec();
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
        return abnv.L(abec.class);
    }
}
