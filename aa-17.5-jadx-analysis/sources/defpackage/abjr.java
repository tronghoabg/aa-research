package defpackage;

/* loaded from: classes3.dex */
public final class abjr extends abnv implements abox {
    public static final abjr a;
    public int b;
    public abhl c;
    public long d;
    private int e;

    static {
        abjr abjrVar = new abjr();
        a = abjrVar;
        abnv.P(abjr.class, abjrVar);
    }

    private abjr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဃ\u0002", new Object[]{"e", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new abjr();
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
        return abnv.L(abjr.class);
    }
}
