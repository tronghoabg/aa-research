package defpackage;

/* loaded from: classes.dex */
public final class tae extends abnv implements abox {
    public static final tae a;

    static {
        tae taeVar = new tae();
        a = taeVar;
        abnv.P(tae.class, taeVar);
    }

    private tae() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new tae();
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
        return abnv.L(tae.class);
    }
}
