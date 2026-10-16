package defpackage;

/* loaded from: classes2.dex */
public final class oua extends abnv implements abox {
    public static final oua a;
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;
    public double g;
    public double h;

    static {
        oua ouaVar = new oua();
        a = ouaVar;
        abnv.P(oua.class, ouaVar);
    }

    private oua() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005က\u0004\u0006က\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new oua();
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
        return abnv.L(oua.class);
    }
}
