package defpackage;

/* loaded from: classes3.dex */
public final class upz extends abnv implements abox {
    public static final upz a;
    public int b;
    public boolean c;
    public boolean d;

    static {
        upz upzVar = new upz();
        a = upzVar;
        abnv.P(upz.class, upzVar);
    }

    private upz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new upz();
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
        return abnv.L(upz.class);
    }
}
