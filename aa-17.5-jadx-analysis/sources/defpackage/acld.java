package defpackage;

/* loaded from: classes3.dex */
public final class acld extends abnv implements abox {
    public static final acld a;
    public boolean b;

    static {
        acld acldVar = new acld();
        a = acldVar;
        abnv.P(acld.class, acldVar);
    }

    private acld() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new acld();
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
        return abnv.L(acld.class);
    }
}
