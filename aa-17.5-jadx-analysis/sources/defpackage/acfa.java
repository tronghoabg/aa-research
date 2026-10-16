package defpackage;

/* loaded from: classes3.dex */
public final class acfa extends abnv implements abox {
    public static final acfa a;
    private int b;
    private aapc c;

    static {
        acfa acfaVar = new acfa();
        a = acfaVar;
        abnv.P(acfa.class, acfaVar);
    }

    private acfa() {
        abms abmsVar = abms.d;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0005", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new acfa();
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
        return abnv.L(acfa.class);
    }
}
