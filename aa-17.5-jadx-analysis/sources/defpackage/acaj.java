package defpackage;

/* loaded from: classes3.dex */
public final class acaj extends abnv implements abox {
    public static final acaj a;
    public int b;
    public float c;
    public int d;
    public int e;
    public int f;

    static {
        acaj acajVar = new acaj();
        a = acajVar;
        abnv.P(acaj.class, acajVar);
    }

    private acaj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new acaj();
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
        return abnv.L(acaj.class);
    }
}
