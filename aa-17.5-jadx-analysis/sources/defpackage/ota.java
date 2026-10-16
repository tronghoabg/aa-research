package defpackage;

/* loaded from: classes2.dex */
public final class ota extends abnv implements abox {
    public static final ota a;
    public static final abnh b;

    static {
        ota otaVar = new ota();
        a = otaVar;
        abnv.P(ota.class, otaVar);
        b = abnv.W(osn.a, otaVar, otaVar, null, 110, abqd.MESSAGE);
    }

    private ota() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new ota();
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
        return abnv.L(ota.class);
    }
}
