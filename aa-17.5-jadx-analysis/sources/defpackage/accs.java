package defpackage;

/* loaded from: classes3.dex */
public final class accs extends abnv implements abox {
    public static final accs a;
    private int b;
    private aapc c;

    static {
        accs accsVar = new accs();
        a = accsVar;
        abnv.P(accs.class, accsVar);
    }

    private accs() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0000\u000bဉ\n", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new accs();
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
        return abnv.L(accs.class);
    }
}
