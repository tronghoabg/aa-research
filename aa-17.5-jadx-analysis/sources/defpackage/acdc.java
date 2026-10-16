package defpackage;

/* loaded from: classes3.dex */
public final class acdc extends abnv implements abox {
    public static final acdc a;

    static {
        acdc acdcVar = new acdc();
        a = acdcVar;
        abnv.P(acdc.class, acdcVar);
    }

    private acdc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new acdc();
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
        return abnv.L(acdc.class);
    }
}
