package defpackage;

/* loaded from: classes2.dex */
public final class oth extends abnv implements abox {
    public static final oth a;
    public static final abnh c;
    public aboh b = abpf.b;

    static {
        oth othVar = new oth();
        a = othVar;
        abnv.P(oth.class, othVar);
        c = abnv.W(osn.a, othVar, othVar, null, 106, abqd.MESSAGE);
    }

    private oth() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", orz.class});
        }
        if (i2 == 3) {
            return new oth();
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
        return abnv.L(oth.class);
    }
}
