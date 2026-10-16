package defpackage;

/* loaded from: classes3.dex */
public final class aati extends abnv implements abox {
    public static final aati a;

    static {
        aati aatiVar = new aati();
        a = aatiVar;
        abnv.P(aati.class, aatiVar);
    }

    private aati() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aati();
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
        return abnv.L(aati.class);
    }
}
