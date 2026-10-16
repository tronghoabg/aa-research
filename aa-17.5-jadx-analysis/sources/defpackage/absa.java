package defpackage;

/* loaded from: classes3.dex */
public final class absa extends abnv implements abox {
    public static final absa a;
    public String b = "";

    static {
        absa absaVar = new absa();
        a = absaVar;
        abnv.P(absa.class, absaVar);
    }

    private absa() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new absa();
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
        return abnv.L(absa.class);
    }
}
