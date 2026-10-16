package defpackage;

/* loaded from: classes.dex */
public final class yww extends abnv implements abox {
    public static final yww a;
    public int b;
    public long c;
    public boolean d;

    static {
        yww ywwVar = new yww();
        a = ywwVar;
        abnv.P(yww.class, ywwVar);
    }

    private yww() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new yww();
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
        return abnv.L(yww.class);
    }
}
