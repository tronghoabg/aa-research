package defpackage;

/* loaded from: classes3.dex */
public final class acep extends abnv implements abox {
    public static final acep a;

    static {
        acep acepVar = new acep();
        a = acepVar;
        abnv.P(acep.class, acepVar);
    }

    private acep() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new acep();
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
        return abnv.L(acep.class);
    }
}
