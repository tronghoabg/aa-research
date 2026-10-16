package defpackage;

/* loaded from: classes.dex */
public final class yzh extends abnv implements abox {
    public static final yzh a;
    public int b;
    public yzi c;

    static {
        yzh yzhVar = new yzh();
        a = yzhVar;
        abnv.P(yzh.class, yzhVar);
    }

    private yzh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new yzh();
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
        return abnv.L(yzh.class);
    }
}
