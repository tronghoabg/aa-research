package defpackage;

/* loaded from: classes3.dex */
public final class acej extends abnv implements abox {
    public static final acej a;

    static {
        acej acejVar = new acej();
        a = acejVar;
        abnv.P(acej.class, acejVar);
    }

    private acej() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new acej();
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
        return abnv.L(acej.class);
    }
}
