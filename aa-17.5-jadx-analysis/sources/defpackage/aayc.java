package defpackage;

/* loaded from: classes3.dex */
public final class aayc extends abnv implements abox {
    public static final aayc a;

    static {
        aayc aaycVar = new aayc();
        a = aaycVar;
        abnv.P(aayc.class, aaycVar);
    }

    private aayc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aayc();
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
        return abnv.L(aayc.class);
    }
}
