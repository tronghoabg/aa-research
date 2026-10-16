package defpackage;

/* loaded from: classes3.dex */
public final class abca extends abnv implements abox {
    public static final abca a;
    public aboh b;
    public aboh c;
    public abod d;

    static {
        abca abcaVar = new abca();
        a = abcaVar;
        abnv.P(abca.class, abcaVar);
    }

    private abca() {
        abpf abpfVar = abpf.b;
        this.b = abpfVar;
        this.c = abpfVar;
        this.d = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0003\u0000\u0002\u001b\u0003\u001b\u0004\u0016", new Object[]{"b", abby.class, "c", abby.class, "d"});
        }
        if (i2 == 3) {
            return new abca();
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
        return abnv.L(abca.class);
    }
}
