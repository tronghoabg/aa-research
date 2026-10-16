package defpackage;

/* loaded from: classes.dex */
public final class xif extends abnv implements abox {
    public static final xif a;
    public aboh b;
    public aboh c;
    public aboh d;

    static {
        xif xifVar = new xif();
        a = xifVar;
        abnv.P(xif.class, xifVar);
    }

    private xif() {
        abpf abpfVar = abpf.b;
        this.b = abpfVar;
        this.c = abpfVar;
        this.d = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"b", xgk.class, "c", xic.class, "d", xgb.class});
        }
        if (i2 == 3) {
            return new xif();
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
        return abnv.L(xif.class);
    }
}
