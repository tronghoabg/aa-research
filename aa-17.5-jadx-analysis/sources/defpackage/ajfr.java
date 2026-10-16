package defpackage;

/* loaded from: classes2.dex */
public final class ajfr extends abnv implements abox {
    public static final ajfr a;
    public long b;
    public String c = "";
    public aboh d;
    public abpt e;
    public aboh f;
    private int g;

    static {
        ajfr ajfrVar = new ajfr();
        a = ajfrVar;
        abnv.P(ajfr.class, ajfrVar);
    }

    private ajfr() {
        abpf abpfVar = abpf.b;
        this.d = abpfVar;
        this.f = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0002\u0000\u0001စ\u0000\u0002ဈ\u0001\u0004ဉ\u0004\u0007\u001b\b\u001b", new Object[]{"g", "b", "c", "e", "f", ajfv.class, "d", ajfq.class});
        }
        if (i2 == 3) {
            return new ajfr();
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
        return abnv.L(ajfr.class);
    }
}
