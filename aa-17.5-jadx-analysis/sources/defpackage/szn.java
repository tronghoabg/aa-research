package defpackage;

/* loaded from: classes3.dex */
public final class szn extends abnv implements abox {
    public static final szn a;
    public aboh b;
    public aboh c;

    static {
        szn sznVar = new szn();
        a = sznVar;
        abnv.P(szn.class, sznVar);
    }

    private szn() {
        abpf abpfVar = abpf.b;
        this.b = abpfVar;
        this.c = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001b", new Object[]{"b", "c", orz.class});
        }
        if (i2 == 3) {
            return new szn();
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
        return abnv.L(szn.class);
    }
}
