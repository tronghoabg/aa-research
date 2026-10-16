package defpackage;

/* loaded from: classes2.dex */
public final class otz extends abnv implements abox {
    public static final otz a;
    public int b;
    public int c;
    public abnf d;
    public abnf e;
    public abnf f;
    public abnf g;
    public abnf h;

    static {
        otz otzVar = new otz();
        a = otzVar;
        abnv.P(otz.class, otzVar);
    }

    private otz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new otz();
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
        return abnv.L(otz.class);
    }
}
