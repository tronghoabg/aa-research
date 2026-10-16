package defpackage;

/* loaded from: classes.dex */
public final class adcg extends abnv implements abox {
    public static final adcg a;
    public int b = 0;
    public Object c;

    static {
        adcg adcgVar = new adcg();
        a = adcgVar;
        abnv.P(adcg.class, adcgVar);
    }

    private adcg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002:\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new adcg();
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
        return abnv.L(adcg.class);
    }
}
