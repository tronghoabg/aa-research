package defpackage;

/* loaded from: classes3.dex */
public final class abyh extends abnv implements abox {
    public static final abyh a;
    public int b;
    public int c;

    static {
        abyh abyhVar = new abyh();
        a = abyhVar;
        abnv.P(abyh.class, abyhVar);
    }

    private abyh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abyh();
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
        return abnv.L(abyh.class);
    }
}
