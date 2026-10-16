package defpackage;

/* loaded from: classes3.dex */
public final class xlr extends abnv implements abox {
    public static final xlr a;
    public int b;
    public xlg c;
    public xlj d;
    public aboh e = abpf.b;
    public xkz f;

    static {
        xlr xlrVar = new xlr();
        a = xlrVar;
        abnv.P(xlr.class, xlrVar);
    }

    private xlr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e", xlf.class, "f"});
        }
        if (i2 == 3) {
            return new xlr();
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
        return abnv.L(xlr.class);
    }
}
