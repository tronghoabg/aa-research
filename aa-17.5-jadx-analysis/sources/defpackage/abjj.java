package defpackage;

/* loaded from: classes3.dex */
public final class abjj extends abnv implements abox {
    public static final abjj a;
    public boolean b;
    private int c;

    static {
        abjj abjjVar = new abjj();
        a = abjjVar;
        abnv.P(abjj.class, abjjVar);
    }

    private abjj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new abjj();
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
        return abnv.L(abjj.class);
    }
}
