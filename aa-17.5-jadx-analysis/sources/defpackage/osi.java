package defpackage;

/* loaded from: classes2.dex */
public final class osi extends abnv implements abox {
    public static final osi a;
    public int b;
    public int c;
    public aboh d;
    public aboh e;
    public osc f;

    static {
        osi osiVar = new osi();
        a = osiVar;
        abnv.P(osi.class, osiVar);
    }

    private osi() {
        abpf abpfVar = abpf.b;
        this.d = abpfVar;
        this.e = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001a\u0003\u001b\u0004ဉ\u0001", new Object[]{"b", "c", orj.g, "d", "e", osh.class, "f"});
        }
        if (i2 == 3) {
            return new osi();
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
        return abnv.L(osi.class);
    }
}
