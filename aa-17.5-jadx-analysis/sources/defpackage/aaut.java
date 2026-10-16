package defpackage;

/* loaded from: classes3.dex */
public final class aaut extends abnv implements abox {
    public static final aaut a;
    public boolean b;
    private int c;

    static {
        aaut aautVar = new aaut();
        a = aautVar;
        abnv.P(aaut.class, aautVar);
    }

    private aaut() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new aaut();
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
        return abnv.L(aaut.class);
    }
}
