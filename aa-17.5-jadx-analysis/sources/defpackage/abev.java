package defpackage;

/* loaded from: classes3.dex */
public final class abev extends abnv implements abox {
    public static final abev a;
    public int b;
    public abex c;
    public abex d;
    public abex e;

    static {
        abev abevVar = new abev();
        a = abevVar;
        abnv.P(abev.class, abevVar);
    }

    private abev() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abev();
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
        return abnv.L(abev.class);
    }
}
