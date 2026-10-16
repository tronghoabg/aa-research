package defpackage;

/* loaded from: classes2.dex */
public final class ajev extends abnv implements abox {
    public static final ajev a;
    public int b;
    public double c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        ajev ajevVar = new ajev();
        a = ajevVar;
        abnv.P(ajev.class, ajevVar);
    }

    private ajev() {
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0003\u0007\u0005\u0000\u0000\u0000\u0003က\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new ajev();
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
        return abnv.L(ajev.class);
    }
}
