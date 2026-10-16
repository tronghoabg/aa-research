package defpackage;

/* loaded from: classes2.dex */
public final class ajgb extends abnv implements abox {
    public static final ajgb a;
    public int b;
    public String c = "";

    static {
        ajgb ajgbVar = new ajgb();
        a = ajgbVar;
        abnv.P(ajgb.class, ajgbVar);
    }

    private ajgb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ajgb();
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
        return abnv.L(ajgb.class);
    }
}
