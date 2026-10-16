package defpackage;

/* loaded from: classes2.dex */
public final class osz extends abnv implements abox {
    public static final osz a;
    public static final abnh b;

    static {
        osz oszVar = new osz();
        a = oszVar;
        abnv.P(osz.class, oszVar);
        b = abnv.W(osn.a, oszVar, oszVar, null, 112, abqd.MESSAGE);
    }

    private osz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new osz();
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
        return abnv.L(osz.class);
    }
}
