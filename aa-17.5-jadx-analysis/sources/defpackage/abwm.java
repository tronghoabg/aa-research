package defpackage;

/* loaded from: classes3.dex */
public final class abwm extends abnv implements abox {
    public static final abwm a;
    public int b;
    public int c;

    static {
        abwm abwmVar = new abwm();
        a = abwmVar;
        abnv.P(abwm.class, abwmVar);
    }

    private abwm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abwm();
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
        return abnv.L(abwm.class);
    }
}
