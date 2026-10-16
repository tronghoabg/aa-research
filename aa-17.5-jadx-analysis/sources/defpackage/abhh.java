package defpackage;

/* loaded from: classes3.dex */
public final class abhh extends abnv implements abox {
    public static final abhh a;
    public int b;
    public abhm c;

    static {
        abhh abhhVar = new abhh();
        a = abhhVar;
        abnv.P(abhh.class, abhhVar);
    }

    private abhh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0000\rဉ\u0007", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abhh();
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
        return abnv.L(abhh.class);
    }
}
