package defpackage;

/* loaded from: classes3.dex */
public final class abej extends abnv implements abox {
    public static final abej a;
    public int b;
    public long c;
    public abat d;

    static {
        abej abejVar = new abej();
        a = abejVar;
        abnv.P(abej.class, abejVar);
    }

    private abej() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abej();
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
        return abnv.L(abej.class);
    }
}
