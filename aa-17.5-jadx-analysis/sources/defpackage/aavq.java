package defpackage;

/* loaded from: classes3.dex */
public final class aavq extends abnv implements abox {
    public static final aavq a;

    static {
        aavq aavqVar = new aavq();
        a = aavqVar;
        abnv.P(aavq.class, aavqVar);
    }

    private aavq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aavq();
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
        return abnv.L(aavq.class);
    }
}
