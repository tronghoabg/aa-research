package defpackage;

/* loaded from: classes3.dex */
public final class acbq extends abnv implements abox {
    public static final acbq a;
    public int b;
    public int c;

    static {
        acbq acbqVar = new acbq();
        a = acbqVar;
        abnv.P(acbq.class, acbqVar);
    }

    private acbq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new acbq();
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
        return abnv.L(acbq.class);
    }
}
