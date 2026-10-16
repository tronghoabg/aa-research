package defpackage;

/* loaded from: classes.dex */
public final class ywu extends abnv implements abox {
    public static final ywu a;
    public int b;
    public aboh c = abpf.b;
    public int d;

    static {
        ywu ywuVar = new ywu();
        a = ywuVar;
        abnv.P(ywu.class, ywuVar);
    }

    private ywu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"b", "c", ywt.class, "d"});
        }
        if (i2 == 3) {
            return new ywu();
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
        return abnv.L(ywu.class);
    }
}
