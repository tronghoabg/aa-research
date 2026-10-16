package defpackage;

/* loaded from: classes3.dex */
public final class aazt extends abnv implements abox {
    public static final aazt a;
    public int b;
    public String c = "";
    public int d;

    static {
        aazt aaztVar = new aazt();
        a = aaztVar;
        abnv.P(aazt.class, aaztVar);
    }

    private aazt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဏ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aazt();
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
        return abnv.L(aazt.class);
    }
}
