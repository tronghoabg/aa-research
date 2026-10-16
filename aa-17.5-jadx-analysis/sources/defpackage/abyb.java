package defpackage;

/* loaded from: classes3.dex */
public final class abyb extends abnv implements abox {
    public static final abyb a;
    public int b;
    public abyc c;

    static {
        abyb abybVar = new abyb();
        a = abybVar;
        abnv.P(abyb.class, abybVar);
    }

    private abyb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abyb();
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
        return abnv.L(abyb.class);
    }
}
