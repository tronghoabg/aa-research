package defpackage;

/* loaded from: classes3.dex */
public final class tah extends abnv implements abox {
    public static final tah a;
    public aboh b = abpf.b;

    static {
        tah tahVar = new tah();
        a = tahVar;
        abnv.P(tah.class, tahVar);
    }

    private tah() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", orz.class});
        }
        if (i2 == 3) {
            return new tah();
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
        return abnv.L(tah.class);
    }
}
