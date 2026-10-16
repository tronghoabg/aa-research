package defpackage;

/* loaded from: classes3.dex */
public final class acho extends abnv implements abox {
    public static final acho a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean g;
    public abod f = abnw.a;
    public boolean h = true;

    static {
        acho achoVar = new acho();
        a = achoVar;
        abnv.P(acho.class, achoVar);
    }

    private acho() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0012\u0006\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0010ࠞ\u0011ဇ\u0003\u0012ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", achi.c, "g", "h"});
        }
        if (i2 == 3) {
            return new acho();
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
        return abnv.L(acho.class);
    }
}
