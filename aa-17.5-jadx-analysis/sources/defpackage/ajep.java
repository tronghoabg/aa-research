package defpackage;

/* loaded from: classes3.dex */
public final class ajep extends abnv implements abox {
    public static final ajep a;
    public int b;
    public aboh c;
    public aboh d;
    public ajeo e;

    static {
        ajep ajepVar = new ajep();
        a = ajepVar;
        abnv.P(ajep.class, ajepVar);
    }

    private ajep() {
        abpf abpfVar = abpf.b;
        this.c = abpfVar;
        this.d = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"b", "c", ajes.class, "d", ajen.class, "e"});
        }
        if (i2 == 3) {
            return new ajep();
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
        return abnv.L(ajep.class);
    }
}
