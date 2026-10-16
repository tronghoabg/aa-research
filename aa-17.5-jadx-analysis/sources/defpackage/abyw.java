package defpackage;

/* loaded from: classes3.dex */
public final class abyw extends abnv implements abox {
    public static final abyw a;
    public String b = "";
    public String c = "";

    static {
        abyw abywVar = new abyw();
        a = abywVar;
        abnv.P(abyw.class, abywVar);
    }

    private abyw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abyw();
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
        return abnv.L(abyw.class);
    }
}
