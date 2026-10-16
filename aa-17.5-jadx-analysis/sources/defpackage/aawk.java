package defpackage;

/* loaded from: classes3.dex */
public final class aawk extends abnv implements abox {
    public static final aawk a;

    static {
        aawk aawkVar = new aawk();
        a = aawkVar;
        abnv.P(aawk.class, aawkVar);
    }

    private aawk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aawk();
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
        return abnv.L(aawk.class);
    }
}
