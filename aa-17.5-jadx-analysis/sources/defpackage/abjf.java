package defpackage;

/* loaded from: classes3.dex */
public final class abjf extends abnv implements abox {
    public static final abjf a;
    public boolean b;
    private int c;

    static {
        abjf abjfVar = new abjf();
        a = abjfVar;
        abnv.P(abjf.class, abjfVar);
    }

    private abjf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new abjf();
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
        return abnv.L(abjf.class);
    }
}
