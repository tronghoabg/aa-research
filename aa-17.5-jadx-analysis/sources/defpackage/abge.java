package defpackage;

/* loaded from: classes3.dex */
public final class abge extends abnv implements abox {
    public static final abge a;
    public static final abnh c;
    public aboh b = abpf.b;

    static {
        abge abgeVar = new abge();
        a = abgeVar;
        abnv.P(abge.class, abgeVar);
        c = abnv.W(abuf.a, abgeVar, abgeVar, null, 12145669, abqd.MESSAGE);
    }

    private abge() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"b", abgb.class});
        }
        if (i2 == 3) {
            return new abge();
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
        return abnv.L(abge.class);
    }
}
