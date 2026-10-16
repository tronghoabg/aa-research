package defpackage;

/* loaded from: classes3.dex */
public final class aair extends abnv implements abox {
    public static final aair a;

    static {
        aair aairVar = new aair();
        a = aairVar;
        abnv.P(aair.class, aairVar);
    }

    private aair() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aair();
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
        return abnv.L(aair.class);
    }
}
