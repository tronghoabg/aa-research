package defpackage;

/* loaded from: classes3.dex */
public final class abjh extends abnv implements abox {
    public static final abjh a;
    public abju b;
    public int c;
    public int d;
    private int e;

    static {
        abjh abjhVar = new abjh();
        a = abjhVar;
        abnv.P(abjh.class, abjhVar);
    }

    private abjh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဆ\u0001\u0003ဆ\u0002", new Object[]{"e", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new abjh();
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
        return abnv.L(abjh.class);
    }
}
