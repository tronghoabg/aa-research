package defpackage;

/* loaded from: classes3.dex */
public final class abhz extends abnv implements abox {
    public static final abhz a;
    public aboh b = abpf.b;

    static {
        abhz abhzVar = new abhz();
        a = abhzVar;
        abnv.P(abhz.class, abhzVar);
    }

    private abhz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", abhl.class});
        }
        if (i2 == 3) {
            return new abhz();
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
        return abnv.L(abhz.class);
    }
}
