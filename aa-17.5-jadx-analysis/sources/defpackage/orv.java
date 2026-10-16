package defpackage;

/* loaded from: classes2.dex */
public final class orv extends abnv implements abox {
    public static final orv a;
    public int b = 0;
    public Object c;

    static {
        orv orvVar = new orv();
        a = orvVar;
        abnv.P(orv.class, orvVar);
    }

    private orv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001:\u0000\u0002:\u0000\u0003<\u0000\u0004:\u0000", new Object[]{"c", "b", oru.class});
        }
        if (i2 == 3) {
            return new orv();
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
        return abnv.L(orv.class);
    }
}
