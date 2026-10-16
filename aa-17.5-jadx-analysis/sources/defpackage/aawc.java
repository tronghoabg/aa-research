package defpackage;

/* loaded from: classes3.dex */
public final class aawc extends abnv implements abox {
    public static final aawc a;

    static {
        aawc aawcVar = new aawc();
        a = aawcVar;
        abnv.P(aawc.class, aawcVar);
    }

    private aawc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aawc();
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
        return abnv.L(aawc.class);
    }
}
