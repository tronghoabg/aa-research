package defpackage;

/* loaded from: classes3.dex */
public final class acce extends abnv implements abox {
    public static final acce a;

    static {
        acce acceVar = new acce();
        a = acceVar;
        abnv.P(acce.class, acceVar);
    }

    private acce() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new acce();
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
        return abnv.L(acce.class);
    }
}
