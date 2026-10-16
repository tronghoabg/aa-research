package defpackage;

/* loaded from: classes3.dex */
public final class abwb extends abnv implements abox {
    public static final abwb a;
    public int b;
    public abwa c;

    static {
        abwb abwbVar = new abwb();
        a = abwbVar;
        abnv.P(abwb.class, abwbVar);
    }

    private abwb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abwb();
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
        return abnv.L(abwb.class);
    }
}
