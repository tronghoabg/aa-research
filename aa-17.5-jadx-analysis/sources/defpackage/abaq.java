package defpackage;

/* loaded from: classes3.dex */
public final class abaq extends abnv implements abox {
    public static final abaq a;
    public abod b;
    public abod c;
    public aboh d;

    static {
        abaq abaqVar = new abaq();
        a = abaqVar;
        abnv.P(abaq.class, abaqVar);
    }

    private abaq() {
        abnw abnwVar = abnw.a;
        this.b = abnwVar;
        this.c = abnwVar;
        this.d = abpf.b;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001'\u0002'\u0003\u001b", new Object[]{"b", "c", "d", abap.class});
        }
        if (i2 == 3) {
            return new abaq();
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
        return abnv.L(abaq.class);
    }
}
