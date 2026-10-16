package defpackage;

/* loaded from: classes3.dex */
public final class acdd extends abnv implements abox {
    public static final acdd a;

    static {
        acdd acddVar = new acdd();
        a = acddVar;
        abnv.P(acdd.class, acddVar);
    }

    private acdd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new acdd();
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
        return abnv.L(acdd.class);
    }
}
