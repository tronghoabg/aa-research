package defpackage;

/* loaded from: classes3.dex */
public final class absb extends abnv implements abox {
    public static final absb a;

    static {
        absb absbVar = new absb();
        a = absbVar;
        abnv.P(absb.class, absbVar);
    }

    private absb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new absb();
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
        return abnv.L(absb.class);
    }
}
