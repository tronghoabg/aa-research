package defpackage;

/* loaded from: classes3.dex */
public final class wbn extends abnv implements abox {
    public static final wbn a;
    public int b;
    public wbj c;
    public wbl d;

    static {
        wbn wbnVar = new wbn();
        a = wbnVar;
        abnv.P(wbn.class, wbnVar);
    }

    private wbn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new wbn();
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
        return abnv.L(wbn.class);
    }
}
