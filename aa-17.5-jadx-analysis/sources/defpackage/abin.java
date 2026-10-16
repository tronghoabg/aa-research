package defpackage;

/* loaded from: classes3.dex */
public final class abin extends abnv implements abox {
    public static final abin a;
    public long b;
    private int c;

    static {
        abin abinVar = new abin();
        a = abinVar;
        abnv.P(abin.class, abinVar);
    }

    private abin() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new abin();
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
        return abnv.L(abin.class);
    }
}
