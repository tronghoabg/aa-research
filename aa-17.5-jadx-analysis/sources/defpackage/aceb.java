package defpackage;

/* loaded from: classes3.dex */
public final class aceb extends abnv implements abox {
    public static final aceb a;

    static {
        aceb acebVar = new aceb();
        a = acebVar;
        abnv.P(aceb.class, acebVar);
    }

    private aceb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new aceb();
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
        return abnv.L(aceb.class);
    }
}
