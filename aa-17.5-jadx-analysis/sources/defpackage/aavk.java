package defpackage;

/* loaded from: classes3.dex */
public final class aavk extends abnv implements abox {
    public static final aavk a;

    static {
        aavk aavkVar = new aavk();
        a = aavkVar;
        abnv.P(aavk.class, aavkVar);
    }

    private aavk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new aavk();
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
        return abnv.L(aavk.class);
    }
}
