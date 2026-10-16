package defpackage;

/* loaded from: classes3.dex */
public final class tav extends abnv implements abox {
    public static final tav a;
    public int b;
    public orn c;
    public ork d;
    public szm e;
    public boolean f;
    public tad g;

    static {
        tav tavVar = new tav();
        a = tavVar;
        abnv.P(tav.class, tavVar);
    }

    private tav() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new tav();
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
        return abnv.L(tav.class);
    }
}
