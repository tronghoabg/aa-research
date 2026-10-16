package defpackage;

/* loaded from: classes3.dex */
public final class abvt extends abnv implements abox {
    public static final abvt a;
    public int b;
    public abvs c;
    public String d = "";

    static {
        abvt abvtVar = new abvt();
        a = abvtVar;
        abnv.P(abvt.class, abvtVar);
    }

    private abvt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abvt();
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
        return abnv.L(abvt.class);
    }
}
