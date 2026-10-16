package defpackage;

/* loaded from: classes.dex */
public final class yyh extends abnv implements abox {
    public static final yyh a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public long h;

    static {
        yyh yyhVar = new yyh();
        a = yyhVar;
        abnv.P(yyh.class, yyhVar);
    }

    private yyh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new yyh();
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
        return abnv.L(yyh.class);
    }
}
