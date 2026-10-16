package defpackage;

/* loaded from: classes2.dex */
public final class orr extends abnv implements abox {
    public static final orr a;
    public int b;
    public boolean c;

    static {
        orr orrVar = new orr();
        a = orrVar;
        abnv.P(orr.class, orrVar);
    }

    private orr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new orr();
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
        return abnv.L(orr.class);
    }
}
