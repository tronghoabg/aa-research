package defpackage;

/* loaded from: classes3.dex */
public final class acea extends abnv implements abox {
    public static final acea a;

    static {
        acea aceaVar = new acea();
        a = aceaVar;
        abnv.P(acea.class, aceaVar);
    }

    private acea() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new acea();
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
        return abnv.L(acea.class);
    }
}
