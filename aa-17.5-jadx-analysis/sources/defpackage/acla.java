package defpackage;

/* loaded from: classes3.dex */
public final class acla extends abnv implements abox {
    public static final acla a;

    static {
        acla aclaVar = new acla();
        a = aclaVar;
        abnv.P(acla.class, aclaVar);
    }

    private acla() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new acla();
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
        return abnv.L(acla.class);
    }
}
