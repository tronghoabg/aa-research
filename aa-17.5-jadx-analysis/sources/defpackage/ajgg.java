package defpackage;

/* loaded from: classes3.dex */
public final class ajgg extends abnv implements abox {
    public static final ajgg a;
    public int b;
    public aboh c = abpf.b;
    public ajgf d;

    static {
        ajgg ajggVar = new ajgg();
        a = ajggVar;
        abnv.P(ajgg.class, ajggVar);
    }

    private ajgg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ajgg();
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
        return abnv.L(ajgg.class);
    }
}
