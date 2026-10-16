package defpackage;

/* loaded from: classes3.dex */
public final class abrq extends abnv implements abox {
    public static final abrq a;
    public abot c = abot.a;
    public aboh b = abpf.b;

    static {
        abrq abrqVar = new abrq();
        a = abrqVar;
        abnv.P(abrq.class, abrqVar);
    }

    private abrq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0001\u0000\u0001\u001b\u00022", new Object[]{"b", abrp.class, "c", new lds(abqd.STRING, "", abqd.MESSAGE, abro.a)});
        }
        if (i2 == 3) {
            return new abrq();
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
        return abnv.L(abrq.class);
    }
}
