package defpackage;

/* loaded from: classes3.dex */
public final class acem extends abnv implements abox {
    public static final acem a;

    static {
        acem acemVar = new acem();
        a = acemVar;
        abnv.P(acem.class, acemVar);
    }

    private acem() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new acem();
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
        return abnv.L(acem.class);
    }
}
