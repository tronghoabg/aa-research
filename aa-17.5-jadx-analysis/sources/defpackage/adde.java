package defpackage;

/* loaded from: classes3.dex */
public final class adde extends abnv implements abox {
    public static final adde a;
    public static final abnh f;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        adde addeVar = new adde();
        a = addeVar;
        abnv.P(adde.class, addeVar);
        f = abnv.W(zhq.a, addeVar, addeVar, null, 525000021, abqd.MESSAGE);
    }

    private adde() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u00027\u0000\u0003<\u0000", new Object[]{"d", "c", "b", "e", addd.class});
        }
        if (i2 == 3) {
            return new adde();
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
        return abnv.L(adde.class);
    }
}
