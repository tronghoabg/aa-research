package defpackage;

/* loaded from: classes3.dex */
public final class acfl extends abnv implements abox {
    public static final acfl a;

    static {
        acfl acflVar = new acfl();
        a = acflVar;
        abnv.P(acfl.class, acflVar);
    }

    private acfl() {
        Object[] objArr = abpf.a;
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new acfl();
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
        return abnv.L(acfl.class);
    }
}
