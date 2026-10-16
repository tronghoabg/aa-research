package defpackage;

/* loaded from: classes3.dex */
public final class zpf extends abnv implements abox {
    public static final zpf a;
    public abms b = abms.d;

    static {
        zpf zpfVar = new zpf();
        a = zpfVar;
        abnv.P(zpf.class, zpfVar);
    }

    private zpf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new zpf();
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
        return abnv.L(zpf.class);
    }
}
