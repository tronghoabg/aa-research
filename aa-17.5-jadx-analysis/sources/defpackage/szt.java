package defpackage;

/* loaded from: classes3.dex */
public final class szt extends abnv implements abox {
    public static final szt a;

    static {
        szt sztVar = new szt();
        a = sztVar;
        abnv.P(szt.class, sztVar);
    }

    private szt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new szt();
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
        return abnv.L(szt.class);
    }
}
