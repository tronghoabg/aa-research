package defpackage;

/* loaded from: classes.dex */
public final class wbi extends abnv implements abox {
    public static final wbi a;
    public boolean b;
    private int c;

    static {
        wbi wbiVar = new wbi();
        a = wbiVar;
        abnv.P(wbi.class, wbiVar);
    }

    private wbi() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new wbi();
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
        return abnv.L(wbi.class);
    }
}
