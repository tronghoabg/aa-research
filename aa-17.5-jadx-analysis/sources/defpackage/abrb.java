package defpackage;

/* loaded from: classes3.dex */
public final class abrb extends abnv implements abox {
    public static final abrb a;
    public String b = "";
    public String c = "";
    private int d;

    static {
        abrb abrbVar = new abrb();
        a = abrbVar;
        abnv.P(abrb.class, abrbVar);
    }

    private abrb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new abrb();
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
        return abnv.L(abrb.class);
    }
}
