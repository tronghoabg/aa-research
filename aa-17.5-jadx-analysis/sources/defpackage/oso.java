package defpackage;

/* loaded from: classes2.dex */
public final class oso extends abnv implements abox {
    public static final oso a;
    public int b;
    public int c;

    static {
        oso osoVar = new oso();
        a = osoVar;
        abnv.P(oso.class, osoVar);
    }

    private oso() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new oso();
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
        return abnv.L(oso.class);
    }
}
