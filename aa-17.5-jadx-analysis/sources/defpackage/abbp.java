package defpackage;

/* loaded from: classes3.dex */
public final class abbp extends abnv implements abox {
    public static final abbp a;

    static {
        abbp abbpVar = new abbp();
        a = abbpVar;
        abnv.P(abbp.class, abbpVar);
    }

    private abbp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new abbp();
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
        return abnv.L(abbp.class);
    }
}
