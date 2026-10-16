package defpackage;

/* loaded from: classes3.dex */
public final class acew extends abnv implements abox {
    public static final acew a;
    private int b;
    private aapc c;

    static {
        acew acewVar = new acew();
        a = acewVar;
        abnv.P(acew.class, acewVar);
    }

    private acew() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new acew();
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
        return abnv.L(acew.class);
    }
}
