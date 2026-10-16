package defpackage;

/* loaded from: classes3.dex */
public final class aavc extends abnv implements abox {
    public static final aavc a;
    public int b;
    public String c = "";
    public aboh d;
    public aaup e;
    public String f;
    public aaut g;
    public aboh h;
    private int i;

    static {
        aavc aavcVar = new aavc();
        a = aavcVar;
        abnv.P(aavc.class, aavcVar);
    }

    private aavc() {
        abpf abpfVar = abpf.b;
        this.d = abpfVar;
        this.f = "";
        this.h = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0005ဈ\u0004\u0007\u001b\bဉ\u0006\tဈ\u0007\nဉ\b\u000b\u001b", new Object[]{"i", "b", zli.n, "c", "d", aaus.class, "e", "f", "g", "h", aaur.class});
        }
        if (i2 == 3) {
            return new aavc();
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
        return abnv.L(aavc.class);
    }
}
