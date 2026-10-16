package defpackage;

/* loaded from: classes3.dex */
public final class aasa extends abnv implements abox {
    public static final aasa a;

    static {
        aasa aasaVar = new aasa();
        a = aasaVar;
        abnv.P(aasa.class, aasaVar);
    }

    private aasa() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aasa();
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
        return abnv.L(aasa.class);
    }
}
