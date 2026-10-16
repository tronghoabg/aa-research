package defpackage;

/* loaded from: classes3.dex */
public final class achd extends abnv implements abox {
    public static final achd a;

    static {
        achd achdVar = new achd();
        a = achdVar;
        abnv.P(achd.class, achdVar);
    }

    private achd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new achd();
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
        return abnv.L(achd.class);
    }
}
