package defpackage;

/* loaded from: classes3.dex */
public final class aayt extends abnv implements abox {
    public static final aayt a;

    static {
        aayt aaytVar = new aayt();
        a = aaytVar;
        abnv.P(aayt.class, aaytVar);
    }

    private aayt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new aayt();
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
        return abnv.L(aayt.class);
    }
}
