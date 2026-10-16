package defpackage;

/* loaded from: classes3.dex */
public final class aate extends abnv implements abox {
    public static final aate a;
    public boolean b;
    private int c;

    static {
        aate aateVar = new aate();
        a = aateVar;
        abnv.P(aate.class, aateVar);
    }

    private aate() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0002", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new aate();
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
        return abnv.L(aate.class);
    }
}
