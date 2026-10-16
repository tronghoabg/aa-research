package defpackage;

/* loaded from: classes3.dex */
public final class aart extends abnv implements abox {
    public static final aart a;
    private int b;
    private aauc c;
    private aaue d;

    static {
        aart aartVar = new aart();
        a = aartVar;
        abnv.P(aart.class, aartVar);
    }

    private aart() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\n\u0002\u0000\u0000\u0000\u0001ဉ\u0000\nဉ\t", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aart();
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
        return abnv.L(aart.class);
    }
}
