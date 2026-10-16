package defpackage;

/* loaded from: classes2.dex */
public final class ost extends abnv implements abox {
    public static final ost a;

    static {
        ost ostVar = new ost();
        a = ostVar;
        abnv.P(ost.class, ostVar);
    }

    private ost() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new ost();
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
        return abnv.L(ost.class);
    }
}
