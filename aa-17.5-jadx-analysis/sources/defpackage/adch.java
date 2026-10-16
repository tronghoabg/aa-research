package defpackage;

/* loaded from: classes.dex */
public final class adch extends abnv implements abox {
    public static final adch a;
    public int b;
    public adcg c;
    public adcg d;
    public abot e = abot.a;

    static {
        adch adchVar = new adch();
        a = adchVar;
        abnv.P(adch.class, adchVar);
    }

    private adch() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u00032", new Object[]{"b", "c", "d", "e", new lds(abqd.STRING, "", abqd.MESSAGE, adcg.a)});
        }
        if (i2 == 3) {
            return new adch();
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
        return abnv.L(adch.class);
    }
}
