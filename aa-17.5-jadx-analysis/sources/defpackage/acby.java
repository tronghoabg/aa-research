package defpackage;

/* loaded from: classes3.dex */
public final class acby extends abnv implements abox {
    public static final acby a;

    static {
        acby acbyVar = new acby();
        a = acbyVar;
        abnv.P(acby.class, acbyVar);
    }

    private acby() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new acby();
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
        return abnv.L(acby.class);
    }
}
