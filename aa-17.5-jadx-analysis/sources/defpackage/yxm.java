package defpackage;

/* loaded from: classes.dex */
public final class yxm extends abnv implements abox {
    public static final yxm a;
    public int b;
    public long c;
    public int d;
    public long e;
    public yxl f;
    public int g;

    static {
        yxm yxmVar = new yxm();
        a = yxmVar;
        abnv.P(yxm.class, yxmVar);
    }

    private yxm() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0003င\u0002\u0005ဂ\u0003\u0006ဉ\u0004\u0007င\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new yxm();
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
        return abnv.L(yxm.class);
    }
}
