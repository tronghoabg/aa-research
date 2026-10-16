package defpackage;

/* loaded from: classes3.dex */
public final class abzd extends abnv implements abox {
    public static final abzd a;
    public int b;
    public abxm c;
    public int d;

    static {
        abzd abzdVar = new abzd();
        a = abzdVar;
        abnv.P(abzd.class, abzdVar);
    }

    private abzd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abzd();
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
        return abnv.L(abzd.class);
    }
}
