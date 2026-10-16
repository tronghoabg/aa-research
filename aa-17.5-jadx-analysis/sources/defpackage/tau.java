package defpackage;

/* loaded from: classes3.dex */
public final class tau extends abnv implements abox {
    public static final tau a;
    public int b;
    public int c;
    public aboh d = abpf.b;

    static {
        tau tauVar = new tau();
        a = tauVar;
        abnv.P(tau.class, tauVar);
    }

    private tau() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"b", "c", orj.u, "d", tac.class});
        }
        if (i2 == 3) {
            return new tau();
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
        return abnv.L(tau.class);
    }
}
